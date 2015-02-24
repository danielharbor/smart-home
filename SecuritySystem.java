import java.util.List;
import java.util.ArrayList;

public class SecuritySystem extends Electronic {
	
	public SecuritySystem(String name, Room room, boolean state) {
		super(name, room, state);
	}

	@Override
	public List<String> provideDetails() {
		List<String> res = new ArrayList<>();
		res.add("Name: " + this.getName() + "\n");
		res.add("Room: " + this.getRoom().getName() + "\nCurrent State: ");
		if(getState())
			res.add("ON");
		else
			res.add("OFF");
		return res;
	}

}