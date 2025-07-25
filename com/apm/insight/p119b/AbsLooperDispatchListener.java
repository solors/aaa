package com.apm.insight.p119b;

import androidx.annotation.CallSuper;

/* renamed from: com.apm.insight.b.e */
/* loaded from: classes2.dex */
public abstract class AbsLooperDispatchListener {

    /* renamed from: a */
    public static long f3623a;

    /* renamed from: b */
    public static long f3624b;

    /* renamed from: c */
    public volatile boolean f3625c = false;

    /* renamed from: a */
    public boolean mo102076a() {
        return false;
    }

    @CallSuper
    /* renamed from: b */
    public void mo102074b(String str) {
        this.f3625c = false;
    }

    @CallSuper
    /* renamed from: a */
    public void mo102075a(String str) {
        this.f3625c = true;
    }
}
