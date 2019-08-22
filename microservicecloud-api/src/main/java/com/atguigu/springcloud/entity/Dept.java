package com.atguigu.springcloud.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@TableName(value="dept")
public class Dept implements Serializable{
	private static final long serialVersionUID = -6102924023626755894L;
	
	@TableId(value="dept_no",type=IdType.AUTO)
	private Long deptNo;
	@TableField(value="dname")
	private String dname;
	@TableField(value="db_source")
	private String dbSource;
	public Long getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDbSource() {
		return dbSource;
	}
	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	
}
