package com.karstonn.alarm.domain;

import com.karstonn.alarm.domain.repository.AlarmRepoListener;

public final class RepoSchedulerBinder implements AlarmRepoListener {
    AlarmScheduler alarmScheduler;
    public RepoSchedulerBinder (AlarmScheduler scheduler) {this.alarmScheduler = scheduler;}
    @Override
    public void onAlarmAdded(Alarm alarm) {alarmScheduler.schedule(alarm);}
    @Override
    public void onAlarmRemoved(Alarm alarm) {alarmScheduler.cancel(alarm);}
}
