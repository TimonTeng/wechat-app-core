package com.d.t.redis.converter;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisRepositoryTemplate<K,V> {
 
    
    @Bean
    public RedisTemplate<K, V> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<K, V> template = new RedisTemplate<K, V>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new RedisObjectSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }
 
}
