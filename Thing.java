import java.util.List;
import java.util.ArrayList;

public abstract class Thing {
	private String name;
	private Room room;
	
	public Thing(String name, Room room) {
		this.name = name;
		this.room = room;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract List<String> provideDetails();
	
	public Room getRoom() {
		return room;
	}
	
	@Override
	public String toString() {
		return name;
	}
}