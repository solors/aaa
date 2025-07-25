package com.five_corp.p372ad.internal.system;

import com.five_corp.p372ad.internal.util.C14120h;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.TimerTask;

/* renamed from: com.five_corp.ad.internal.system.j */
/* loaded from: classes4.dex */
public final class C14103j extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C14105l f26312a;

    public C14103j(C14105l c14105l) {
        this.f26312a = c14105l;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        C14105l c14105l = this.f26312a;
        synchronized (c14105l.f26314a) {
            C14120h c14120h = c14105l.f26317d;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
            if (c14105l.f26318e != null && arrayList.isEmpty()) {
                c14105l.f26318e.cancel();
                c14105l.f26318e = null;
            }
        }
        if (!arrayList.isEmpty()) {
            c14105l.f26315b.post(new RunnableC14104k(arrayList));
        }
    }
}
