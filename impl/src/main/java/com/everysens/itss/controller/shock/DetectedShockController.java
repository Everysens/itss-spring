package com.everysens.itss.controller.shock;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DetectedShockController extends BaseController {

    @Autowired
    public DetectedShockController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

}
