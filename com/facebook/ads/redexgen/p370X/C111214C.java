package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4C */
/* loaded from: assets/audience_network.dex */
public final class C111214C {
    public static byte[] A03;
    public static String[] A04 = {"90ZggfNQsOg49XfX2Gw1SU3vAhU", "6e03JoSoFcAuCj0XHJ07P", "X2n0FB8CLVE6QonP7j41AEQOs", "oGNNWvZthHEo2sMGR9jx6vYqjxoachM9", "D9nn", "xFc2wx6BEzvoHtEzkiYe1GtwM37", "KcMIoFUA4KOHORJmTS9CHMjc27bv2njt", "Hz1lzGXaGkVdCftBSZ2HywJOuLsdaxmO"};
    public final InterfaceC111204B A01;
    public final C111194A A00 = new C111194A();
    public final List<View> A02 = new ArrayList();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-113, -125, -53, -52, -57, -57, -56, -47, -125, -49, -52, -42, -41, -99, -21, -23, -16, -32, -27, -34, -105, -21, -26, -105, -20, -27, -33, -32, -37, -36, -105, -40, -105, -19, -32, -36, -18, -105, -21, -33, -40, -21, -105, -18, -40, -22, -105, -27, -26, -21, -105, -33, -32, -37, -37, -36, -27, 43, 30, 26, 44, -43, 30, 40, -43, 35, 36, 41, -43, 22, -43, 24, 29, 30, 33, 25, -31, -43, 24, 22, 35, 35, 36, 41, -43, 29, 30, 25, 26, -43};
    }

    static {
        A02();
    }

    public C111214C(InterfaceC111204B interfaceC111204B) {
        this.A01 = interfaceC111204B;
    }

    private int A00(int i) {
        if (i < 0) {
            return -1;
        }
        int offset = this.A01.A6l();
        int limit = i;
        while (limit < offset) {
            int A032 = i - (limit - this.A00.A03(limit));
            if (A032 == 0) {
                while (this.A00.A08(limit)) {
                    limit++;
                }
                return limit;
            }
            limit += A032;
        }
        return -1;
    }

    private void A03(View view) {
        this.A02.add(view);
        this.A01.ABr(view);
    }

    private boolean A04(View view) {
        if (this.A02.remove(view)) {
            this.A01.ACO(view);
            return true;
        }
        return false;
    }

    public final int A05() {
        return this.A01.A6l() - this.A02.size();
    }

    public final int A06() {
        return this.A01.A6l();
    }

    public final int A07(View view) {
        int A9C = this.A01.A9C(view);
        if (A9C == -1 || this.A00.A08(A9C)) {
            return -1;
        }
        int index = this.A00.A03(A9C);
        return A9C - index;
    }

    public final View A08(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.A02.get(i2);
            AbstractC1117656 A6o = this.A01.A6o(view);
            int count = A6o.A0I();
            if (count == i && !A6o.A0Z() && !A6o.A0a()) {
                return view;
            }
        }
        return null;
    }

    public final View A09(int i) {
        return this.A01.A6k(A00(i));
    }

    public final View A0A(int i) {
        return this.A01.A6k(i);
    }

    public final void A0B() {
        this.A00.A04();
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            this.A01.ACO(this.A02.get(size));
            this.A02.remove(size);
        }
        this.A01.AFZ();
    }

    public final void A0C(int i) {
        int A00 = A00(i);
        this.A00.A09(A00);
        this.A01.A5T(A00);
    }

    public final void A0D(int i) {
        int A00 = A00(i);
        View view = this.A01.A6k(A00);
        if (view == null) {
            return;
        }
        if (this.A00.A09(A00)) {
            A04(view);
        }
        this.A01.AFd(A00);
    }

    public final void A0E(View view) {
        int A9C = this.A01.A9C(view);
        if (A9C >= 0) {
            this.A00.A06(A9C);
            A03(view);
            return;
        }
        throw new IllegalArgumentException(A01(57, 33, 85) + view);
    }

    public final void A0F(View view) {
        int A9C = this.A01.A9C(view);
        if (A9C < 0) {
            return;
        }
        if (this.A00.A09(A9C)) {
            A04(view);
        }
        this.A01.AFd(A9C);
    }

    public final void A0G(View view) {
        int A9C = this.A01.A9C(view);
        if (A9C >= 0) {
            if (this.A00.A08(A9C)) {
                this.A00.A05(A9C);
                if (A04[7].charAt(2) == 'x') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[5] = "8IGbKDWrlSqGtsrcKzoZxkVKvdJ";
                strArr[0] = "U0TRNaLdUZe04yrOWBaiBfN34lF";
                A04(view);
                return;
            }
            throw new RuntimeException(A01(14, 43, 23) + view);
        }
        throw new IllegalArgumentException(A01(57, 33, 85) + view);
    }

    public final void A0H(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int A00;
        if (i < 0) {
            A00 = this.A01.A6l();
        } else {
            A00 = A00(i);
        }
        this.A00.A07(A00, z);
        if (z) {
            A03(view);
        }
        this.A01.A40(view, A00, layoutParams);
    }

    public final void A0I(View view, int i, boolean z) {
        int A00;
        if (i < 0) {
            InterfaceC111204B interfaceC111204B = this.A01;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[0].length()) {
                String[] strArr2 = A04;
                strArr2[1] = "WWxR4kuTyiSS3k1dOopZM";
                strArr2[2] = "jpAqbovCz6NUDLwJv0FYFncHe";
                A00 = interfaceC111204B.A6l();
            }
            throw new RuntimeException();
        }
        A00 = A00(i);
        this.A00.A07(A00, z);
        if (A04[7].charAt(2) != 'x') {
            A04[4] = "lrFB";
            if (z) {
                A03(view);
            }
            this.A01.addView(view, A00);
            return;
        }
        throw new RuntimeException();
    }

    public final void A0J(View view, boolean z) {
        A0I(view, -1, z);
    }

    public final boolean A0K(View view) {
        return this.A02.contains(view);
    }

    public final boolean A0L(View view) {
        int A9C = this.A01.A9C(view);
        if (A9C == -1) {
            A04(view);
            return true;
        } else if (this.A00.A08(A9C)) {
            this.A00.A09(A9C);
            A04(view);
            this.A01.AFd(A9C);
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        return this.A00.toString() + A01(0, 14, 3) + this.A02.size();
    }
}
