package com.everysens.itss.facade.authentication;

import com.everysens.itss.dto.error.ErrorDto;
import com.everysens.itss.exception.ItssException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class InMemoryAuthenticationFacade implements IAuthenticationFacade {

    private AuthenticationCache authenticationCache;

    @Autowired(required = false)
    public InMemoryAuthenticationFacade setAuthenticationCache(AuthenticationCache authenticationCache) {
        this.authenticationCache = authenticationCache;
        return this;
    }

    @PostConstruct
    public void init(){
        if(authenticationCache == null)
            this.authenticationCache = new AuthenticationCache(new ArrayList<>());
    }

    @Override
    public void checkAuthentication(String customerSystemId, String passphrase) {
        if(authenticationCache.getKnownClients().stream()
                .noneMatch(a -> customerSystemId.equals(a.getId()) && passphrase.equals(a.getPass()))){
            throw new ItssException(ErrorDto.authenticationFailed);
        }
    }


}
