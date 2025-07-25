package com.five_corp.p372ad.internal.bgtask;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14116d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.bgtask.b */
/* loaded from: classes4.dex */
public final class C13715b {

    /* renamed from: a */
    public final C13714a f25472a;

    /* renamed from: b */
    public final ArrayList f25473b;

    public C13715b(int i, C14116d c14116d, C13836a c13836a) {
        this.f25472a = new C13714a(c13836a);
        this.f25473b = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f25473b.add(new C13718e(i2, this.f25472a, c14116d));
        }
    }

    /* renamed from: a */
    public final void m78424a(AbstractC13726m abstractC13726m) {
        C13714a c13714a = this.f25472a;
        c13714a.getClass();
        c13714a.m78426a(new C13720g(abstractC13726m, c13714a.f25471c));
        Iterator it = this.f25473b.iterator();
        while (it.hasNext()) {
            C13718e c13718e = (C13718e) it.next();
            c13718e.f25479d.post(new RunnableC13716c(c13718e));
        }
    }

    /* renamed from: a */
    public final void m78425a() {
        C13714a c13714a = this.f25472a;
        synchronized (c13714a.f25469a) {
            Iterator it = c13714a.f25470b.iterator();
            while (it.hasNext()) {
                ((C13720g) it.next()).f25486c = 0L;
            }
        }
        Iterator it2 = this.f25473b.iterator();
        while (it2.hasNext()) {
            C13718e c13718e = (C13718e) it2.next();
            c13718e.f25479d.post(new RunnableC13716c(c13718e));
        }
    }
}
