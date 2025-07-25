package com.p552ot.pubsub.p553a;

import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.util.C26582g;
import com.p552ot.pubsub.util.C26591m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.o */
/* loaded from: classes7.dex */
public class RunnableC26498o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26487d f69283a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26498o(C26487d c26487d) {
        this.f69283a = c26487d;
    }

    @Override // java.lang.Runnable
    public void run() {
        Configuration configuration;
        configuration = this.f69283a.f69254h;
        C26582g.m41095b(C26591m.m41035a(configuration));
    }
}
