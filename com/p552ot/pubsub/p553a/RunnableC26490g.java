package com.p552ot.pubsub.p553a;

import com.p552ot.pubsub.p559g.C26537b;
import com.p552ot.pubsub.util.C26586j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.g */
/* loaded from: classes7.dex */
public class RunnableC26490g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69261a;

    /* renamed from: b */
    final /* synthetic */ C26487d f69262b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26490g(C26487d c26487d, String str) {
        this.f69262b = c26487d;
        this.f69261a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C26537b.m41287a().m41285a(this.f69261a);
        } catch (Exception e) {
            C26586j.m41074b("PubSubTrackImp", "setInstanceId error: " + e.toString());
        }
    }
}
