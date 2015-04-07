package structural.decorator;

public abstract class EmailDecorator implements IEmail {

	IEmail mail;

	@Override
	abstract public String getContent();

}
