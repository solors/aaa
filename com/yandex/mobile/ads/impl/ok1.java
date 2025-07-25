package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ok1 implements nk1 {
    @Nullable

    /* renamed from: a */
    private Long f83544a;

    @Override // com.yandex.mobile.ads.impl.nk1
    /* renamed from: a */
    public final void mo30968a() {
        this.f83544a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.yandex.mobile.ads.impl.nk1
    /* renamed from: b */
    public final long mo30967b() {
        Long l = this.f83544a;
        if (l != null) {
            return SystemClock.elapsedRealtime() - l.longValue();
        }
        return 0L;
    }
}
