package com.karstonn.alarm.domain.repository;

import com.karstonn.alarm.domain.Alarm;

import java.util.List;

public interface AlarmRepo {
    public void setAlarm(Alarm alarm);
    public List<Alarm> listAlarms();
    public void removeAlarm(Alarm alarm);
}
