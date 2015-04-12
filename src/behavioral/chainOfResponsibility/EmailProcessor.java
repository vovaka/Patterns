package behavioral.chainOfResponsibility;

public class EmailProcessor {

	private EmailHadler previousEmailHandler;

	void addHandlers(EmailHadler emailHandler) {
		if (previousEmailHandler != null) {
			previousEmailHandler.setNext(emailHandler);
		} else {
			previousEmailHandler = emailHandler;
		}
	}

	void handleRequest(Email email) {
		previousEmailHandler.handleResponse(email);
	}

}
