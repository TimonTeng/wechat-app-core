package com.d.t.web;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.d.t.model.json.req.CheckTokenReqJson;
import com.d.t.model.json.req.CreateTokenReqJson;

public class BaseController implements ErrorController {
	
	private static final Key key = MacProvider.generateKey();

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@RequestMapping(value = "/sys/token/create")
	public String createToken(CreateTokenReqJson tokenReq){
		String subject = JSON.toJSONString(tokenReq);
		String compactJws = Jwts.builder()
				  .setSubject(subject)
				  .signWith(SignatureAlgorithm.HS512, key)
				  .compact();
		return compactJws;
	}
	
	@RequestMapping(value = "/sys/token/check")
	public String checkToken(CheckTokenReqJson checkReq){
		String subject = Jwts.parser().setSigningKey(key).parseClaimsJws(checkReq.getToken()).getBody().getSubject();
		return subject;
	}
	

}
