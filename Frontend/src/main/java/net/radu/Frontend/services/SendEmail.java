package net.radu.Frontend.services;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import net.radu.Frontend.obj.Event;
import net.radu.Frontend.obj.User;

//import net.radu.Backend.dto.Event;
//import net.radu.Backend.dto.User;

import javax.activation.*;

public class SendEmail {

	public void sendEmail(List<User> admins, Event mEvent) {

		// Sender's email ID
		String from = "radu_a_03@gmail.com";

		String host = "localhost";

		Properties properties = System.getProperties();

		properties.setProperty("mail.smtp.host", host);

		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));

			for (int i = 0; i < admins.size(); i++) {

				//recipients email
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(admins.get(i).getEmail()));

				message.setSubject("ALERT!! Eveniment reported: " + mEvent.getEventName());

				message.setText("New eveniment reported! /nDescription: " + mEvent.getDescription() + "/nCategory: " + mEvent.getTag() + "/nLocation: " + mEvent.getCountry() + " " + mEvent.getCity() + 
						"/nReported by: " + mEvent.getUserFirstName() + " " + mEvent.getUserLastName() + "/nAllert code: " + mEvent.getAllertCode());

				Transport.send(message);
			}
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
