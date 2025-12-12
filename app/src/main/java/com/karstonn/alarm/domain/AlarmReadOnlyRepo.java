package com.karstonn.alarm.domain;

import java.util.List;

public interface AlarmReadOnlyRepo {
    public List<Alarm> listAlarms();
}
