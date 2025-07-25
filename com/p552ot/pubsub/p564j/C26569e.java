package com.p552ot.pubsub.p564j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p552ot.pubsub.p557e.C26532a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.j.e */
/* loaded from: classes7.dex */
public class C26569e extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C26566d f69691a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26569e(C26566d c26566d) {
        this.f69691a = c26566d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C26532a.m41292a(new RunnableC26570f(this, intent.getAction()));
    }
}
