package com.Karstonn.alarm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AlarmManager implements  AlarmController{

    List<Alarm> alarms = new ArrayList<>();
    public void setAlarm(Alarm alarm){
        alarms.add(new Alarm(alarm));
    }
    public List<Alarm> listAlarms(){
        return  Collections.unmodifiableList(alarms);
    }
    public void removeAlarm(Alarm alarm){
        alarms.remove(alarm);
    }
}
