package com.learnings.unity.push.localpush;

import java.util.Map;

/* loaded from: classes6.dex */
public class LocalPushModel {
    private long alarmTime;
    Map<String, LocalContentModel> contentMap;
    private int disturbType;
    private Map<String, String> extension;

    /* renamed from: id */
    private String f54999id;
    private boolean isRepeat;
    private long repeatInterval;

    public long getAlarmTime() {
        return this.alarmTime;
    }

    public Map<String, LocalContentModel> getContentMap() {
        return this.contentMap;
    }

    public int getDisturbType() {
        return this.disturbType;
    }

    public Map<String, String> getExtension() {
        return this.extension;
    }

    public String getId() {
        return this.f54999id;
    }

    public long getRepeatInterval() {
        return this.repeatInterval;
    }

    public boolean isRepeat() {
        return this.isRepeat;
    }

    public void setAlarmTime(long j) {
        this.alarmTime = j;
    }

    public void setContentMap(Map<String, LocalContentModel> map) {
        this.contentMap = map;
    }

    public void setDisturbType(int i) {
        this.disturbType = i;
    }

    public void setExtension(Map<String, String> map) {
        this.extension = map;
    }

    public void setId(String str) {
        this.f54999id = str;
    }

    public void setRepeat(boolean z) {
        this.isRepeat = z;
    }

    public void setRepeatInterval(long j) {
        this.repeatInterval = j;
    }
}
