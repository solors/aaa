package com.five_corp.p372ad.internal.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.util.C14118f;

/* renamed from: com.five_corp.ad.internal.cache.f */
/* loaded from: classes4.dex */
public final class C13733f {

    /* renamed from: a */
    public final C13743p f25509a;

    /* renamed from: b */
    public final Handler f25510b = new Handler(Looper.getMainLooper());

    public C13733f(C13743p c13743p) {
        this.f25509a = c13743p;
    }

    /* renamed from: a */
    public final C13729b m78419a(Context context, C13691u c13691u) {
        C13729b c13729b = new C13729b(context, this, c13691u);
        c13729b.f25504a.m78418a(c13729b.f25505b, new C13728a(c13729b));
        return c13729b;
    }

    /* renamed from: a */
    public final void m78418a(C13691u c13691u, InterfaceC13732e interfaceC13732e) {
        C14118f c14118f;
        C13741n c13741n = (C13741n) this.f25509a.f25537a.get(c13691u);
        if (c13741n == null) {
            this.f25510b.post(new RunnableC13730c(interfaceC13732e));
            return;
        }
        String str = c13691u.f25401a;
        Handler handler = this.f25510b;
        synchronized (c13741n.f25526a) {
            if (c13741n.f25531f) {
                c14118f = new C14118f(false, new C14068s(EnumC14106t.f26467S5, null, null, null), null);
            } else {
                if (c13741n.f25533h == null) {
                    c13741n.f25533h = new C13736i(c13741n, str, handler);
                }
                c14118f = new C14118f(true, null, c13741n.f25533h);
            }
        }
        if (!c14118f.f26746a) {
            this.f25510b.post(new RunnableC13731d(interfaceC13732e, c14118f));
        } else {
            ((C13736i) c14118f.f26748c).m78417a(interfaceC13732e);
        }
    }
}
