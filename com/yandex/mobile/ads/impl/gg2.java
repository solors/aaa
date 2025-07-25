package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gg2<T> implements InstreamAdBreakQueue<T> {
    @NotNull

    /* renamed from: a */
    private final wq0<T> f79660a;

    public gg2(@NotNull wq0<T> manualAdBreakQueue) {
        Intrinsics.checkNotNullParameter(manualAdBreakQueue, "manualAdBreakQueue");
        this.f79660a = manualAdBreakQueue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f79660a.m27853a();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    @Nullable
    public final T poll() {
        return this.f79660a.m27852b();
    }
}
