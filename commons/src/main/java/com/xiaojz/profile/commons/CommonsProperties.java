package com.xiaojz.profile.commons;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@EnableConfigurationProperties(CommonsProperties.class)
@ConfigurationProperties(prefix = "commons")
public class CommonsProperties {
    private String prop1;
    private String prop2;
    private String prop3;
}
