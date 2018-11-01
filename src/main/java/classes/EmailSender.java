package classes;

public class EmailSender {
	public static void main(String[] args) {
		final String fromEmail = "email";
		final String password = "";
		final String toEmail = "para";

		System.out.println("Initializing email send");

		EmailConfig config = new EmailConfig();

		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
	}
}
