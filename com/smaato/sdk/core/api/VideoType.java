package com.smaato.sdk.core.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes7.dex */
public @interface VideoType {
    @NonNull
    public static final String INTERSTITIAL = "interstitial";
    @NonNull
    public static final String OUTSTREAM = "outstream";
    @NonNull
    public static final String REWARDED = "rewarded";
}
