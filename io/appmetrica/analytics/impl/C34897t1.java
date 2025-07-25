package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.t1 */
/* loaded from: classes9.dex */
public final class C34897t1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Configuration f95367a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f95368b;

    public C34897t1(C33832D1 c33832d1, Configuration configuration) {
        this.f95368b = c33832d1;
        this.f95367a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95368b.f92686b.onConfigurationChanged(this.f95367a);
    }
}
