package com.springbatch.fastcampus.cryptoautomation.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();
            System.out.println("payload = " + payload);

            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
