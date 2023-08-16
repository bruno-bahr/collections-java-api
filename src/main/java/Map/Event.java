package main.java.Map;

public class Event {

	private String name;
	private String atraction;

	public Event(String name, String atraction) {
	    this.name = name;
	    this.atraction = atraction;
	  }

	public String getName() {
		return name;
	}

	public String getAtraction() {
		return atraction;
	}

	@Override
	public String toString() {
		return "Event{" + "name='" + name + '\'' + ", atraction=" + atraction + '}';
	}
}
