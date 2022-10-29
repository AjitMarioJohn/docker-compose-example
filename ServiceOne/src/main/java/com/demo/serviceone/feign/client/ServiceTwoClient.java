package com.demo.serviceone.feign.client;

import com.demo.common.module.annotations.RestApiLogger;
import com.demo.common.module.annotations.RestClientErrorHandler;
import com.demo.common.module.model.Person;
import com.demo.serviceone.feign.client.configurations.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        value = "serviceTwoClient",
        url = "${services.service.two.url}",
        configuration = FeignConfig.class
)
public interface ServiceTwoClient {
    @PostMapping
    @RestClientErrorHandler(serviceName = "ServiceTwo")
    @RestApiLogger
    ResponseEntity<String> getUserInfo(Person person);
}
