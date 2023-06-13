package dev.lucas.awssesemailsender;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSesEmailsenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSesEmailsenderApplication.class, args);
	}

}
