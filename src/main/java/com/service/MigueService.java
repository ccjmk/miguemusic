package com.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MigueService {
    final AppService appService;

    public void execute() {
        System.out.println("Executing MigueService logic 4...");
        appService.ping();
    }
}
