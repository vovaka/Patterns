package behavioral.chainOfResponsibility;

public class GmailHandler implements EmailHadler {
	private EmailHadler nextEmailHadler;

	@Override
	public void setNext(EmailHadler nextEmailHadler) {
		this.nextEmailHadler = nextEmailHadler;
	}

	@Override
	public void handleResponse(Email email) {
		if(!email.getDomain().equalsIgnoreCase("gmail.com")){
			nextEmailHadler.handleResponse(email);
		}else{
			System.out.println("Handling gmail");
		}

	}

}
