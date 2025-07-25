package com.learnings.usertag.processor.model;

/* loaded from: classes6.dex */
public class DynamicAdValue {
    private double ecpm;
    private long time;

    public DynamicAdValue(double d, long j) {
        this.ecpm = d;
        this.time = j;
    }

    public double getEcpm() {
        return this.ecpm;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isTimeValid() {
        if (Math.abs(System.currentTimeMillis() - this.time) <= 259200000) {
            return true;
        }
        return false;
    }

    public void setEcpm(double d) {
        this.ecpm = d;
    }

    public void setTime(long j) {
        this.time = j;
    }
}
