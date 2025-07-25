package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.InterfaceC14671E;

/* renamed from: com.fyber.inneractive.sdk.measurement.b */
/* loaded from: classes4.dex */
public final class C14583b implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ C14586e f27614a;

    public C14583b(C14586e c14586e) {
        this.f27614a = c14586e;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f27614a.f27620c = str;
        }
    }
}
