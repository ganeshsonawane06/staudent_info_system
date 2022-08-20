
package com.bean;


public class EventBean {
    
    String eventType, eventName, organizedBy, eventDate, eventTime, participatingDepartments, duration, location;

    public EventBean() {
    }

    public EventBean(String eventType, String eventName, String organizedBy, String eventDate, String eventTime, String participatingDepartments, String duration, String location) {
        this.eventType = eventType;
        this.eventName = eventName;
        this.organizedBy = organizedBy;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.participatingDepartments = participatingDepartments;
        this.duration = duration;
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getParticipatingDepartments() {
        return participatingDepartments;
    }

    public void setParticipatingDepartments(String participatingDepartments) {
        this.participatingDepartments = participatingDepartments;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" + "eventType=" + eventType + ", eventName=" + eventName + ", organizedBy=" + organizedBy + ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", participatingDepartments=" + participatingDepartments + ", duration=" + duration + ", location=" + location + '}';
    }
    
}
