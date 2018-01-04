package com.everysens.itss.controller.mileage;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MileageController extends BaseController {

    @Autowired
    public MileageController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
