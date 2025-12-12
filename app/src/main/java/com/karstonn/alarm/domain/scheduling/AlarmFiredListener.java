package com.karstonn.alarm.domain.scheduling;

import com.karstonn.alarm.domain.Alarm;

public interface AlarmFiredListener {
    public void onAlarmFired(Alarm alarm);
}
