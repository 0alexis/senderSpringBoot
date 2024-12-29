package com.spring.mail.sender.SpringBootSender.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfiguration {
    @Bean
    public JavaMailSender getJavaMailSender() {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("correospamnull@gmail.com");
        mailSender.setPassword("Ecuador2024proceso");

        Properties pros = mailSender.getJavaMailProperties();
        pros.put("mail.transport.protocol", "smtp");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.debug", "true");

        return mailSender;
    }
}
