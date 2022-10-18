package com.example.demoeventlistener;

import org.springframework.context.ApplicationEvent;

public class DoorBellEvent extends ApplicationEvent {
    public String guestName;
    public DoorBellEvent(Object source, String guestName){
        super(source);
        this.guestName=guestName;
    }

    public String getGuestName(){
        return guestName;
    }
}
