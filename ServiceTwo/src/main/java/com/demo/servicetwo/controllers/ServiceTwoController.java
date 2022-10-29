package com.demo.servicetwo.controllers;

import com.demo.common.module.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "Api related to ServiceTwo")
@RestController
@RequestMapping(value = "/api/service/two")
public class ServiceTwoController {
    @ApiOperation(value = "Concat and send the person details passed")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Greet the person", response = ResponseEntity.class)
    })
    @PostMapping
    public ResponseEntity<String> welcomePerson(@Valid @RequestBody Person person){
        StringBuilder messageBuilder = new StringBuilder(" ").append(person.getName()).append(" ").append(person.getSurname());
        return ResponseEntity.ok(messageBuilder.toString());
    }

    @ApiOperation(value = "Api to check service is UP or not")
    @ApiResponses({
            @ApiResponse(code = 200, message = "UP", response = ResponseEntity.class)
    })
    @GetMapping
    public ResponseEntity<String> getServiceStatus() {
        return ResponseEntity.ok("Service Two :: UP");
    }
}
