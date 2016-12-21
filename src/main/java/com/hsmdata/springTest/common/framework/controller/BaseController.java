package com.hsmdata.springTest.common.framework.controller;

 

import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.hsmdata.springTest.common.framework.mapper.JsonMapper;
import com.hsmdata.springTest.common.utils.DateUtils;
 

 

/**
 * ������֧����
 * 
 * @author chenyj
 * @version 2016-9-2
 */
public abstract class BaseController {

	/**
	 * ��־����
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * �ͻ��˷���JSON�ַ���
	 * 
	 * @param response
	 * @param object
	 * @return
	 */
	protected String renderString(HttpServletResponse response, Object object) {
		return renderString(response, JsonMapper.toJsonString(object), "application/json");
	}

	/**
	 * �ͻ��˷����ַ���
	 * 
	 * @param response
	 * @param string
	 * @return
	 */
	protected String renderString(HttpServletResponse response, String string, String type) {
		try {
			response.reset();
			response.setContentType(type);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(string);
			return null;
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * ��ʼ�����ݰ� 1. �����д��ݽ�����String����HTML���룬��ֹXSS���� 2. ���ֶ���Date����ת��ΪString����
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// String����ת���������д��ݽ�����String����HTML���룬��ֹXSS����
		binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(text == null ? null : StringEscapeUtils.escapeHtml4(text.trim()));
			}

			@Override
			public String getAsText() {
				Object value = getValue();
				return value != null ? value.toString() : "";
			}
		});
		// Date ����ת��
		binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(DateUtils.parseDate(text));
			}
		});
	}
	
	/**
	 * ��֤�û���¼
	 * @param request
	 * @param userId
	 * @return
	 */
	protected boolean checkLogin(Integer userId) {
		if(null == userId){
			return false;
		}
		//UserVo loginUser = UserContext.getSysUser();
		//if(null != loginUser && loginUser.getId() == userId){
		//	return true;
		//}
		return false;
	}
	
}

