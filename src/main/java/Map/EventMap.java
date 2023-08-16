package main.java.Map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventMap {
	
	 private Map<LocalDate, Event> eventMap;

	  public EventMap() {
	    this.eventMap = new HashMap<>();
	  }

	  public void addEvent(LocalDate date, String name, String atraction) {
	    Event event = new Event(name, atraction);
	    eventMap.put(date, event);
	  }

	  public void showEvents() {
	    Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
	    System.out.println(eventTreeMap);
	  }

	  public void getNextEvent() {
	    /*Set<LocalDate> dateSet = eventosMap.keySet();
	    Collection<Evento> values = eventosMap.values();*/
	    //eventosMap.get();
	    LocalDate currentDate = LocalDate.now();
	    LocalDate nextDate = null;
	    Event nextEvent = null;
	    Map<LocalDate, Event> eventosTreeMap = new TreeMap<>(eventMap);
	    for (Map.Entry<LocalDate, Event> entry : eventosTreeMap.entrySet()) {
	      if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
	    	nextDate = entry.getKey();
	        nextEvent = entry.getValue();
	        System.out.println("Next event is: " + nextEvent + " on " + nextDate);
	        break;
	      }
	    }
	  }

	  public static void main(String[] args) {
	    EventMap em = new EventMap();
	    em.addEvent(LocalDate.of(2022, Month.JULY, 15), "Event 1", "Atraction 1");
	    em.addEvent(LocalDate.of(2022, 7, 9), "Event 2", "Atraction 2");
	    em.addEvent(LocalDate.of(2023, Month.AUGUST, 15), "Event 3", "Atraction 3");
	    em.addEvent(LocalDate.of(2023, Month.AUGUST, 21), "Event 5", "Atraction 5");
	    em.addEvent(LocalDate.of(2024, Month.SEPTEMBER, 20), "Event 6", "Atraction 6");

	    em.showEvents();

	    em.getNextEvent();
	  }

}
