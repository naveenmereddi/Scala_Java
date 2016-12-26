package com.naveenmereddi

case class ScalaEvent(eventId: Long, eventName: String, eventSource: String) {
  
  def canEqual(a:Any) = a.isInstanceOf[ScalaEvent]
  
  override def equals(that: Any): Boolean = 
    that match {
    case that: ScalaEvent => that.equals(this) && this.hashCode() == that.hashCode
    case _ => false
  }
  
  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = result * prime + eventId.toInt ^ (eventId.toInt >>> 32);
    result = prime * result + (if(eventName == null) 0 else eventName.hashCode())
    result = prime * result + (if(eventSource == null) 0 else eventSource.hashCode())
    return result
  }
  
}