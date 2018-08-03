package com.everysens.itss.controller.derailment;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetectedDerailmentController extends BaseController{

    @Autowired
    public DetectedDerailmentController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    // TODO implement me

}
