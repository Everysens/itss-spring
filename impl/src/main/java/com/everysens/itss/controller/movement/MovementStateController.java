package com.everysens.itss.controller.movement;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MovementStateController extends BaseController {

    @Autowired
    public MovementStateController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
