package com.karstonn.alarm.domain.repository;

import com.karstonn.alarm.domain.Alarm;

import java.util.List;

public interface AlarmRepo {
    void setAlarm(Alarm alarm);
    List<Alarm> listAlarms();
    void removeAlarm(String alarmID);
}
