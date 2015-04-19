package behavioral.template;

public class TemplateRunner {

	public static void main(String[] args) {
		BaseTemplate template = new BaseTemplate() {

			@Override
			void specificMethod() {
				System.out.println("Performing specific job");
			}
		};
		
		template.wrapWithTransaction();

	}

}
