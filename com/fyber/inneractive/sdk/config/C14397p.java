package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.network.InterfaceC14671E;
import com.fyber.inneractive.sdk.util.AbstractC15465p;

/* renamed from: com.fyber.inneractive.sdk.config.p */
/* loaded from: classes4.dex */
public final class C14397p implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ C14411s f27228a;

    public C14397p(C14411s c14411s) {
        this.f27228a = c14411s;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        C14396o c14396o = (C14396o) obj;
        if (c14396o != null) {
            C14411s c14411s = this.f27228a;
            if (!c14396o.equals(c14411s.f27275b)) {
                c14411s.f27277d = true;
                c14411s.f27275b = c14396o;
                AbstractC15465p.f30611a.execute(new RunnableC14398q(c14411s));
            }
        }
    }
}
