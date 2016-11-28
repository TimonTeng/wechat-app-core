package com.d.t.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {
	
	/**
	 * ThreadLocal确保高并发下每个请求的request，response都是独立的
	 */
	private static ThreadLocal<ServletRequest> currentRequest = new ThreadLocal<ServletRequest>();
	private static ThreadLocal<ServletResponse> currentResponse = new ThreadLocal<ServletResponse>();
	
	/**
	 * 线程安全初始化reque，respose对象
	 * @param request
	 * @param response
	 * @date 2015年11月24日
	 */
	@ModelAttribute
	public void initReqAndRep(HttpServletRequest request, HttpServletResponse response) {
		currentRequest.set(request);
		currentResponse.set(response);
	}
	
	/**
	 * 线程安全
	 * @return
	 * @date 2015年11月24日
	 */
	public HttpServletRequest request() {
		return (HttpServletRequest) currentRequest.get();
	}

	/**
	 * 线程安全
	 * @return
	 * @date 2015年11月24日
	 */
	public HttpServletResponse response() {
		return (HttpServletResponse) currentResponse.get();
	}
 
}
