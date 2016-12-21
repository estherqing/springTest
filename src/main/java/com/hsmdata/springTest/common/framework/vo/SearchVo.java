package com.hsmdata.springTest.common.framework.vo;

 

import java.io.Serializable;
import java.util.Map;

/**
 * ��ѯ����VO
 * 
 * @author chenyj
 * @version 2016-09-18
 */
public class SearchVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;// �û�ID
	private int pageNo;// ��ǰҳ��
	private int pageSize;// ÿҳ��ʾ����
	private Map<String, String> searchMap;// ��ѯ�ַ���

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Map<String, String> getSearchMap() {
		return searchMap;
	}

	public void setSearchMap(Map<String, String> searchMap) {
		this.searchMap = searchMap;
	}

}