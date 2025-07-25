package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.G */
/* loaded from: classes4.dex */
public final class C15231G {

    /* renamed from: a */
    public final Object f30158a;

    /* renamed from: b */
    public final int f30159b;

    public C15231G(int i, Object obj) {
        this.f30158a = obj;
        this.f30159b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15231G)) {
            return false;
        }
        C15231G c15231g = (C15231G) obj;
        if (this.f30158a != c15231g.f30158a || this.f30159b != c15231g.f30159b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f30158a) * 65535) + this.f30159b;
    }
}
