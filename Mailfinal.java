// Add the package name of your project here

import java.util.ArrayList;
import com.azure.communication.email.*;
import com.azure.communication.email.models.*;
import com.azure.core.credential.AzureKeyCredential;

public class Mailfinal {
    public static void main( String[] args ) {
        String connectionString = "<ENTER THE CONNECTION STRING FROM THE COMMUNICATION SERVICE RESOURCE>";

        EmailClient emailClient = new EmailClientBuilder().connectionString(connectionString).buildClient();
        //System.out.println("Hello");
        AzureKeyCredential azureKeyCredential = new AzureKeyCredential("<ENTER THE CORRESPONDING KEY OF THE CONNECTION STRING>");

        EmailAddress  emailAddress = new EmailAddress("<ENTER THE INTENDED RECIPIENT EMAIL ID>");
        ArrayList <EmailAddress> addressList = new ArrayList <> ();
        addressList.add(emailAddress);


        EmailRecipients emailRecipients = new EmailRecipients(addressList);

        EmailContent content = new EmailContent("<ENTER SUBJECT>").setPlainText("<ENTER MAIL CONTENT>");

        EmailMessage emailMessage = new EmailMessage("<ENTER SENDER EMAIL ID>", content).setRecipients(emailRecipients);

        SendEmailResult response = emailClient.send(emailMessage);
        System.out.println("Message Id: " + response.getMessageId());
    }
}
