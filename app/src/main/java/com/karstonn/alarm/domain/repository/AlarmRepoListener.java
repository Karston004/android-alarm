package com.karstonn.alarm.domain.repository;

import com.karstonn.alarm.domain.Alarm;

public interface AlarmRepoListener {
    void onAlarmAdded(Alarm alarm);
    void onAlarmRemoved(Alarm alarm);
}
