package com.five_corp.p372ad.internal.http;

import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import java.lang.ref.WeakReference;

/* renamed from: com.five_corp.ad.internal.http.a */
/* loaded from: classes4.dex */
public final class C13783a {

    /* renamed from: a */
    public final WeakReference f25654a;

    /* renamed from: b */
    public final WeakReference f25655b;

    /* renamed from: c */
    public final int f25656c;

    public C13783a(C13627a c13627a, C13760i c13760i, int i) {
        this.f25654a = new WeakReference(c13627a);
        this.f25655b = new WeakReference(c13760i);
        this.f25656c = i;
    }

    /* renamed from: a */
    public static C13783a m78374a(C13760i c13760i) {
        return new C13783a(null, c13760i, 3);
    }

    /* renamed from: a */
    public final boolean m78375a() {
        return (this.f25654a.get() == null && this.f25655b.get() == null) ? false : true;
    }
}
