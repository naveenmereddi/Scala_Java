package com.naveenmereddi

import scala.collection.mutable.ListBuffer

class ScalaEventTracker {
  
  private var eventList = ListBuffer[ScalaEvent]()
  
  def addEvent(event: ScalaEvent) : Unit = {
    eventList+=event
  }
  
  def filterBasedOnEventType(eventType: String) : ListBuffer[ScalaEvent] = {
    eventList.filter(_.eventSource.equals(eventType))
  }
  
}