package com.d.t.interceptor;

 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.d.t.model.ModelConstant;
import com.d.t.model.ResultCode;
import com.d.t.model.json.BaseResponseJson;
import com.d.t.model.json.JwtJson;
import com.d.t.utils.JwtUtil;

public class SysUserAccessApiInterceptor implements HandlerInterceptor {
	
	private final Logger log = LogManager.getLogger(getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getHeader(ModelConstant.SYS_HEADER_KEY_USER_TOKEN);
		String id = request.getHeader(ModelConstant.SYS_HEADER_KEY_USER_ID);
		JwtJson jwt = JwtUtil.decode(token);
		if (ResultCode.TOKEN_CODE_SUCCE.equals(jwt.getCode())
				&& jwt.getId().equals(id)) {
			return true;
		}
		
		BaseResponseJson res = new BaseResponseJson();
		res.setCode(jwt.getCode());
		res.setMsg(jwt.getMsg());
		if(!StringUtils.isEmpty(id) && !jwt.getId().equals(id)){
			res.setCode(ResultCode.TOKEN_CODE_ID);
			res.setMsg(ResultCode.TOKEN_DESC_ID);
		}

		response.setHeader(ModelConstant.SYS_HEADER_KEY_MSG, res.toString());
		request.getRequestDispatcher("/error").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info(" SysUserAccessApiInterceptor.postHandle ");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info(" SysUserAccessApiInterceptor.afterCompletion ");
	}

 
 
}
