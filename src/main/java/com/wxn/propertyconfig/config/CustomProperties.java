package com.wxn.propertyconfig.config;

import org.springframework.util.StringUtils;

import java.util.Properties;

/**
 * 自定义配置对象，其他对象可从该对象获取配置文件中的参数 <br/>
 * 首先满足的是单例模式
 *
 * @Author: wangxiaonan
 * @Date: 2018/4/24
 **/
public class CustomProperties {
    private static Properties props;

    private CustomProperties() {
    }

    public static void initProperties(Properties properties) {
        props = properties;
    }

    public static String getProperty(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        return getProperty(key, null);
    }

    public static String getProperty(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }
}
