package com.karstonn.alarm.domain.repository;

public interface ObserveableAlarmRepo extends AlarmRepo {
    public void addListener (AlarmRepoListener listener);
    public void removeListener(AlarmRepoListener listener);
}
