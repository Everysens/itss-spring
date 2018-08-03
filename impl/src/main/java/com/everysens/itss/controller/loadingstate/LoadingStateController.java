package com.everysens.itss.controller.loadingstate;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadingStateController extends BaseController {

    @Autowired
    public LoadingStateController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    // TODO implement me

}
