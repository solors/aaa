package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.B1 */
/* loaded from: classes9.dex */
public final class C33782B1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f92598a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f92599b;

    public C33782B1(C33832D1 c33832d1, Bundle bundle) {
        this.f92599b = c33832d1;
        this.f92598a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92599b.f92686b.resumeUserSession(this.f92598a);
    }
}
