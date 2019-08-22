package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *其实这个类就想当初application.xml文件
 *<bean id="" class=""> 
 *
 */
import org.springframework.web.client.RestTemplate;
@Configuration
public class ConfigBean {
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
