package com.everysens.itss.controller.sensorvalue;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorValueController extends BaseController {

    @Autowired
    public SensorValueController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    // TODO implement me

}
