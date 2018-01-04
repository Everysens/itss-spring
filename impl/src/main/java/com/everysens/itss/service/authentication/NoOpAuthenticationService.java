package com.everysens.itss.service.authentication;

import org.springframework.stereotype.Service;

@Service
public class NoOpAuthenticationService implements IAuthenticationService{
    public void checkAuthentication(String customerSystemId, String passphrase) {

    }
}
