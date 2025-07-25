package com.yandex.mobile.ads.impl;

import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;

@MainThread
/* loaded from: classes8.dex */
public interface qq0 {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(@NotNull String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
