package com.springbatch.fastcampus.cryptoautomation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springbatch.fastcampus.cryptoautomation.http.SlackHttpClient;
import com.springbatch.fastcampus.cryptoautomation.http.UpbitHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final UpbitHttpClient upbitHttpClient;
    private final SlackHttpClient slackHttpClient;


    @GetMapping("/api/v1/ticker/{market}")
    public void test(@PathVariable String market) throws JsonProcessingException {
        upbitHttpClient.getTickerByMarket(market);
        slackHttpClient.send("hello world!");
    }

}
