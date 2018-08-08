package com.wxn.propertyconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用spring boot 的方式配置PropertyPlaceholderConfigurer <br/>
 * 1. 用这种方式或者LoadXML类加载xml，想springmvc那种方式，将PropertyPlaceholderConfigurer注入<br/>
 * 2. 或者用本类这种，用代码的放是将PropertyPlaceholderConfigurer注入
 *
 * @Author: wangxiaonan
 * @Date: 2018/4/24
 **/
@Configuration
public class ConfigClass {
    @Bean
    public PropertyPlaceholderConfigurer properties() throws IOException {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        List<Resource> resources = new ArrayList<>();
        resources.add(new ClassPathResource("config/common.properties"));
        // 批量添加resource
//        try {
//            Resource[] resource = resolver.getResources("classpath:**/*.yml");
//            propertyPlaceholderConfigurer.setLocations(resource);
//        } catch (IOException e) {
//            logger.error("[PropertyConfig] initProperties fail, init file type *.yml", e);
//        }
        ppc.setLocations(resources.toArray(new Resource[]{}));
        return ppc;
    }
}
