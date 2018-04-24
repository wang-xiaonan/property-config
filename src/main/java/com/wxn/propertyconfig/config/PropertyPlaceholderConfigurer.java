package com.wxn.propertyconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.util.Properties;

/**
 * 继承 {@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurer PropertyPlaceholderConfigurer}
 * 实现加载properties到自定义的配置对象中
 *
 * @Author: wangxiaonan
 * @Date: 2018/4/24
 **/
public class PropertyPlaceholderConfigurer extends org.springframework.beans.factory.config.PropertyPlaceholderConfigurer {
    private static Properties props;

    /**
     * 原方法是从文件中加载合并
     *
     * @return
     * @throws IOException
     */
    @Override
    protected Properties mergeProperties() throws IOException {
        props = super.mergeProperties();

        // 初始化自定义配置对象
        CustomProperties.initProperties(props);

        return props;
    }
}
