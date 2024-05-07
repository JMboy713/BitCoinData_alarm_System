package com.springbatch.fastcampus.cryptoautomation.service;

import com.springbatch.fastcampus.cryptoautomation.http.SlackHttpClient;
import com.springbatch.fastcampus.cryptoautomation.http.UpbitHttpClient;
import com.springbatch.fastcampus.cryptoautomation.http.UpbitTickerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {
    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;

    public void execute(String market) {
        // upbit 의 데이터를 호출한다.
        UpbitTickerDto tickerByMarket = upbitHttpClient.getTickerByMarket(market);
        // slack으로 메시지를 보낸다.
        StringBuilder sb = new StringBuilder();
        sb.append("[실시간 데이터] ");
        sb.append(market);
        sb.append(" price =  ");
        sb.append(tickerByMarket.getTrade_price());

        slackHttpClient.send(sb.toString());
    }

}
