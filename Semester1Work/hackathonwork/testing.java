package secrethack;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
public class testing {
    public static void main(String[] args) {
        String recipient = "jlb838@woodhouse.ac.uk";
        String sender = "jameslukebartlett@gmail.com";
        String host = "10.16.10.103";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        try
        {
            MimeMesseage = new MimeMessage(session);
            message.setFrom(new InternetAddress (sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("This is Subject");
            message.setText("This is a test mail");
            Transport.send(message);
            System.out.println("Mail successfully sent");

        }
        catch (MessagingException mex)
        {
            mex.printStackTrace();
        }


    }
}
