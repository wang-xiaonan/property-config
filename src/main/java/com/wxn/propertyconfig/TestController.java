package com.wxn.propertyconfig;

import com.wxn.propertyconfig.config.CustomProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangxiaonan
 * @Date: 2018/4/24
 **/
@RestController
@RequestMapping(value = "/props")
public class TestController {

    @RequestMapping(value = "/{key}")
    public String getProperty(@PathVariable String key) {
        String value = CustomProperties.getProperty(key);
        return value;
    }
}
