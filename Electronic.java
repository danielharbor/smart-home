public abstract class Electronic extends Thing {
	private boolean state;
	
	public Electronic(String name, Room room, boolean state) {
		super(name, room);
		this.state = state;
	}

	public void toggleSwitch() {
		state = state ? false : true;
//		GUI.refreshGUI();
	}
	
	public boolean getState() {
		return state;
	}
}