package com.atguigu.springcloud.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="dept")
public class Dept implements Serializable{
	private static final long serialVersionUID = -6102924023626755894L;
	
	@TableId(value="dept_no")
	private Long deptNo;
	@TableField(value="dname")
	private String dname;
	@TableField(value="db_source")
	private String dbSource;
	
}
