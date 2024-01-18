package com.ms.email.controller;

import com.ms.email.models.EmailModel;
import com.ms.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @Autowired
    EmailService emailService;

    @GetMapping
    public ResponseEntity<List<EmailModel>> getAllEmails() {
        return new ResponseEntity<>(emailService.findAll(), HttpStatus.OK);
    }
}
