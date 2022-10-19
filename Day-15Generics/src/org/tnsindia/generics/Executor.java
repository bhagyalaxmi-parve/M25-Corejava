package org.tnsindia.generics;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a sender to send string message
		Sender <String> strs = new Sender <String>();
		 strs.setMessage("hi.. from java");
		 strs.sendMessage();
		 
		 
		 //create an email object to be sent using sender
		 Email myemail =  new Email();
		 myemail.setFrom("abc12@gate.com");
		 myemail.setTo("admin@igate.com");
		 myemail.setSubject("need to block cafeteria for personal event");

		 myemail.setBody("to clebrate igate birthday");
		 
		 
		 //create a sender to send this email
		 
		 Sender <Email> emailSender = new Sender <Email>();
		 emailSender.setMessage(myemail);
		 emailSender.sendMessage();
		


	}

}
