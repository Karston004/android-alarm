package com.karstonn.alarm.domain;

import java.util.List;

public interface AlarmController {
    public void setAlarm(Alarm alarm);
    public List<Alarm> listAlarms();
    public void removeAlarm(Alarm alarm);
}
