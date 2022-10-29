package com.demo.serviceone.services.impl;

import com.demo.common.module.exception.type.ServiceException;
import com.demo.common.module.exception.type.ServiceExceptionType;
import com.demo.common.module.model.Person;
import com.demo.serviceone.feign.client.ServiceThreeClient;
import com.demo.serviceone.feign.client.ServiceTwoClient;
import com.demo.serviceone.services.RestClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class RestClientServiceImpl implements RestClientService {

    private final ServiceTwoClient serviceTwoClient;
    private final ServiceThreeClient serviceThreeClient;

    @Override
    public String fetchServiceTwoAndThreeResponse(Person person) throws ServiceException {
        ResponseEntity<String> serviceTwoMessage = serviceTwoClient.getUserInfo(person);
        if (Objects.isNull(serviceTwoMessage)) {
            throw new ServiceException(ServiceExceptionType.REST_API_EXCEPTION, "No response from service two");
        }
        ResponseEntity<String> serviceThreeResponse = serviceThreeClient.getWelcomeMessage();
        if (Objects.isNull(serviceThreeResponse)) {
            throw new ServiceException(ServiceExceptionType.REST_API_EXCEPTION, "No response from service three");
        }
        String serviceThreeMessage = serviceThreeResponse.getBody();
        return serviceThreeMessage.concat(serviceTwoMessage.getBody());
    }
}
