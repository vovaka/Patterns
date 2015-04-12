package behavioral.chainOfResponsibility;

public class BusinessEmailHandler implements EmailHadler {
	private EmailHadler nextEmailHadler;

	@Override
	public void setNext(EmailHadler nextEmailHadler) {
		this.nextEmailHadler = nextEmailHadler;

	}

	@Override
	public void handleResponse(Email email) {
		if (!email.getDomain().equalsIgnoreCase("business.com")) {
			nextEmailHadler.handleResponse(email);
		} else {
			System.out.println("Business Handling");
		}

	}

}
