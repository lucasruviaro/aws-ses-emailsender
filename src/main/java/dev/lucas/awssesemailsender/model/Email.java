package dev.lucas.awssesemailsender.model;

public record Email(String fromEmail, String toEmail, String subject, String body) {
}
