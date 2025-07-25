package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.EnumC15414E;

/* renamed from: com.fyber.inneractive.sdk.web.h */
/* loaded from: classes4.dex */
public final class C15527h implements InterfaceC15523f {

    /* renamed from: a */
    public final String f30763a;

    /* renamed from: b */
    public final C15446f0 f30764b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC15529i f30765c;

    public C15527h(AbstractC15529i abstractC15529i, String str, C15446f0 c15446f0) {
        this.f30765c = abstractC15529i;
        this.f30764b = c15446f0;
        this.f30763a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15523f
    /* renamed from: a */
    public final String mo76400a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15523f
    /* renamed from: c */
    public final String mo76398c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15523f
    /* renamed from: d */
    public final void mo76397d() {
        AbstractC15529i abstractC15529i = this.f30765c;
        String str = this.f30763a;
        C15446f0 c15446f0 = this.f30764b;
        InterfaceC15534k0 interfaceC15534k0 = abstractC15529i.f30773g;
        if (interfaceC15534k0 != null) {
            EnumC15414E enumC15414E = interfaceC15534k0.mo76372a(str, c15446f0).f30550a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f30763a;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15523f
    /* renamed from: b */
    public final void mo76399b() {
    }
}
