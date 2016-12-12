package com.d.t.redis.config;

import org.springframework.context.annotation.Configuration;

import com.d.t.model.db.TSysUser;
import com.d.t.redis.converter.RedisRepositoryTemplate;

@Configuration
public class SysUserRedisRepository extends RedisRepositoryTemplate<String, TSysUser> {

}
