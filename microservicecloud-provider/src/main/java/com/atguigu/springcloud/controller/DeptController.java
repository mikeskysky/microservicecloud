package com.atguigu.springcloud.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController(value="dept")
public class DeptController {
	@Resource
	private DeptService deptService;
	
	@PostMapping(value="add")
	public String add(@RequestBody Dept dept)
	{
		deptService.add(dept);
		return "success";
	}
}
