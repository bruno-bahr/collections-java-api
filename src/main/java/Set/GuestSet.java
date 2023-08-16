package main.java.Set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
	
	private Set<Guest> guestSet;

	public GuestSet() {
		this.guestSet = new HashSet<>();
	}
	
	public void addGuest(String name, int inviteNumber) {
		Guest guest = new Guest(name, inviteNumber);
		guestSet.add(guest);
	}
	
	public Set<Guest> removeGuest(int inviteNumber) {
		for (Guest g : guestSet) {
			if (g.getInviteNumber() == inviteNumber) {
				guestSet.remove(g);
				break;
			}
		}
		return guestSet;
	}
	
	public int countGuests() {
		return guestSet.size();
	}
	
	public void showGuests() {
		System.out.println(guestSet);
	}
	
	public static void main(String[] args) {
		GuestSet gs = new GuestSet();
		
		gs.addGuest("Bruno", 1);
		gs.addGuest("Breno", 2);
		gs.addGuest("Marcos", 3);
		gs.addGuest("Julia", 4);
		gs.addGuest("Lilly", 4);
		gs.addGuest("Zoey", 5);
		
		System.out.println("Total of guests: " + gs.countGuests());
		
		gs.removeGuest(5);
		
		System.out.println("New total of guests: " + gs.countGuests());
		gs.showGuests();
	}
}

	
