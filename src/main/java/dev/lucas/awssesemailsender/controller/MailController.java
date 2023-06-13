package dev.lucas.awssesemailsender.controller;

import dev.lucas.awssesemailsender.model.Email;
import dev.lucas.awssesemailsender.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @PostMapping("/sendEmail")
    public String sendMassage(@RequestBody Email email){
        mailService.sendMessage(email);
        return "E-mail successfully sent.";
    }
}
