package com.everysens.itss.facade.authentication;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class AuthenticationCache {
    private List<AuthenticationEntry> knownClients;
}
