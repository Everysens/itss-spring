package com.everysens.itss.controller.mileage;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MileageController extends BaseController {

    @Autowired
    public MileageController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    // TODO implement me

}
