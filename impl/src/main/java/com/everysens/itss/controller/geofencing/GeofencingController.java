package com.everysens.itss.controller.geofencing;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.service.authentication.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

public class GeofencingController extends BaseController {

    @Autowired
    public GeofencingController(IAuthenticationService authenticationService) {
        super(authenticationService);
    }

    // TODO implement me

}
