package com.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public void ping() {
        System.out.println("Pong");
    }
}
