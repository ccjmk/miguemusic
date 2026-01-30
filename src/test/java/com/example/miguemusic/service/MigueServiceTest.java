package com.example.miguemusic.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.service.AppService;
import com.service.MigueService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class MigueServiceTest {

    @Test
    void execute_callsAppServicePing() {
        AppService mockAppService = mock(AppService.class);
        MigueService service = new MigueService(mockAppService);

        service.execute();

        verify(mockAppService, times(1)).ping();
    }
}
