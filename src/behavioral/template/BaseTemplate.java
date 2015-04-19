package behavioral.template;

public abstract class BaseTemplate {
	public final void wrapWithTransaction() {
		startTransaction();
		specificMethod();
		commitTransaction();
	}

	private void commitTransaction() {
		System.out.println("Commit Transaction");
		System.out.println("Close connection");
	}

	private void startTransaction() {
		System.out.println("Get Transaction");
		System.out.println("Begin Transaction");
	}
	
	abstract void specificMethod();
}
