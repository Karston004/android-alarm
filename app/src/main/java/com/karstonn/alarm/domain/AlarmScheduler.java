package com.karstonn.alarm.domain;

public interface AlarmScheduler {
    public void setAlarmListener(AlarmFiredListener listener);
    public void schedule(Alarm alarm);
    public void cancel(Alarm alarm);
}
