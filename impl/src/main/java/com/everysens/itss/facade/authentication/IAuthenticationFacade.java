package com.everysens.itss.facade.authentication;

public interface IAuthenticationFacade {

    void checkAuthentication(String customerSystemId, String passphrase);

}
