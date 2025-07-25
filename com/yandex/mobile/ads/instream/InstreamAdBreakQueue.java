package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface InstreamAdBreakQueue<T> {
    int getCount();

    @Nullable
    T poll();
}
