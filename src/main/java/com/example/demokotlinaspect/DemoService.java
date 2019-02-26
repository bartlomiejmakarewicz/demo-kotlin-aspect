package com.example.demokotlinaspect;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Service
@RequestScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DemoService {
    private final String id;

    public DemoService() {
        this.id = UUID.randomUUID().toString();
    }

    public String getUUID() {
        return id;
    }

    @Redirect
    public void annotated() {

    }
}
