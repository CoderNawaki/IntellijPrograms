package com.Lama.SpringBasic.Controller;

import javax.mail.MessagingException;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Lama.SpringBasic.Mail.MailSender;

//import com.Lama.SpringBasic.Mail.MockMailSender;

@RestController
public class MailController {
	//using interface and instantiating concrete class
	//@Autowired //go the mockmail sender component and reference to mockmail component works
	private MailSender mailsender ;
	
	
	public MailController(MailSender smtp) { //(smtp)
		this.mailsender = smtp;           //smtp;//this can be change to default bean by naming in the component annotation
	}
			//constructor injection is recommend
			//@Autowired is very strong one

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		mailsender.send("lama.nawraj00@gmail.com", "A test mail", "body of the test mail");
		
		return "mail sent by Nawaki to the localhost...........";//result
	}
}
