package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import java.util.Locale;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.ViewState */
/* loaded from: classes8.dex */
public enum ViewState {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String toJavascriptString() {
        return toString().toLowerCase(Locale.US);
    }
}
