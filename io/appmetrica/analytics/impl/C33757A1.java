package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.A1 */
/* loaded from: classes9.dex */
public final class C33757A1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f92548a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f92549b;

    /* renamed from: c */
    public final /* synthetic */ C33832D1 f92550c;

    public C33757A1(C33832D1 c33832d1, int i, Bundle bundle) {
        this.f92550c = c33832d1;
        this.f92548a = i;
        this.f92549b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92550c.f92686b.reportData(this.f92548a, this.f92549b);
    }
}
