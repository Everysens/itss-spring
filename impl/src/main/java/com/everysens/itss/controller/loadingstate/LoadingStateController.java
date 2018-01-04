package com.everysens.itss.controller.loadingstate;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoadingStateController extends BaseController {

    @Autowired
    public LoadingStateController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
