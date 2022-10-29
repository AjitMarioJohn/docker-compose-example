package com.demo.serviceone.controller;

import com.demo.common.module.exception.type.ServiceException;
import com.demo.common.module.model.Person;
import com.demo.serviceone.services.RestClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/service/one")
@Api(value = "Api related to ServiceOne")
@RequiredArgsConstructor
public class ServiceOneRestController {
    private final String service_status = "UP";
    private final RestClientService restClientService;

    @ApiOperation(value = "API to check whether service is UP or not")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Service Status", response = String.class)
    })
    @GetMapping
    public String getServiceStatus() {
        return service_status;
    }

    @ApiOperation(value = "API that concate responses from serviceTwo and serviceThree")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Concate response of two service", response = ResponseEntity.class)
    })
    @PostMapping
    public ResponseEntity<String> greetUsr(@RequestBody Person person) throws ServiceException {
        String message = restClientService.fetchServiceTwoAndThreeResponse(person);
        return ResponseEntity.ok(message);
    }
}
