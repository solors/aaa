package com.facebook.ads.redexgen.p370X;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.It */
/* loaded from: assets/audience_network.dex */
public final class C11986It {
    public final View A00;
    public final C13028Zr A01;
    public final InterfaceC12000J7 A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C11986It(C13028Zr c13028Zr, View view, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = c13028Zr;
        this.A02 = c13028Zr.A09();
        this.A00 = view;
        this.A05 = z2;
        this.A06 = z;
    }

    public final View A00() {
        return this.A00;
    }

    public final C13028Zr A01() {
        return this.A01;
    }

    public final InterfaceC12000J7 A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
