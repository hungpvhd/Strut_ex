package entity;

import java.util.Calendar;

public class Event {
  private long id;
  private String date;
  private String time;
  private String plan;
  private String place;
  private String description;

  public Event() {
    this.id = Calendar.getInstance().getTimeInMillis();
  }

  public Event(long id, String date, String time, String plan, String place, String description) {
    this.id = id;
    this.date = date;
    this.time = time;
    this.plan = plan;
    this.place = place;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
