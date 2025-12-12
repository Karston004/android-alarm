package com.karstonn.alarm.domain.repository;

public interface ObserveableAlarmReadOnlyRepo extends AlarmReadOnlyRepo {
    void addListener (AlarmRepoListener listener);
    void removeListener(AlarmRepoListener listener);
}
