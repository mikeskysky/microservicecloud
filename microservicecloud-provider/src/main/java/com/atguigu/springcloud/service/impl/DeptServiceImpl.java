package com.atguigu.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.DeptMapper;
import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;

@Service(value="deptService")
public class DeptServiceImpl implements DeptService{

	@Resource
	private DeptMapper deptMapper;
	
	@Override
	public boolean add(Dept dept) {
		Integer count = deptMapper.insert(dept);
		return count>0;
	}

}
