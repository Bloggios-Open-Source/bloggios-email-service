package com.bloggios.email.properties;

import lombok.experimental.UtilityClass;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - bloggios-email-service
 * Package - com.bloggios.email.properties
 * Created_on - May 05 - 2024
 * Created_at - 16:27
 */

@UtilityClass
public class MailProperties {

    public static void mailProperties(JavaMailSenderImpl javaMailSender) {
        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
    }
}
