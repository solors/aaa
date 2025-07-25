package com.facebook.ads.redexgen.p370X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rl */
/* loaded from: assets/audience_network.dex */
public final class C12531Rl {
    public float A00;
    public EnumC108900Q A01;
    public Map<String, String> A02;

    public C12531Rl(EnumC108900Q enumC108900Q) {
        this(enumC108900Q, 0.0f);
    }

    public C12531Rl(EnumC108900Q enumC108900Q, float f) {
        this(enumC108900Q, f, null);
    }

    public C12531Rl(EnumC108900Q enumC108900Q, float f, Map<String, String> windowParams) {
        this.A01 = enumC108900Q;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC108900Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC108900Q.A0I;
    }
}
