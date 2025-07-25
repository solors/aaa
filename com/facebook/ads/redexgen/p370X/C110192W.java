package com.facebook.ads.redexgen.p370X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2W */
/* loaded from: assets/audience_network.dex */
public final class C110192W implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C110192W A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C110192W> A04;

    public C110192W(int i, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public C110192W(String str) {
        this(0, null, str);
    }

    private void A00(C110192W c110192w) {
        this.A00 = c110192w;
    }

    public final int A01() {
        return this.A01;
    }

    public final C110192W A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C110192W> A05() {
        return this.A04;
    }

    public final void A06(C110192W c110192w) {
        c110192w.A00(this);
        this.A04.add(c110192w);
    }
}
