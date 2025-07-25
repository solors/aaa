package com.meevii.abtest.model;

import android.os.Bundle;
import com.learnings.abcenter.util.AbCenterAnalyzeUtil;
import com.meevii.abtest.util.AbTestLog;

/* loaded from: classes6.dex */
public class AbEvent {
    private final Bundle bundle;
    private final String eventName;

    public AbEvent(String str, Bundle bundle) {
        this.eventName = str;
        this.bundle = bundle;
    }

    public void send() {
        if (AbTestLog.isShowLog()) {
            AbTestLog.log("sendEvent: " + AbCenterAnalyzeUtil.getEventLog(this.eventName, this.bundle));
        }
        AbCenterAnalyzeUtil.sendEvent(this.eventName, this.bundle);
    }
}
