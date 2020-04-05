package com.Lama.SpringBasic.Mail;

import javax.mail.MessagingException;

//creating the interface of mail sender
public interface MailSender {
	void send(String to,String subject,String body) throws MessagingException;
}
