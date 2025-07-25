package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.InterfaceC14671E;

/* renamed from: com.fyber.inneractive.sdk.cache.g */
/* loaded from: classes4.dex */
public final class C14270g implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ C14272i f26970a;

    public C14270g(C14272i c14272i) {
        this.f26970a = c14272i;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f26970a.f26974c = str;
        }
    }
}
