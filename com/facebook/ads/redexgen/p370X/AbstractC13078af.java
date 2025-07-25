package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.af */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13078af extends AbstractC111544k {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC1117656 abstractC1117656);

    public abstract boolean A0S(AbstractC1117656 abstractC1117656);

    public abstract boolean A0T(AbstractC1117656 abstractC1117656, int i, int i2, int i3, int i4);

    public abstract boolean A0U(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0D(AbstractC1117656 abstractC1117656) {
        return !this.A00 || abstractC1117656.A0Z();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0E(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2) {
        if (c111534j != null && (c111534j.A01 != c111534j2.A01 || c111534j.A03 != c111534j2.A03)) {
            return A0T(abstractC1117656, c111534j.A01, c111534j.A03, c111534j2.A01, c111534j2.A03);
        }
        return A0R(abstractC1117656);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0F(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2) {
        int i = c111534j.A01;
        int oldLeft = c111534j.A03;
        View view = abstractC1117656.A0H;
        int oldTop = c111534j2 == null ? view.getLeft() : c111534j2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c111534j2 == null ? view.getTop() : c111534j2.A03;
        if (!abstractC1117656.A0a() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(abstractC1117656, i, oldLeft, oldTop, top);
        }
        return A0S(abstractC1117656);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0G(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2) {
        if (c111534j.A01 != c111534j2.A01 || c111534j.A03 != c111534j2.A03) {
            return A0T(abstractC1117656, c111534j.A01, c111534j.A03, c111534j2.A01, c111534j2.A03);
        }
        A0O(abstractC1117656);
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111544k
    public final boolean A0H(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, C111534j c111534j, C111534j c111534j2) {
        int i;
        int i2;
        int i3 = c111534j.A01;
        int i4 = c111534j.A03;
        if (abstractC11176562.A0f()) {
            i = c111534j.A01;
            i2 = c111534j.A03;
        } else {
            i = c111534j2.A01;
            i2 = c111534j2.A03;
        }
        return A0U(abstractC1117656, abstractC11176562, i3, i4, i, i2);
    }

    public final void A0N(AbstractC1117656 abstractC1117656) {
        A0C(abstractC1117656);
    }

    public final void A0O(AbstractC1117656 abstractC1117656) {
        A0C(abstractC1117656);
    }

    public final void A0P(AbstractC1117656 abstractC1117656) {
        A0C(abstractC1117656);
    }

    public final void A0Q(AbstractC1117656 abstractC1117656, boolean z) {
        A0C(abstractC1117656);
    }
}
