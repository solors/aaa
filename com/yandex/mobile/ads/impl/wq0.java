package com.yandex.mobile.ads.impl;

import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class wq0<T> {
    @NotNull

    /* renamed from: a */
    private final Queue<T> f87333a;

    public wq0(@NotNull Queue<T> queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f87333a = queue;
    }

    /* renamed from: a */
    public final int m27853a() {
        return this.f87333a.size();
    }

    @Nullable
    /* renamed from: b */
    public final T m27852b() {
        return this.f87333a.poll();
    }
}
