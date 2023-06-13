# AWS SES E-mail Sender

This application utilizes the AWS SDK for Java to establish a connection with SES, and through simple configuration, it can send customized emails with ease. Whether it's transactional emails, notifications, or marketing campaigns, this Spring Boot application with AWS SES integration provides a reliable and straightforward solution for email communication.

JSON example for Postman/Insomnia testing:

POST - /sendEmail

````
{
  "fromEmail": "lucasruviaro@hotmail.com",
  "toEmail": "lucasruviaro@hotmail.com",
  "subject": "Welcome to our platform!",
  "body": "Thank you, for subscribing to our platform. We really apreciate your support!"
}
````

