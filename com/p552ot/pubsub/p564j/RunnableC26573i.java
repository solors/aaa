package com.p552ot.pubsub.p564j;

import com.p552ot.pubsub.p554b.C26508e;
import com.p552ot.pubsub.util.C26586j;

/* renamed from: com.ot.pubsub.j.i */
/* loaded from: classes7.dex */
public class RunnableC26573i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26566d f69696a;

    public RunnableC26573i(C26566d c26566d) {
        this.f69696a = c26566d;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C26508e.m41413b();
        } catch (Exception e) {
            C26586j.m41080a("UploaderEngine", "handleNetChange: " + e);
        }
    }
}
