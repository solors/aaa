package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ny0 {
    @NotNull

    /* renamed from: a */
    private static final AtomicBoolean f83198a = new AtomicBoolean(false);

    /* renamed from: a */
    public static final void m31230a() {
        if (f83198a.compareAndSet(false, true)) {
            km0.m32486b("Yandex Mobile Ads 7.9.0 initialized successfully", new Object[0]);
        }
    }
}
