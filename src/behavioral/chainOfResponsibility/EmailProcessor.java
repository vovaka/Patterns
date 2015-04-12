package behavioral.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class EmailProcessor {

	private EmailHadler currentHandler;

	private static int handlerCount = 0;
	private Map<Integer, EmailHadler> map = new HashMap<Integer, EmailHadler>();

	void addHandlers(EmailHadler emailHandler) {
		handlerCount++;
		if (map.isEmpty()) {
			map.put(handlerCount, emailHandler);
			currentHandler = emailHandler;
			return;
		}
		if (map.size() >= 1) {
			map.get(handlerCount - 1).setNext(emailHandler);
			map.put(handlerCount, emailHandler);
		}
	}

	void handleRequest(Email email) {
		currentHandler.handleResponse(email);
	}

}
