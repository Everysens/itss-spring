package com.everysens.itss.facade.authentication;

import org.springframework.stereotype.Service;

@Service
public class NoOpAuthenticationFacade implements IAuthenticationFacade {
    public void checkAuthentication(String customerSystemId, String passphrase) {

    }
}
