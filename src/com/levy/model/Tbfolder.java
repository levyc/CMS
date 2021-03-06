package com.levy.model;

import com.levy.annotations.ModelBind;

@ModelBind(table = "tb_folder")
public class Tbfolder extends BaseModel<Tbfolder>{
	private static final long serialVersionUID = 1L;
	
	public static final int ROOT = 1;
	public static final Tbfolder DAO = new Tbfolder();
	
	// columns START
		private String ID = "id"; // 目录id
		private String NAME = "name"; // 中文名
		private String PATH = "path"; // 路径
		private String CONTENT = "content"; // 描述
		private String SORT = "sort"; // 排序
		private String STATUS = "status"; // 状态：2 隐藏 1 显示
		private String TYPE = "type"; // 类型 1 普通目录 2 a标签 3 a标签_blank 4 直接加载url信息
		private String JUMP_URL = "jump_url"; // 跳转地址
		private String UPDATE_TIME = "update_time"; // 更新时间
		private String CREATE_TIME = "create_time"; // 创建时间
		private String CREATE_ID = "create_id"; // 创建者

		public Tbfolder setId(java.lang.Integer value) {
			set(ID, value);
			return this;
		}

		public java.lang.Integer getId() {
			return get(ID);
		}

		public Tbfolder setName(java.lang.String value) {
			set(NAME, value);
			return this;
		}

		public java.lang.String getName() {
			return get(NAME);
		}

		public Tbfolder setPath(java.lang.String value) {
			set(PATH, value);
			return this;
		}

		public java.lang.String getPath() {
			return get(PATH);
		}

		public Tbfolder setContent(java.lang.String value) {
			set(CONTENT, value);
			return this;
		}

		public java.lang.String getContent() {
			return get(CONTENT);
		}

		public Tbfolder setSort(java.lang.Integer value) {
			set(SORT, value);
			return this;
		}

		public java.lang.Integer getSort() {
			return get(SORT);
		}

		public Tbfolder setStatus(java.lang.String value) {
			set(STATUS, value);
			return this;
		}

		public java.lang.String getStatus() {
			return get(STATUS);
		}

		public Tbfolder setType(java.lang.Integer value) {
			set(TYPE, value);
			return this;
		}

		public java.lang.Integer getType() {
			return get(TYPE);
		}

		public Tbfolder setJumpUrl(java.lang.String value) {
			set(JUMP_URL, value);
			return this;
		}

		public java.lang.String getJumpUrl() {
			return get(JUMP_URL);
		}

		public Tbfolder setUpdateTime(java.lang.String value) {
			set(UPDATE_TIME, value);
			return this;
		}

		public java.lang.String getUpdateTime() {
			return get(UPDATE_TIME);
		}

		public Tbfolder setCreateTime(java.lang.String value) {
			set(CREATE_TIME, value);
			return this;
		}

		public java.lang.String getCreateTime() {
			return get(CREATE_TIME);
		}

		public Tbfolder setCreateId(java.lang.Integer value) {
			set(CREATE_ID, value);
			return this;
		}

		public java.lang.Integer getCreateId() {
			return get(CREATE_ID);
		}
      
}
