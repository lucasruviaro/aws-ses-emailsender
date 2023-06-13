package dev.lucas.awssesemailsender.service;

import dev.lucas.awssesemailsender.model.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService  {

    private final MailSender mailSender;

    public void sendMessage(Email email){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(email.fromEmail());
        simpleMailMessage.setTo(email.toEmail());
        simpleMailMessage.setSubject(email.subject());
        simpleMailMessage.setText(email.body());
        this.mailSender.send(simpleMailMessage);
    }

}
