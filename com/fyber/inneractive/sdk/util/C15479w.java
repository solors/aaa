package com.fyber.inneractive.sdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.fyber.inneractive.sdk.util.w */
/* loaded from: classes4.dex */
public final class C15479w extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C15483z f30629a;

    public C15479w(C15483z c15483z) {
        this.f30629a = c15483z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C15483z c15483z = this.f30629a;
        c15483z.getClass();
        IAlog.m76529a("%sonReceive. action = %s", IAlog.m76531a(c15483z), intent.getAction());
        C15483z.m76444a(this.f30629a, context, intent);
    }
}
