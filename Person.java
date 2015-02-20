import java.util.List;
import java.util.ArrayList;

public class Person extends Thing {
	private String gender;
	
	public Person(String name, String gender, Room room) {
		super(name, room);
		this.gender = gender;
	}

	public String gender() {
		return gender;
	}
	
	@Override
	public List<String> provideDetails() {
		List<String> ans = new ArrayList<>();
		ans.add("Name: " + this.getName() + "\n");
		ans.add("Room: " + this.getRoom().getName() + "\n");
		ans.add("Gender: " + this.gender);
		return ans;
	}
	
}