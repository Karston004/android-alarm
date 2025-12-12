package com.karstonn.alarm.data;

import com.karstonn.alarm.domain.Alarm;
import com.karstonn.alarm.domain.repository.AlarmRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InMemoryAlarmRepo implements AlarmRepo {
    private Map<String,Alarm> alarms = new HashMap<>();

    public void setAlarm(Alarm alarm){
        String alarmID;
        do {alarmID = UUID.randomUUID().toString();} while (alarms.containsKey(alarmID));
        alarms.put(alarmID,new Alarm(alarmID,alarm));
    }
    public List<Alarm> listAlarms(){
        return List.copyOf(new ArrayList<>(alarms.values()));
    }
    public void removeAlarm(String alarmID){
        alarms.remove(alarmID);
    }
}
