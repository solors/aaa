package com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base;

import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;

/* loaded from: classes8.dex */
public class TrackAction extends Action {
    public TrackAction setAction(String str) {
        addContent(C32805atnntnannta.atntaanaa, str);
        return this;
    }

    public TrackAction setCategory(String str) {
        addContent(C32805atnntnannta.atnaaata, str);
        return this;
    }

    public TrackAction setLabel(String str) {
        addContent("_label_", str);
        return this;
    }

    public TrackAction setValue(long j) {
        addContent("_value_", j + "");
        return this;
    }
}
