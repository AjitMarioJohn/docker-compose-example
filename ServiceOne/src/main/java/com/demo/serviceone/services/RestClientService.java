package com.demo.serviceone.services;

import com.demo.common.module.exception.type.ServiceException;
import com.demo.common.module.model.Person;

public interface RestClientService {
    String fetchServiceTwoAndThreeResponse(Person person) throws ServiceException;
}
