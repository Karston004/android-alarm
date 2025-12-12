package com.karstonn.alarm.domain.repository;

public interface ObserveableAlarmReadOnlyRepo extends AlarmReadOnlyRepo {
    public void addListener (AlarmRepoListener listener);
    public void removeListener(AlarmRepoListener listener);
}
