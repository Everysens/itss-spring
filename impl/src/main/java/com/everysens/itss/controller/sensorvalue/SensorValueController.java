package com.everysens.itss.controller.sensorvalue;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

public class SensorValueController extends BaseController {

    @Autowired
    public SensorValueController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
