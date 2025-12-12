package com.karstonn.alarm.domain.scheduling;

import com.karstonn.alarm.domain.Alarm;

public interface AlarmScheduler {
    public void setAlarmListener(AlarmFiredListener listener);
    public void schedule(Alarm alarm);
    public void cancel(Alarm alarm);
}
