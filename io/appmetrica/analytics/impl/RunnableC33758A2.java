package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.A2 */
/* loaded from: classes9.dex */
public final class RunnableC33758A2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f92551a;

    /* renamed from: b */
    public final /* synthetic */ Intent f92552b;

    /* renamed from: c */
    public final /* synthetic */ C33783B2 f92553c;

    public RunnableC33758A2(C33783B2 c33783b2, Context context, Intent intent) {
        this.f92553c = c33783b2;
        this.f92551a = context;
        this.f92552b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92553c.f92600a.consume(this.f92551a, this.f92552b);
    }
}
