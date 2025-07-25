package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.handler.InterfaceC13782b;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.o1 */
/* loaded from: classes4.dex */
public final class RunnableC14015o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13782b f26127a;

    /* renamed from: b */
    public final /* synthetic */ C14033u1 f26128b;

    public RunnableC14015o1(C14033u1 c14033u1, InterfaceC13782b interfaceC13782b) {
        this.f26128b = c14033u1;
        this.f26127a = interfaceC13782b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26127a.mo78155a(this.f26128b.f26160h);
        } catch (Throwable th) {
            C14033u1 c14033u1 = this.f26128b;
            c14033u1.m78173a(c14033u1.f26160h, new C14068s(EnumC14106t.f26624n5, null, th, null));
        }
    }
}
