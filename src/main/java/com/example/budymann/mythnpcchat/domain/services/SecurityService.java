package com.example.budymann.mythnpcchat.domain.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public SecurityContext getSecurityContext(){
        return SecurityContextHolder.getContext();
    }


}
