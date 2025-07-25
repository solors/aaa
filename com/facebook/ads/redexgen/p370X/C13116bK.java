package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bK */
/* loaded from: assets/audience_network.dex */
public final class C13116bK {
    public static byte[] A03;
    public final C110142R A00;
    public final InterfaceC12474Qq A01;
    public final List<C13115bJ> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C13116bK(List<AbstractC110122P> list, Bundle bundle, InterfaceC12474Qq interfaceC12474Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC12474Qq;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C13115bJ(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C110142R) AbstractC12154Lg.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C13116bK(List<AbstractC110122P> list, InterfaceC12474Qq interfaceC12474Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC12474Qq;
        for (AbstractC110122P abstractC110122P : list) {
            this.A02.add(new C13115bJ(abstractC110122P));
        }
        this.A00 = new C110142R();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC12154Lg.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (C13115bJ c13115bJ : this.A02) {
            Bundle bundle2 = c13115bJ.A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C110142R A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C13115bJ c13115bJ : this.A02) {
            c13115bJ.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A8i = this.A01.A8i();
        this.A00.A04(d, A8i);
        for (C13115bJ c13115bJ : this.A02) {
            c13115bJ.A07(d, A8i);
        }
    }
}
