package com.five_corp.p372ad.internal.system;

import android.content.Context;
import android.net.ConnectivityManager;
import com.five_corp.p372ad.C13614i;
import com.five_corp.p372ad.internal.http.auxcache.C13792i;
import com.five_corp.p372ad.internal.http.auxcache.RunnableC13787d;
import com.five_corp.p372ad.internal.http.movcache.C13812h;
import com.five_corp.p372ad.internal.http.movcache.RunnableC13808d;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14120h;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.system.h */
/* loaded from: classes4.dex */
public final class C14101h {

    /* renamed from: a */
    public final Context f26307a;

    /* renamed from: b */
    public final ConnectivityManager f26308b;

    /* renamed from: c */
    public final C13836a f26309c;

    /* renamed from: d */
    public final Object f26310d = new Object();

    /* renamed from: e */
    public final C14120h f26311e = new C14120h();

    public C14101h(Context context, C13836a c13836a) {
        this.f26307a = context;
        this.f26308b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f26309c = c13836a;
    }

    /* renamed from: a */
    public final void m78102a() {
        ArrayList arrayList;
        synchronized (this.f26310d) {
            C14120h c14120h = this.f26311e;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13614i c13614i = (C13614i) ((InterfaceC14098e) it.next());
            c13614i.f25104o.m78425a();
            c13614i.f25105p.m78425a();
            C13792i c13792i = c13614i.f25114y;
            c13792i.f25674b.post(new RunnableC13787d(c13792i));
            C13812h c13812h = c13614i.f25115z;
            c13812h.f25738b.post(new RunnableC13808d(c13812h));
        }
    }

    /* renamed from: b */
    public final void m78101b() {
        this.f26308b.registerDefaultNetworkCallback(new C14099f(this));
    }
}
