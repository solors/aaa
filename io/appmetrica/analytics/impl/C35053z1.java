package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1 */
/* loaded from: classes9.dex */
public final class C35053z1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f95672a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f95673b;

    public C35053z1(C33832D1 c33832d1, Intent intent) {
        this.f95673b = c33832d1;
        this.f95672a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95673b.f92686b.mo20987b(this.f95672a);
    }
}
