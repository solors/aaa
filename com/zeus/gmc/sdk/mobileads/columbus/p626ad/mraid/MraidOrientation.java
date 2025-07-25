package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidOrientation */
/* loaded from: classes8.dex */
public enum MraidOrientation {
    PORTRAIT(1),
    LANDSCAPE(0),
    NONE(-1);
    
    private final int mActivityInfoOrientation;

    MraidOrientation(int i) {
        this.mActivityInfoOrientation = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getActivityInfoOrientation() {
        return this.mActivityInfoOrientation;
    }
}
