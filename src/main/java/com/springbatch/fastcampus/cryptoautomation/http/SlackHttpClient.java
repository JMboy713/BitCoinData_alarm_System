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

            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
