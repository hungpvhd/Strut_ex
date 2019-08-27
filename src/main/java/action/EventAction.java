package action;

import entity.Event;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventAction extends ActionSupport {
  private static List<Event> eventList = new ArrayList<Event>();
  private Event event ;
  public static long eventId = 0;

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public void setEventList(List<Event> eventList) {
    this.eventList = eventList;
  }

  public List<Event> getEventList() {
    return eventList;
  }

  public String createEvent(){
    this.event = new Event();
    return SUCCESS;
  }
  public String deleteEvent(){
    Iterator it =  eventList.iterator();
    while (it.hasNext()){
      Event ev = (Event)it.next();
      if (ev.getId() == this.event.getId()){
        System.out.println(this.event.getId());
        it.remove();
        break;
      }
    }
    return SUCCESS;
  }

  public String store(){
    if(eventId != 0){
      for (int i = 0 ; i< eventList.size() ; i++){
        if (eventList.get(i).getId() == eventId){
          this.event.setId(eventId);
          eventList.set(i,this.event);
          eventId = 0;
          break;
        }
      }
      return SUCCESS;
    }
    if (this.event != null){
      eventList.add(this.event);

    }
    return SUCCESS;
  }

  public String edit(){
    eventId = this.event.getId();
    System.out.println(this.event.getId());
    return SUCCESS;
  }
  @Override
  public void validate() {
    if (this.event == null) {
      return;
    }
    if (this.event.getDate()== null
            || this.event.getDate().trim().length() == 0
    ) {
      addFieldError("event.date", "please enter infomation!");
    }
    if (this.event.getDescription()== null  || this.event.getDescription().trim().length() == 0){
      addFieldError("event.description", "please enter infomation!");
    }
    if (this.event.getPlan()== null  || this.event.getPlan().trim().length() == 0){
      addFieldError("event.plan", "please enter infomation!");
    }
    if (this.event.getTime()== null  || this.event.getTime().trim().length() == 0){
      addFieldError("event.time", "please enter infomation!");
    }
    if (this.event.getPlace()== null  || this.event.getPlace().trim().length() == 0){
      addFieldError("event.place", "please enter infomation!");
    }
  }
}
