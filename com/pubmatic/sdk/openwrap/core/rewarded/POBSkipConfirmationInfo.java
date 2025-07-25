package com.pubmatic.sdk.openwrap.core.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class POBSkipConfirmationInfo {
    @NonNull

    /* renamed from: a */
    private final String f70743a;
    @NonNull

    /* renamed from: b */
    private final String f70744b;
    @NonNull

    /* renamed from: c */
    private final String f70745c;
    @NonNull

    /* renamed from: d */
    private final String f70746d;

    public POBSkipConfirmationInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.f70743a = str;
        this.f70744b = str2;
        this.f70745c = str3;
        this.f70746d = str4;
    }

    @NonNull
    public String getCloseText() {
        return this.f70746d;
    }

    @NonNull
    public String getMessage() {
        return this.f70744b;
    }

    @NonNull
    public String getResumeText() {
        return this.f70745c;
    }

    @NonNull
    public String getTitle() {
        return this.f70743a;
    }
}
