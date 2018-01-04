package com.everysens.itss.service.authentication;

public interface IAuthenticationService {

    void checkAuthentication(String customerSystemId, String passphrase);

}
