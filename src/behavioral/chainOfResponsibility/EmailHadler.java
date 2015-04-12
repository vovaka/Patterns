package behavioral.chainOfResponsibility;

public interface EmailHadler {
	void setNext(EmailHadler hadler);

	void handleResponse(Email email);
}
