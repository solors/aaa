package com.five_corp.p372ad.internal.bgtask;

import com.five_corp.p372ad.internal.C13837m;

/* renamed from: com.five_corp.ad.internal.bgtask.m */
/* loaded from: classes4.dex */
public abstract class AbstractC13726m {

    /* renamed from: a */
    public final int f25498a;

    /* renamed from: b */
    public final C13837m f25499b;

    public AbstractC13726m(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public final void m78420a() {
        C13837m c13837m = this.f25499b;
        if (c13837m != null) {
            synchronized (c13837m.f25839h) {
                c13837m.f25840i = false;
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo78312b();

    public AbstractC13726m(int i, C13837m c13837m) {
        this.f25498a = i;
        this.f25499b = c13837m;
    }
}
