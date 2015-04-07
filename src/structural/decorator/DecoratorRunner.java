package structural.decorator;

/**
 * http://java.dzone.com/articles/design-patterns-decorator
 *
 */
public class DecoratorRunner {

	public static void main(String[] args) {
		IEmail mainMail = new Email("Main mail");
		ExternalEmail external = new ExternalEmail(mainMail);
		System.out.println(external.getContent());
		System.out.println(external instanceof IEmail);
		SecuredEmail secured = new SecuredEmail(external);
		System.out.println(secured.getContent());
	}
}
