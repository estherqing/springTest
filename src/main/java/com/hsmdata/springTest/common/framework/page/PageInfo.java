package com.hsmdata.springTest.common.framework.page;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @description����ҳʵ����
 * @author��chenyj
 */
public class PageInfo<T> {
	private int pageNo;// ��ǰҳ��
	private int pageSize;// ÿҳ��¼��
	private int totalRecord;// �ܼ�¼��
	private List<T> dataList = new ArrayList<T>();// ÿҳ����
	private int start;// ��ʼλ��
	private boolean isLastPage;//�Ƿ������һҳ
	private Map<String,Object> searchMap;// ��ѯ����

	public PageInfo(int pageNo, int pageSize, int totalRecord, Map<String,Object> searchMap) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.start = (this.pageNo - 1) * this.pageSize;
		this.totalRecord = totalRecord;
		if(pageNo*pageSize >= totalRecord){
			this.isLastPage = true;
		}else{
			this.isLastPage = false;
		}
		this.searchMap = searchMap;
	}

	@JsonIgnore
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@JsonIgnore
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	@JsonIgnore
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	@JsonIgnore
	public Map<String, Object> getSearchMap() {
		return searchMap;
	}

	public void setSearchMap(Map<String, Object> searchMap) {
		this.searchMap = searchMap;
	}

}
