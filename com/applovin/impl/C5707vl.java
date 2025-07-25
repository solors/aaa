package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.applovin.impl.vl */
/* loaded from: classes2.dex */
public class C5707vl implements InterfaceC4747l3 {
    @Override // com.applovin.impl.InterfaceC4747l3
    /* renamed from: a */
    public long mo93852a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.applovin.impl.InterfaceC4747l3
    /* renamed from: c */
    public long mo93849c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.InterfaceC4747l3
    /* renamed from: a */
    public InterfaceC4576ia mo93851a(Looper looper, Handler.Callback callback) {
        return new C5789wl(new Handler(looper, callback));
    }

    @Override // com.applovin.impl.InterfaceC4747l3
    /* renamed from: b */
    public void mo93850b() {
    }
}
