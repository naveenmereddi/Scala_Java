package com.naveenmereddi;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JEventTrackerTest {
	private static final String CONNECTION_EVENT = "Connection";
	JEventTracker eventTracker = new JEventTracker();

	@Before
	public void setUp() throws Exception {
		Event e1 = new Event(1l, "Connection Started", CONNECTION_EVENT);
		Event e2 = new Event(2l,"Connection Ended", CONNECTION_EVENT);
		Event e3 = new Event(3l,"Transfer Started","Transfer");
		Event e4 = new Event(4l,"Transfer Ended","Transfer");
		eventTracker.addEvent(e1);
		eventTracker.addEvent(e2);
		eventTracker.addEvent(e3);
		eventTracker.addEvent(e4);		
	}

	@Test
	public void testfilterBasedOnEventType() {
		List<Event> resultsList = eventTracker.filterBasedOnEventType(CONNECTION_EVENT);
		assertTrue(resultsList.size() == 2);
	}

}
