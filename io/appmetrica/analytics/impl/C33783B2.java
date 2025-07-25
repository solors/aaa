package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.B2 */
/* loaded from: classes9.dex */
public final class C33783B2 extends BroadcastReceiver {

    /* renamed from: a */
    public final BiConsumer f92600a;

    /* renamed from: b */
    public final ICommonExecutor f92601b;

    public C33783B2(C34292W2 c34292w2, ICommonExecutor iCommonExecutor) {
        this.f92600a = c34292w2;
        this.f92601b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f92601b.execute(new RunnableC33758A2(this, context, intent));
    }
}
