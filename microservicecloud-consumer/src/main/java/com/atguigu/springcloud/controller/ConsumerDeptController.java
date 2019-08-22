package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entity.Dept;

@Controller
@RequestMapping("consumer/dept")
public class ConsumerDeptController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="add")
	public String add(@RequestBody Dept dept)
	{
		String postForObject = restTemplate.postForObject("http://localhost:8081/dept/add", dept, String.class);
		System.out.println(postForObject);
		return "success";
	}
}
