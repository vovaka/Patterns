package structural.decorator;

import org.apache.commons.codec.binary.Base64;

public class SecuredEmail extends EmailDecorator {

	public SecuredEmail(IEmail email) {
		mail = email;
	}

	@Override
	public String getContent() {
		return "Decorated with Secured->> " + encode(mail.getContent());
	}

	private String encode(String messageToEncode) {
		byte[] bytesEncoded = Base64.encodeBase64(messageToEncode.getBytes());
		return new String(bytesEncoded);

	}

}
