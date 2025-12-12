package com.karstonn.alarm.data;

import com.karstonn.alarm.domain.Alarm;
import com.karstonn.alarm.domain.repository.AlarmRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class InMemoryAlarmRepo implements AlarmRepo {
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
