package protocols;

import messages.Message;

public interface MessageProtocol {
	
	

	public boolean send(Message obj);
	
	public boolean receive(Message obj);
		
}
