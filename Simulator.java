import java.util.*;

public class Simulator {
	private static Set<Thing> thingsInSimulation;
	
	static {
		thingsInSimulation = new HashSet<>();
		Room room1 = new Room("Kitchen");
		Room room2 = new Room("Living Room");
		Person jane = new Person("Jane", "F", room1);
		Person john = new Person("John", "M", room2);
		Microwave sonyMicrowave = new Microwave("Sony Microwave", room1, true);
		Microwave samsungMicrowave = new Microwave("Samsung Microwave", room1, false);
		thingsInSimulation.add(jane);
		thingsInSimulation.add(john);
		thingsInSimulation.add(room1);
		thingsInSimulation.add(room2);
		thingsInSimulation.add(sonyMicrowave);
		thingsInSimulation.add(samsungMicrowave);
	}
	
	public static Set<Thing> getThings() {
		return thingsInSimulation;
	}
}