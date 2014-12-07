package com.sdong.spring.exception.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sdong.spring.exception.demo.exception.BusinessException;
import com.sdong.spring.exception.demo.exception.ParameterException;

public class BaseController {

	/** 基于@ExceptionHandler异常处理 */
	// (value = { BusinessException.class, ParameterException.class,
	// Exception.class})
	@ExceptionHandler
	public String exp(HttpServletRequest request, Exception ex) {

		request.setAttribute("ex", ex);

		// 根据不同错误转向不同页面
		if (ex instanceof BusinessException) {
			return "error-business";
		} else if (ex instanceof ParameterException) {
			return "error-parameter";
		} else {
			return "error";
		}
	}
}