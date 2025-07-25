package com.fyber.inneractive.sdk.ignite;

import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.ignite.e */
/* loaded from: classes4.dex */
public final class C14559e implements InterfaceC14573r {

    /* renamed from: a */
    public final /* synthetic */ C14563h f27587a;

    public C14559e(C14563h c14563h) {
        this.f27587a = c14563h;
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76412a(String str, String str2) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76412a(str, str2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: b */
    public final void mo76410b(String str) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76410b(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: c */
    public final void mo76409c(String str) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76409c(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76413a(String str, int i, double d) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76413a(str, i, d);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76414a(String str) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76414a(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC14573r
    /* renamed from: a */
    public final void mo76411a(String str, String str2, String str3) {
        Iterator it = this.f27587a.f27599h.iterator();
        while (it.hasNext()) {
            InterfaceC14573r interfaceC14573r = (InterfaceC14573r) it.next();
            if (interfaceC14573r != null) {
                interfaceC14573r.mo76411a(str, str2, str3);
            }
        }
    }
}
