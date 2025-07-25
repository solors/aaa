package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1 */
/* loaded from: classes9.dex */
public final class C35027y1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f95629a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f95630b;

    public C35027y1(C33832D1 c33832d1, Intent intent) {
        this.f95630b = c33832d1;
        this.f95629a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95630b.f92686b.mo20986c(this.f95629a);
    }
}
