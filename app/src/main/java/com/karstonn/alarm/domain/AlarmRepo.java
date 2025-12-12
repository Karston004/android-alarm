package com.karstonn.alarm.domain;

import java.util.List;

public interface AlarmRepo {
    public void setAlarm(Alarm alarm);
    public List<Alarm> listAlarms();
    public void removeAlarm(Alarm alarm);
}
