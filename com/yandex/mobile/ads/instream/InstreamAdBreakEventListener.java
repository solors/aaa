package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InstreamAdBreakEventListener {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(@NotNull String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
