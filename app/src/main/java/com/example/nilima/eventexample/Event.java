package com.example.nilima.eventexample;

/**
 * Created by nilima on 3/9/17.
 */

public class Event {

    private String title,startDate,endDate;

    public Event(){

    }

    public Event(String title,String startDate,String endDate){

        this.title=title;
        this.startDate=startDate;
        this.endDate=endDate;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    }
