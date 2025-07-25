package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.IF */
/* loaded from: assets/audience_network.dex */
public final class C11949IF {
    public static final Comparator<C11948IE> A07 = new C11946IC();
    public static final Comparator<C11948IE> A08 = new C11947ID();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C11948IE[] A06 = new C11948IE[5];
    public final ArrayList<C11948IE> A05 = new ArrayList<>();
    public int A00 = -1;

    public C11949IF(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A07);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A08);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            C11948IE c11948ie = this.A05.get(i2);
            i += c11948ie.A02;
            float desiredWeight = i;
            if (desiredWeight >= f2) {
                float desiredWeight2 = c11948ie.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i, float f) {
        C11948IE oldestSample;
        A00();
        if (this.A02 > 0) {
            C11948IE[] c11948ieArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            oldestSample = c11948ieArr[i2];
        } else {
            oldestSample = new C11948IE(null);
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        oldestSample.A01 = i3;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            C11948IE c11948ie = this.A05.get(0);
            if (c11948ie.A02 <= excessWeight) {
                this.A03 -= c11948ie.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C11948IE[] c11948ieArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c11948ieArr2[excessWeight2] = c11948ie;
                }
            } else {
                c11948ie.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
