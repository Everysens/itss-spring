package com.everysens.itss.controller.geofencing;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeofencingController extends BaseController {

    @Autowired
    public GeofencingController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    // TODO implement me

}
