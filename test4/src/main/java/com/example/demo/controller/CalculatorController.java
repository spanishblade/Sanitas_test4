package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.api.request.OperationType;
import com.example.demo.api.response.OperationResult;
import com.example.demo.api.response.ResponseBase;

/**
 * Operations controller interface
 */
public interface CalculatorController {

    /**
     * Get operation result
     *
     * @return OperationResult 
     */
    @RequestMapping(value = "/operations", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
        ResponseEntity<ResponseBase<OperationResult>> getOperationResult(
            @RequestParam("operationType") OperationType operatorType,
            @RequestParam("operand1") double operand1,
            @RequestParam("operand2") double operand2);
}
