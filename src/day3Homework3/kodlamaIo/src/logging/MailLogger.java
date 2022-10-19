package day3Homework3.kodlamaIo.src.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail'e loglandi: "+ data);
		
	}

}
