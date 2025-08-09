package com.example.oliveyoung;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisPing implements CommandLineRunner {
    private final StringRedisTemplate redis;

    public RedisPing(StringRedisTemplate redis) { 
        this.redis = redis; 
    }

    @Override
    public void run(String... args) {
        try {
            redis.opsForValue().set("health:ping", "pong", java.time.Duration.ofMinutes(5));
            System.out.println("✅ Redis OK: " + redis.opsForValue().get("health:ping"));
        } catch (Exception e) {
            System.err.println("❌ Redis ERROR: " + e.getMessage());
        }
    }
}