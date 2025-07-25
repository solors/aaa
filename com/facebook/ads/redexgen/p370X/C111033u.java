package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u */
/* loaded from: assets/audience_network.dex */
public final class C111033u {
    public static final InterfaceC111023t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C11782FV();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C11783FW();
        } else {
            A01 = new C13095ax();
        }
    }

    public C111033u() {
        this.A00 = A01.AAw(this);
    }

    public C111033u(Object obj) {
        this.A00 = obj;
    }

    public final C111013s A00(int i) {
        return null;
    }

    public final C111013s A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C111013s> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}
