package storage;

import java.util.List;

import messages.Message;

public abstract class StorageProvider {

	private List<Message> messages;
	
	public abstract boolean save(List<Message> message);
	
	public List<Message> retrieveAll(){
		return messages;
	}
}
