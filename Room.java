import java.util.List;
import java.util.ArrayList;

public class Room extends Thing {
	
	public Room(String name) {
		super(name, null);
	}

	@Override
	public List<String> provideDetails() {
		List<String> ans = new ArrayList<>();
		ans.add(this.getName() + " entities: \n");
		for(Thing o : Simulator.getThings()) {
			if(o.getRoom() == this) {  // check primitive comparison
				ans.add(o.getName() + "\n");
			}
		}
		return ans;
	}

}