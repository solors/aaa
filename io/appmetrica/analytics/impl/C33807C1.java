package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.C1 */
/* loaded from: classes9.dex */
public final class C33807C1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f92663a;

    /* renamed from: b */
    public final /* synthetic */ C33832D1 f92664b;

    public C33807C1(C33832D1 c33832d1, Bundle bundle) {
        this.f92664b = c33832d1;
        this.f92663a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f92664b.f92686b.pauseUserSession(this.f92663a);
    }
}
