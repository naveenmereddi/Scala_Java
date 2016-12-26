package com.naveenmereddi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JEventTracker {
	
	private List<Event> eventList = new ArrayList<>(5);
	
	public List<Event> filterBasedOnEventType(String eventType) {
		return eventList.stream().filter(e->eventType.equals(e.getEventType())).collect(Collectors.toList());
	}
	
	public void addEvent(Event evt) {
		eventList.add(evt);
	}

}
