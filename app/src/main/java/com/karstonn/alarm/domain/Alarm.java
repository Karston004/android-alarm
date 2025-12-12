package com.karstonn.alarm.domain;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.EnumSet;

public final class Alarm {
    private final EnumSet<DayOfWeek> activeDays;
    private final LocalTime time;
    public Alarm(EnumSet<DayOfWeek> activeDays, LocalTime time) {
        this.activeDays = activeDays.clone();
        this.time = time;
    }
    public Alarm(Alarm other){
        this.activeDays = other.activeDays.clone();
        this.time = other.time;
    }

    public EnumSet<DayOfWeek> getActiveDays() {return getActiveDays().clone();}
    public LocalTime getTime() {return time;}
}
