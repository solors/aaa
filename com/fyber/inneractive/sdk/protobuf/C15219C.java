package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.protobuf.C */
/* loaded from: classes4.dex */
public final class C15219C {

    /* renamed from: a */
    public final AbstractC15216B f30150a;

    public C15219C(AbstractC15216B abstractC15216B) {
        Charset charset = AbstractC15319m0.f30280a;
        if (abstractC15216B != null) {
            this.f30150a = abstractC15216B;
            abstractC15216B.f30147a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void m77018a(int i, float f) {
        AbstractC15216B abstractC15216B = this.f30150a;
        abstractC15216B.getClass();
        abstractC15216B.mo76694a(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m77019a(int i, double d) {
        AbstractC15216B abstractC15216B = this.f30150a;
        abstractC15216B.getClass();
        abstractC15216B.mo76693a(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m77017a(int i, int i2) {
        this.f30150a.mo76679d(i, AbstractC15216B.m77020d(i2));
    }

    /* renamed from: a */
    public final void m77016a(int i, long j) {
        this.f30150a.mo76685b(i, AbstractC15216B.m77022b(j));
    }

    /* renamed from: a */
    public final void m77015a(int i, Object obj, InterfaceC15271U0 interfaceC15271U0) {
        AbstractC15216B abstractC15216B = this.f30150a;
        abstractC15216B.mo76681c(i, 3);
        interfaceC15271U0.mo76935a((Object) ((InterfaceC15226E0) obj), abstractC15216B.f30147a);
        abstractC15216B.mo76681c(i, 4);
    }
}
