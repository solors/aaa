package com.p552ot.pubsub.p554b;

import com.p552ot.pubsub.util.C26586j;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.b.i */
/* loaded from: classes7.dex */
public class RunnableC26513i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f69351a;

    /* renamed from: b */
    final /* synthetic */ C26511h f69352b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26513i(C26511h c26511h, ArrayList arrayList) {
        this.f69352b = c26511h;
        this.f69351a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C26586j.f69734a) {
            C26586j.m41080a("ConfigDbManager", "update: " + this.f69351a);
        }
        this.f69352b.m41394b(this.f69351a);
    }
}
