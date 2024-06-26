package com.springbatch.fastcampus.cryptoautomation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springbatch.fastcampus.cryptoautomation.http.SlackHttpClient;
import com.springbatch.fastcampus.cryptoautomation.http.UpbitHttpClient;
import com.springbatch.fastcampus.cryptoautomation.repository.ReportHistoryRepository;
import com.springbatch.fastcampus.cryptoautomation.service.UpbitSlackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final UpbitSlackService upbitSlackService;



    @GetMapping("/api/v1/ticker/{market}")
    public void test(@PathVariable String market) {
        upbitSlackService.execute(market);
    }


}
