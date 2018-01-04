package com.everysens.itss.controller.shock;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

public class DetectedShockController extends BaseController {

    @Autowired
    public DetectedShockController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

}
