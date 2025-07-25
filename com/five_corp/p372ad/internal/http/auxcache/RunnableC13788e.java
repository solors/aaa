package com.five_corp.p372ad.internal.http.auxcache;

import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.http.auxcache.e */
/* loaded from: classes4.dex */
public final class RunnableC13788e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13793j f25664a;

    /* renamed from: b */
    public final /* synthetic */ C13792i f25665b;

    public RunnableC13788e(C13792i c13792i, C13793j c13793j) {
        this.f25665b = c13792i;
        this.f25664a = c13793j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f25664a.f25687c.iterator();
        while (it.hasNext()) {
            ((C13794k) it.next()).f25703g.remove(this.f25664a.f25685a);
        }
        this.f25665b.m78371a(this.f25664a);
    }
}
