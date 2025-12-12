package com.karstonn.alarm.domain;

public interface AlarmRepoListener {
    void onAlarmAdded(Alarm alarm);
    void onAlarmRemoved(Alarm alarm);
}
