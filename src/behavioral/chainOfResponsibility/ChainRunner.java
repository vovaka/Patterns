package behavioral.chainOfResponsibility;

/**
 * http://java.dzone.com/articles/design-patterns-uncovered-chain-of- responsibility
 * 
 * <li>Multiple objects can handle a request and the handler doesn't have to be a specific object</li> 
 * <li>A set of objects should be able to handle a request with the handler determined at runtime</li> 
 * <li>A request not being handled is an acceptable outcome.</li>
 * 
 */
public class ChainRunner {

	public static void main(String[] args) {

		EmailProcessor emailProcessor = new EmailProcessor();
		emailProcessor.addHandlers(new BusinessEmailHandler());
		emailProcessor.addHandlers(new GmailHandler());

		Email email = new Email("gmail.com");

		emailProcessor.handleRequest(email);

	}

}
