package com.wxn.propertyconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * spring boot 加载配置
 *
 * @Author: wangxiaonan
 * @Date: 2018/4/24
 **/
@Configuration
@ImportResource(locations = {"classpath:spring-mvc.xml"})
public class LoadXML {
}
