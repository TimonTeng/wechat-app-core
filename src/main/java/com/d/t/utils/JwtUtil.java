package com.d.t.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.d.t.model.ResultCode;
import com.d.t.model.json.JwtJson;

public class JwtUtil {
	
	private static final long MINUTE = 1000L * 60L;
	
	private static final String SECRET = "timoncat@22:10:";
	
	/**
	 * @param subject 加密内容
	 * @param expirationMillis 到期时长 (单位:分) 
	 * @return
	 */
	public static String encode(String subject, String id, long expirationMillis){
		try {
			SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
			byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
			Key signingKey = new SecretKeySpec(apiKeySecretBytes,
					signatureAlgorithm.getJcaName());
			JwtBuilder builder = Jwts.builder();
			long nowMillis = System.currentTimeMillis();
			Date issuedAt = new Date(nowMillis);
			Date expiration = new Date(nowMillis + (MINUTE * expirationMillis));
			builder.setId(id);
			builder.setIssuedAt(issuedAt);
			builder.setExpiration(expiration);
			builder.setSubject(subject);
			builder.compressWith(CompressionCodecs.DEFLATE);
			builder.signWith(signatureAlgorithm, signingKey);
			return builder.compact();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 解密token
	 * @param token
	 * @return
	 */
	public static JwtJson decode(String token){
		
		JwtJson json = new JwtJson();
		json.setCode(ResultCode.TOKEN_CODE_FAIL);
		json.setMsg(ResultCode.TOKEN_DESC_FAIL);
		json.setToken(token);
		try {
			Claims claims = Jwts.parser()        
					   .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
					   .parseClaimsJws(token).getBody();
			String subject = claims.getSubject();
			Date issuedAt = claims.getIssuedAt();
			Date expiration = claims.getExpiration();
			String id = claims.getId();
			json.setId(id);
			json.setSubject(subject);
			json.setIssuedAt(issuedAt);
			json.setExpiration(expiration);
			json.setCode(ResultCode.TOKEN_CODE_SUCCE);
			json.setMsg(ResultCode.TOKEN_DESC_SUCCE);
			
		} catch (ExpiredJwtException e) {
			json.setCode(ResultCode.TOKEN_CODE_TIMEOUT);
			json.setMsg(ResultCode.TOKEN_DESC_TIMEOUT);
		} catch (UnsupportedJwtException e) {
			json.setCode(ResultCode.TOKEN_CODE_UNSUPPORT);
			json.setMsg(ResultCode.TOKEN_DESC_UNSUPPORT);
		} catch (MalformedJwtException e) {
			json.setCode(ResultCode.TOKEN_CODE_MALFORMED);
			json.setMsg(ResultCode.TOKEN_DESC_MALFORMED);
		} catch (SignatureException e) {
			json.setCode(ResultCode.TOKEN_CODE_SIGNATURE);
			json.setMsg(ResultCode.TOKEN_DESC_SIGNATURE);
		} catch (IllegalArgumentException e) {
			json.setCode(ResultCode.TOKEN_CODE_ILLEGALARGUMENT);
			json.setMsg(ResultCode.TOKEN_DESC_ILLEGALARGUMENT);
		} catch (CompressionException e) {
			json.setCode(ResultCode.TOKEN_CODE_PERMISSIONDENIED);
			json.setMsg(ResultCode.TOKEN_DESC_PERMISSIONDENIED);
		}
		return json;
	}
	
	/**
	 * token 超时
	 * @param issuedAt   发布时间
	 * @param expiration 到期时间
	 * @return
	 */
	public static boolean isTimeoutToken(Date expiration){
		long nowMillis = System.currentTimeMillis();
		long expirationMillis = expiration.getTime();
		if(nowMillis > expirationMillis){
			return true;
		}
		return false;
	}
 
}
