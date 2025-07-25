package com.maticoo.sdk.core;

/* loaded from: classes6.dex */
public interface VideoInterface {
    boolean isAdCloseableTimeOut();

    boolean isAdLoadTimeOut();

    void onPaused();

    void onResumed();

    void startCountdown();
}
