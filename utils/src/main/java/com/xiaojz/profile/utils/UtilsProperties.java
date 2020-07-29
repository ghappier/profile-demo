package com.xiaojz.profile.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@EnableConfigurationProperties(UtilsProperties.class)
@ConfigurationProperties(prefix = "utils")
public class UtilsProperties {
    private String prop1;
    private String prop2;
    private String prop3;
}
