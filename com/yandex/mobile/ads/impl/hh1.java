package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hh1 {
    @NotNull

    /* renamed from: a */
    private final C31417t0 f80070a = new C31417t0();

    @Nullable
    /* renamed from: a */
    public final String m33551a() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        this.f80070a.getClass();
        return C31417t0.m29333b();
    }
}
