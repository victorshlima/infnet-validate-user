package com.infnet.br.user.validation.controller;

import com.infnet.br.user.validation.service.ValidateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class RegisterController { //TODO criar a INTERFACEEEE

    @Autowired
    private ValidateService validateService;

    public RegisterController (ValidateService validateService){
    this.validateService = validateService;
    }

    @GetMapping("/validate/{id}")
    public ResponseEntity<Boolean> userValidation(@PathVariable("id") Long id){
        log.info("userValidation");
        var isValid = validateService.validateUser(id);
        log.info(String.format("userValidation:::::: %s %s",HttpStatus.OK,isValid));
    return ResponseEntity.status(HttpStatus.OK).body(isValid);
    }

}
