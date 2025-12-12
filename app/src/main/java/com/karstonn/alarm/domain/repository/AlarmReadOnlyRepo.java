package com.karstonn.alarm.domain.repository;

import com.karstonn.alarm.domain.Alarm;

import java.util.List;

public interface AlarmReadOnlyRepo {
    List<Alarm> listAlarms();
}
