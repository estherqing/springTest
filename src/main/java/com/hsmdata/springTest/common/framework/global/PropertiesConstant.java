package com.hsmdata.springTest.common.framework.global;
 

public class PropertiesConstant {

	public final static String KEY_LOCAL_URL = "local.url";

	public final static String KEY_STATIC_URL = "static.url";

	public final static String KEY_LOGIN_URL = "login.url";

	public final static String UPLOAD_FILE = "upload_file";

	public final static String EMAIL_SUFFIX = "email_suffix";

	public static final int SUCCESS = 0;// 成功

	public static final int FAIL = 1;// 失败
	
	public static final int DEFAULT_PAGESIZE = 10;// 默认每页显示条数
	
	/**
	 * 删除标记：已删除
	 */
	public static final int DEL_YES = 0;
	/**
	 * 删除标记：未删除
	 */
	public static final int DEL_NO = 1;
	
	/**
	 * 动态类型：会议
	 */
	public static final Short DYNAMIC_TYPE_MEETING = 1;
	/**
	 * 动态类型：培训
	 */
	public static final Short DYNAMIC_TYPE_TRAIN = 2;
	/**
	 * 动态类型：技术论坛
	 */
	public static final Short DYNAMIC_TYPE_TECHNIQUE = 3;
	
	
	/**
	 * 点赞类型：动态
	 */
	public static final Short PRAISE_TYPE_DYNAMIC = 1;
	/**
	 * 点赞类型：留言
	 */
	public static final Short PRAISE_TYPE_MESSAGE = 2;
	/**
	 * 点赞类型：回复
	 */
	public static final Short PRAISE_TYPE_REPLY = 3;
	
	/**
	 * 评论类型：动态
	 */
	public static final Short COMMENT_TYPE_DYNAMIC = 1;
	/**
	 * 评论类型：合作公司
	 */
	public static final Short COMMENT_TYPE_PARTNER = 2;
	/**
	 * 评论类型：培训
	 */
	public static final Short COMMENT_TYPE_TRAIN = 3;
	
	/**
	 * 关注类型：动态
	 */
	public static final int FOCUS_TYPE_DYNAMIC = 1;
	/**
	 * 关注类型：合作公司
	 */
	public static final int FOCUS_TYPE_COMPANY = 2;
	/**
	 * 关注类型：培训机构
	 */
	public static final int FOCUS_TYPE_TRAINING = 3;
	
	/**
	 * 评分类型：技术实力
	 */
	public static final int SCORE_TYPE_TECH = 1;
	
	/**
	 * 评分类型：项目质量
	 */
	public static final int SCORE_TYPE_PROJECT = 2;
	
	/**
	 * 评分类型：服务态度
	 */
	public static final int SCORE_TYPE_SERVICE = 3;
	
	/**
	 * 评分类型：产品质量
	 */
	public static final int SCORE_TYPE_PRODUCT = 4;
	
	/**
	 * 评分类型：工作效率
	 */
	public static final int SCORE_TYPE_EFFICIENCY = 5;
	
	/**
	 * 消息类型：评论
	 */
	public static final Short MESSAGE_TYPE_COMMENT = 1;
	/**
	 * 消息类型：回复
	 */
	public static final Short MESSAGE_TYPE_REPLY = 2;
	
	/**
	 * 消息阅读状态：未读
	 */
	public static final Short READ_FLAG_NO = 0;
	/**
	 * 消息阅读状态：已读
	 */
	public static final Short READ_FLAG_YES = 1;
	
	
}
