package com.demo.serviceone.feign.client;

import com.demo.common.module.annotations.RestClientErrorHandler;
import com.demo.serviceone.feign.client.configurations.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        value = "serviceThreeClient",
        url = "${services.service.three.url}",
        configuration = FeignConfig.class
)
public interface ServiceThreeClient {
    @GetMapping
    @RestClientErrorHandler(serviceName = "ServiceThree")
    ResponseEntity<String> getWelcomeMessage();
}
