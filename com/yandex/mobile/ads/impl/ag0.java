package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ag0 {
    @NotNull

    /* renamed from: a */
    private static final AtomicLong f76783a = new AtomicLong();

    /* renamed from: a */
    public static final long m35902a() {
        return f76783a.getAndIncrement();
    }
}
