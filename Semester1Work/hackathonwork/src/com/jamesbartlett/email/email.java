package com.jamesbartlett.email;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MutliPart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtil {
    /**
    * @param session;
    * @param toEmail;
    * @param subject;
    * @param body;
    */
    public static void sendEmail(Session session, String toEmail, String subject, String body) {
        try
        {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "test/HTML;charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("jameslukebartlett@gmail.com", "James-Bartlett"));

            msg.setReplyTo(InternetAddress.parse("jameslukebartlett@gmail.com", false));
            msg.setSubject(subject, "UTF-8")
        }
    }
}
