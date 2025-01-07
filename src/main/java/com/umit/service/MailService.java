package com.umit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;

    public void sendMail(String email,String activationCode) {
        String activationLink = generateActivationLink(email, activationCode);
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("gecekusumit@gmail.com");
        mailMessage.setTo(email);
        mailMessage.setSubject("Hesabınızı Aktivasyonu ");
        mailMessage.setText("Hesabınızı aktive etmek için lütfen aşağıdaki linke tıklayınız: " + activationLink);
        javaMailSender.send(mailMessage);
    }

    public String generateActivationLink(String email, String activationCode) {
        return "http://34.163.132.23:8080/dev/v1/auth/activateStatus?email=" + email + "&activationCode=" + activationCode;

    }
}
