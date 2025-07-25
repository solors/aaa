package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1 */
/* loaded from: classes9.dex */
public final class C35001x1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f95584a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f95585b;

    public C35001x1(C33832D1 c33832d1, Intent intent) {
        this.f95585b = c33832d1;
        this.f95584a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95585b.f92686b.mo20991a(this.f95584a);
    }
}
