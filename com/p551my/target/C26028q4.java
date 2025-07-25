package com.p551my.target;

import com.p551my.target.InterfaceC25994p0;
import com.p551my.target.InterfaceC26003p4;

/* renamed from: com.my.target.q4 */
/* loaded from: classes7.dex */
public class C26028q4 implements InterfaceC26003p4, InterfaceC25994p0.InterfaceC25995a {

    /* renamed from: a */
    public final C26106t3 f67630a;

    /* renamed from: b */
    public final InterfaceC26003p4.InterfaceC26004a f67631b;

    /* renamed from: c */
    public int f67632c;

    public C26028q4(C26106t3 c26106t3, InterfaceC26003p4.InterfaceC26004a interfaceC26004a) {
        this.f67630a = c26106t3;
        this.f67631b = interfaceC26004a;
    }

    @Override // com.p551my.target.InterfaceC26003p4
    /* renamed from: a */
    public void mo43138a(InterfaceC25994p0 interfaceC25994p0, int i) {
        this.f67632c = i;
        this.f67631b.mo42783a(this.f67630a);
        interfaceC25994p0.setBanner(this.f67630a);
        interfaceC25994p0.setListener(this);
    }

    /* renamed from: a */
    public static InterfaceC26003p4 m43137a(C26106t3 c26106t3, InterfaceC26003p4.InterfaceC26004a interfaceC26004a) {
        return new C26028q4(c26106t3, interfaceC26004a);
    }

    @Override // com.p551my.target.InterfaceC25994p0.InterfaceC25995a
    /* renamed from: a */
    public void mo43136a(boolean z, int i) {
        this.f67631b.mo42782a(this.f67630a, z, this.f67632c, i);
    }

    @Override // com.p551my.target.InterfaceC26003p4
    /* renamed from: a */
    public void mo43139a(InterfaceC25994p0 interfaceC25994p0) {
        interfaceC25994p0.setBanner(null);
        interfaceC25994p0.setListener(null);
    }
}
