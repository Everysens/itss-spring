package com.everysens.itss.controller;

import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
    path = "#{${itss-spring.base-path:/} + 'itss/' + ${itss-spring.specification-version:1.1}"
)
public class BaseController {

    private final IAuthenticationService authenticationService;

    public BaseController(IAuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    protected void checkAuthentication(String customerSystemId, String passphrase){
        authenticationService.checkAuthentication(customerSystemId, passphrase);
    }

}
