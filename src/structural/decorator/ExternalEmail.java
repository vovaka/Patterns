package structural.decorator;

public class ExternalEmail extends EmailDecorator {

	public ExternalEmail(IEmail email){
		mail = email;
	}
	
	@Override
	public String getContent() {
		return mail.getContent() + " ->> Decorated with External";
	}

}
