package com.everysens.itss.controller.noop;

import com.everysens.itss.controller.BaseController;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class NoopController extends BaseController {
    @Autowired
    public NoopController(IAuthenticationFacade authenticationFacade) {
        super(authenticationFacade);
    }

    @PostMapping(value = "**")
    @ResponseStatus(HttpStatus.CREATED)
    public void noopNotImplemented() {
        log.trace("Not implemented call");
    }
}
