package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.X */
/* loaded from: classes4.dex */
public final class C15276X implements Comparable {

    /* renamed from: a */
    public final InterfaceC15298f0 f30220a;

    /* renamed from: b */
    public final int f30221b;

    /* renamed from: c */
    public final EnumC15245K1 f30222c;

    /* renamed from: d */
    public final boolean f30223d;

    /* renamed from: e */
    public final boolean f30224e;

    public C15276X(InterfaceC15298f0 interfaceC15298f0, int i, EnumC15245K1 enumC15245K1, boolean z, boolean z2) {
        this.f30220a = interfaceC15298f0;
        this.f30221b = i;
        this.f30222c = enumC15245K1;
        this.f30223d = z;
        this.f30224e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30221b - ((C15276X) obj).f30221b;
    }
}
