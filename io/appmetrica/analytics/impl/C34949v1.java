package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.v1 */
/* loaded from: classes9.dex */
public final class C34949v1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f95490a;

    /* renamed from: b */
    public final /* synthetic */ int f95491b;

    /* renamed from: c */
    public final /* synthetic */ C33832D1 f95492c;

    public C34949v1(C33832D1 c33832d1, Intent intent, int i) {
        this.f95492c = c33832d1;
        this.f95490a = intent;
        this.f95491b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f95492c.f92686b.mo20990a(this.f95490a, this.f95491b);
    }
}
