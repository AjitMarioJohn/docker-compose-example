package com.demo.servicethree.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Api related to ServiceThree")
@RestController
@RequestMapping(value = "/api/service/three")
public class ServiceThreeController {
    @ApiOperation(value = "Return welcome message")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Greet the person", response = ResponseEntity.class)
    })
    @GetMapping
    public ResponseEntity<String> getWelcomeMessage() {
        return ResponseEntity.ok("Hello");
    }

}
