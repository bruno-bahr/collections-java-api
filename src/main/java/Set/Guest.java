package main.java.Set;

import java.util.Objects;

public class Guest {

	private String name;
	
	private int inviteNumber;

	public Guest(String name, int inviteNumber) {
		this.name = name;
		this.inviteNumber = inviteNumber;
	}

	public String getName() {
		return name;
	}

	public int getInviteNumber() {
		return inviteNumber;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(inviteNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return inviteNumber == other.inviteNumber;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", inviteNumber=" + inviteNumber + "]";
	}
	
	
}
