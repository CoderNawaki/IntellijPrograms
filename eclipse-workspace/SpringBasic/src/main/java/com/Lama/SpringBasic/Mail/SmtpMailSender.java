package com.Lama.SpringBasic.Mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Component;



    //@Component   //use as the bean in the component and component is the mother one of all annotation
  //@Qualifier("smtpMail")
public class SmtpMailSender implements MailSender{
	private static Log log = LogFactory.getLog(SmtpMailSender.class);
	
	private JavaMailSender javaMailSender;
	
	
	public SmtpMailSender(JavaMailSender javaMailSender) {
		
		this.javaMailSender = javaMailSender;
	}


	@Override
	//copying the same code from MockmailSender except the name of class
	public void send(String to, String subject, String body) throws MessagingException{
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		
		helper =new MimeMessageHelper(message,true);//true indicates multipart message
		
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body,true);//true indicates html
		
		//continue using helper for more functionalities like adding attachments, etc.
		
		javaMailSender.send(message);
		
	}

}

