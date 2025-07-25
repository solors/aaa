package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InstreamAdListener {
    void onError(@NotNull String str);

    void onInstreamAdCompleted();

    void onInstreamAdPrepared();
}
