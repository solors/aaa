package com.facebook.ads.redexgen.p370X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4v */
/* loaded from: assets/audience_network.dex */
public class C111654v {
    public SparseArray<C111644u> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private C111644u A01(int i) {
        C111644u c111644u = this.A00.get(i);
        if (c111644u == null) {
            C111644u c111644u2 = new C111644u();
            this.A00.put(i, c111644u2);
            return c111644u2;
        }
        return c111644u;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4u r0 = (com.facebook.ads.redexgen.p370X.C111644u) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C111654v.A02():void");
    }

    public final AbstractC1117656 A03(int i) {
        C111644u c111644u = this.A00.get(i);
        if (c111644u != null && !c111644u.A03.isEmpty()) {
            ArrayList<AbstractC1117656> arrayList = c111644u.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C111644u A01 = A01(i);
        A01.A01 = A00(A01.A01, j);
    }

    public final void A06(int i, long j) {
        C111644u A01 = A01(i);
        A01.A02 = A00(A01.A02, j);
    }

    public final void A07(AbstractC111464c abstractC111464c) {
        this.A01++;
    }

    public final void A08(AbstractC111464c abstractC111464c, AbstractC111464c abstractC111464c2, boolean z) {
        if (abstractC111464c != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC111464c2 != null) {
            A07(abstractC111464c2);
        }
    }

    public final void A09(AbstractC1117656 abstractC1117656) {
        int A0H = abstractC1117656.A0H();
        ArrayList<AbstractC1117656> arrayList = A01(A0H).A03;
        int i = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        abstractC1117656.A0Q();
        arrayList.add(abstractC1117656);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
