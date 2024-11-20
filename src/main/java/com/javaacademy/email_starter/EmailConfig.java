package com.javaacademy.email_starter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@AutoConfiguration
@ComponentScan("com.javaacademy.email_starter")
@PropertySource("classpath:email-starter.properties")
public class EmailConfig {
}
