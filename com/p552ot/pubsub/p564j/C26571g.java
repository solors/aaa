package com.p552ot.pubsub.p564j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p552ot.pubsub.p557e.C26532a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.j.g */
/* loaded from: classes7.dex */
public class C26571g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C26566d f69694a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26571g(C26566d c26566d) {
        this.f69694a = c26566d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z;
        z = this.f69694a.f69685j;
        if (!z) {
            C26532a.m41292a(new RunnableC26572h(this));
        }
        this.f69694a.f69685j = false;
    }
}
