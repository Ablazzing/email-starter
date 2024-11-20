package com.javaacademy.email_starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailService {
    @Value("${email.from}")
    private String emailFrom;

    public void sendEmail(String emailTo, String messageText) {
        log.info("emailFrom: {}, email:{} text:{}", emailFrom, emailTo, messageText);
    }
}
