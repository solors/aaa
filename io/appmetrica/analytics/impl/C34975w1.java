package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1 */
/* loaded from: classes9.dex */
public final class C34975w1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f95534a;

    /* renamed from: b */
    public final /* synthetic */ int f95535b;

    /* renamed from: c */
    public final /* synthetic */ int f95536c;

    /* renamed from: d */
    public final /* synthetic */ C33832D1 f95537d;

    public C34975w1(C33832D1 c33832d1, Intent intent, int i, int i2) {
        this.f95537d = c33832d1;
        this.f95534a = intent;
        this.f95535b = i;
        this.f95536c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95537d.f92686b.mo20989a(this.f95534a, this.f95535b, this.f95536c);
    }
}
