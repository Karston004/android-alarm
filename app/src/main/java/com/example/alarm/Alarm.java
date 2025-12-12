package com.example.alarm;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.EnumSet;

public class Alarm {
    public EnumSet<DayOfWeek> activeDays;
    public LocalTime time;
    public Alarm(EnumSet<DayOfWeek> activeDays, LocalTime time) {
        this.activeDays = activeDays.clone();
        this.time = time;
    }
}
