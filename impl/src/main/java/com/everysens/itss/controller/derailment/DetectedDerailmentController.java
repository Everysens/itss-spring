package com.everysens.itss.controller.derailment;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

public class DetectedDerailmentController extends BaseController{

    @Autowired
    public DetectedDerailmentController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
