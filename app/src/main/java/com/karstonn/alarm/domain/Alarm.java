package com.karstonn.alarm.domain;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.EnumSet;

public final class Alarm {
    private final EnumSet<DayOfWeek> activeDays;
    private final LocalTime time;
    private final String alarmID;
    public Alarm(String alarmID,EnumSet<DayOfWeek> activeDays, LocalTime time) {
        this.alarmID = alarmID;
        this.activeDays = activeDays.clone();
        this.time = time;
    }
    public Alarm(String alarmID,Alarm other){
        this.alarmID = alarmID;
        this.activeDays = other.activeDays.clone();
        this.time = other.time;
    }
    public String getAlarmID() {return alarmID;}

    public EnumSet<DayOfWeek> getActiveDays() {return activeDays.clone();}
    public LocalTime getTime() {return time;}
}