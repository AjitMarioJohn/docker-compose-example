package com.demo.springboot.aws.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.yml")
@Data
@ConfigurationProperties("amazon-properties")
public class AmazonS3Configuration {
    private String endpointUrl;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
