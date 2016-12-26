package com.naveenmereddi

object ScalaEventTrackerObj {
  def main(args: Array[String]): Unit = {
    var e1 : ScalaEvent = new ScalaEvent(1l,"Connection Started","Connection")
    var e2 = new ScalaEvent(2l,"Connection Ended","Connection")
    var e3 = new ScalaEvent(3l,"Transfer Started","Transfer")
    var e4 = new ScalaEvent(4l,"Transfer Ended", "Transfer")
    
    var scalaEventTracker = new ScalaEventTracker
    scalaEventTracker.addEvent(e1)
    scalaEventTracker.addEvent(e2)
    scalaEventTracker.addEvent(e3)
    scalaEventTracker.addEvent(e4)
    
    var filteredList = scalaEventTracker.filterBasedOnEventType("Connection")
    filteredList.foreach(println)
    
  }
}