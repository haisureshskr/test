package rough;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import utilities.MonitoringMail;
import utilities.TestConfig;

public class TestHostAdd {

	public static void main(String[] args) throws UnknownHostException, MessagingException, MessagingException {
		// TODO Auto-generated method stub
		MonitoringMail mail = new MonitoringMail();
		String messageBody = "http://" +(InetAddress.getLocalHost().getHostAddress())+":8080/job/hellofirst/test_results_analyzer/";
		
		System.out.println(messageBody);
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
	}

}
