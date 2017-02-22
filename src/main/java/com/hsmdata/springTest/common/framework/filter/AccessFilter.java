package com.hsmdata.springTest.common.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessFilter extends HttpServlet implements Filter {

	private static final long serialVersionUID = 1L; 
	
	 private final Logger log = LoggerFactory.getLogger(AllInterceptor.class);  
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;  
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");  
        httpResponse.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");  
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");  
        
        System.out.println(request.getCharacterEncoding());
        
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8"); //设置编码格式
        response.setContentType("text/html");   //设置数据格式
        
        log.info("==============filter==============");
        chain.doFilter(request, httpResponse);

	}

}
