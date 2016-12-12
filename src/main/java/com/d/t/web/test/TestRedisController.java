package com.d.t.web.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.d.t.model.db.TSysUser;
import com.d.t.web.BaseController;

@RestController
public class TestRedisController extends BaseController {
 
	@Autowired
	private RedisTemplate<String, TSysUser> redisTemplate;
 
	
	@RequestMapping(value="/redis/testKeySet")
	public void testKeySet(String key, String value){
		TSysUser user = new TSysUser();
		user.setAccount("admin");
		user.setPassword("abc");
		redisTemplate.opsForValue().set(user.getAccount(), user);
		
		TSysUser admin = redisTemplate.opsForValue().get(user.getAccount());
		System.out.println(JSON.toJSON(admin));
	}
}
