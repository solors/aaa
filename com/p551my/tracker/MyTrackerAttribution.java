package com.p551my.tracker;

/* renamed from: com.my.tracker.MyTrackerAttribution */
/* loaded from: classes7.dex */
public final class MyTrackerAttribution {
    private final String deeplink;

    private MyTrackerAttribution(String str) {
        this.deeplink = str;
    }

    public static MyTrackerAttribution newAttribution(String str) {
        return new MyTrackerAttribution(str);
    }

    public String getDeeplink() {
        return this.deeplink;
    }
}
