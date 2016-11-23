package com.d.t.model;

public class ResultCode {
	
	public static final String SUCCE_CODE = "0000";
	
	public static final String SUCCE_DESC = "操作成功";
	
	public static final String FAIL_CODE = "0001";
	
	public static final String FAIL_DESC = "操作失败";
			
	
	/**
	 * token校验成功
	 */
	public static final String TOKEN_CODE_SUCCE = "1000";
	
	/**
	 * token校验失败
	 */
	public static final String TOKEN_CODE_FAIL = "1001";
	
	/**
	 * token已失效
	 */
	public static final String TOKEN_CODE_TIMEOUT = "1002";
	
	/**
	 * 不支持此token
	 */
	public static final String TOKEN_CODE_UNSUPPORT = "1003";
	
	/**
	 * 异常的token
	 */
	public static final String TOKEN_CODE_MALFORMED = "1004";
	
	/**
	 * 非法签名串
	 */
	public static final String TOKEN_CODE_SIGNATURE = "1005";
	
	/**
	 * token包含非法参数
	 */
	public static final String TOKEN_CODE_ILLEGALARGUMENT = "1006";
	
	public static final String TOKEN_CODE_PERMISSIONDENIED = "1007";
	
	public static final String TOKEN_DESC_SUCCE = "校验成功";
	
	public static final String TOKEN_DESC_FAIL = "校验失败";
	
	public static final String TOKEN_DESC_TIMEOUT = "已失效";
	
	public static final String TOKEN_DESC_UNSUPPORT = "不支持此token";
	
	public static final String TOKEN_DESC_MALFORMED = "异常的token";
	
	public static final String TOKEN_DESC_SIGNATURE = "非法签名串";
	
	public static final String TOKEN_DESC_ILLEGALARGUMENT = "token包含非法参数";
	
	public static final String TOKEN_DESC_PERMISSIONDENIED = "token编译失败";
	
	

}
