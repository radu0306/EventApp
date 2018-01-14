package net.radu.Frontend.services;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;

public class SendEmail {

	public void sendEmail(){
		
		// Recipient's email ID 
	      String to = "beatrice.skittles@gmail.com";
	      String to1 = "negoita.radu72@gmail.com";

	      // Sender's email ID 
	      String from = "radu_a_03@gmail.com";

	      String host = "localhost";


	      Properties properties = System.getProperties();

	      properties.setProperty("mail.smtp.host", host);

	      Session session = Session.getDefaultInstance(properties);

	      try {
	         MimeMessage message = new MimeMessage(session);

	         message.setFrom(new InternetAddress(from));

	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         message.setSubject("Raportare eveniment");

	         message.setText("Detaliu eveniment");

	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	      
	      try {
		         MimeMessage message = new MimeMessage(session);

		         message.setFrom(new InternetAddress(from));

		         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));

		         message.setSubject("Raportare eveniment");

		         message.setText("Detaliu eveniment");

		         Transport.send(message);
		         System.out.println("Sent message successfully....");
		      } catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
	}
}
