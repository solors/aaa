package com.facebook.ads.redexgen.p370X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8I */
/* loaded from: assets/audience_network.dex */
public final class C113608I {
    public double A00;
    public double A01 = System.currentTimeMillis() / 1000.0d;
    public String A02;
    public Map<String, String> A03;

    public C113608I(double d, String str, Map<String, String> mData) {
        this.A00 = d;
        this.A02 = str;
        this.A03 = mData;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return EnumC12003JA.A0A.toString();
    }

    public final Map<String, String> A04() {
        return this.A03;
    }
}
