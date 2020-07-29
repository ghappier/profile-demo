package com.xiaojz.profile.repository;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@EnableConfigurationProperties(ServiceProperties.class)
@ConfigurationProperties(prefix = "service")
public class ServiceProperties {
    private String prop1;
    private String prop2;
    private String prop3;
}
