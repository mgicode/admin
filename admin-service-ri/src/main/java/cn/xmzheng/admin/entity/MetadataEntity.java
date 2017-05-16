package cn.xmzheng.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "metadata")
public class MetadataEntity {
	private String module;  //模块
	private String cnName;  //中文名称
	private String tableName;  //对应表名
	private int status;  //状态标识位
	private int sortNo;  //排序号

	@Id
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	
	@Column
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	
	@Column
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	@Column
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column
	public int getSortNo() {
		return sortNo;
	}
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
}