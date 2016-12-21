package com.hsmdata.springTest.common.framework.global;

 

/**
 * ����ֵenum
 * 
 * @author chenyj
 * @version 2016-09-18
 */
public enum ReturnCode {
	NORMAL("0", "�����ɹ�"),
	INTERFACE_ERROR("1","�ӿ�����"),
	ACTION_ERROR("2","����ʧ��"),
	AUTHORITY_ERROR("3","û�з���Ȩ��"),
	SYSTEM_ERROR("4","ϵͳ����"),
	TIMEOUT_ERROR("5","����ʱ"),
	PARAM_ERROR("6","�����������");
	

	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private ReturnCode(String code,String msg){
		this.code = code;
		this.msg = msg;
	}
}
