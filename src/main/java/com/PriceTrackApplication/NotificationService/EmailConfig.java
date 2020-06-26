package com.PriceTrackApplication.NotificationService;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
    @Bean
    public SimpleMailMessage emailTemplate(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("ebenezar16899@gmail.com ");// some mail id
        message.setFrom("ebenezar16899@gmail.com ");// some mail id
        message.setSubject("Product Tracker ");
        message.setText("Check the change:(");
        return message;
    }
}
