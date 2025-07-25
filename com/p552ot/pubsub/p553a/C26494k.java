package com.p552ot.pubsub.p553a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p552ot.pubsub.p557e.C26532a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.k */
/* loaded from: classes7.dex */
public class C26494k extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C26487d f69277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26494k(C26487d c26487d) {
        this.f69277a = c26487d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C26532a.m41292a(new RunnableC26495l(this, intent.getAction()));
    }
}
