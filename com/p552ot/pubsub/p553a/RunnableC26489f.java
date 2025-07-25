package com.p552ot.pubsub.p553a;

import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.util.C26591m;
import com.p552ot.pubsub.util.C26596q;
import com.p552ot.pubsub.util.C26599t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.f */
/* loaded from: classes7.dex */
public class RunnableC26489f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f69259a;

    /* renamed from: b */
    final /* synthetic */ C26487d f69260b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26489f(C26487d c26487d, boolean z) {
        this.f69260b = c26487d;
        this.f69259a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26596q c26596q;
        Configuration configuration;
        c26596q = this.f69260b.f69255i;
        c26596q.m41011a(this.f69259a);
        configuration = this.f69260b.f69254h;
        C26599t.m40992a(C26591m.m41035a(configuration), this.f69259a);
    }
}
