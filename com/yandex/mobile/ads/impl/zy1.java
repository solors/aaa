package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class zy1 implements InterfaceC30182do {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30182do
    /* renamed from: a */
    public final long mo25950a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30182do
    /* renamed from: b */
    public final long mo25948b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30182do
    /* renamed from: a */
    public final qc0 mo25949a(Looper looper, @Nullable Handler.Callback callback) {
        return new bz1(new Handler(looper, callback));
    }
}
