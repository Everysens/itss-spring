package com.everysens.itss.controller;

import com.everysens.itss.dto.BaseResponseDto;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(
    path = "#{'${itss-spring.base-path:/}' + 'itss/1.1'}"
)
public class BaseController {

    private final IAuthenticationFacade authenticationService;

    public BaseController(IAuthenticationFacade authenticationFacade){
        this.authenticationService = authenticationFacade;
    }

    protected void checkAuthentication(BaseResponseDto dto){
        authenticationService.checkAuthentication(dto.getTelematicsApplicationId(), dto.getPassPhrase());
        dto.setPassPhrase(null);
    }

    protected void checkAuthentication(String customerSystemId, String passphrase){
        authenticationService.checkAuthentication(customerSystemId, passphrase);
    }

}
