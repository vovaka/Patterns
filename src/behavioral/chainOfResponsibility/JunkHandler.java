package behavioral.chainOfResponsibility;

public class JunkHandler implements EmailHadler {
	private EmailHadler nextEmailHadler;

	@Override
	public void setNext(EmailHadler nextEmailHadler) {
		this.nextEmailHadler = nextEmailHadler;
	}

	@Override
	public void handleResponse(Email email) {
		if(!email.getDomain().equalsIgnoreCase("junk.com")){
			nextEmailHadler.handleResponse(email);
		}else{
			System.out.println("Handling junk");
		}

	}

}
