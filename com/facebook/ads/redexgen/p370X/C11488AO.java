package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.AO */
/* loaded from: assets/audience_network.dex */
public final class C11488AO {
    public static String[] A06 = {"pSGbucuoMvma1b5VVDAxEZMYXBJBkJd7", "jnfD7zJLfl7YfEaLudX29nBu0s4EE7wy", "kblP6w5tAUndOGYtYbLdLGUEXv4b54", "VT18E82QCK2DEIowipbGw7Y7OUzTjYnd", "AYuYTw0tW8ONeycLuKpYQRyZiiLmzDTW", "M9C1QOaf2rsBVjgJKmiK14Vpxz77Nv8B", "sFFKCjvZ8i7qkazJexEMRuLcVG", "s9HSZGEi8dFN8vFbKvf1UaL44HFpBCz2"};
    public C11489AP A01;
    public C11489AP A02;
    public boolean A03;
    public final ArrayList<C11489AP> A05 = new ArrayList<>();
    public final C11484AK A04 = new C11484AK();
    public AbstractC11486AM A00 = AbstractC11486AM.A01;

    private C11489AP A00(C11489AP c11489ap, AbstractC11486AM abstractC11486AM) {
        if (abstractC11486AM.A0E() || this.A00.A0E()) {
            return c11489ap;
        }
        AbstractC11486AM abstractC11486AM2 = this.A00;
        C11746Et c11746Et = c11489ap.A01;
        if (A06[0].charAt(13) != 'D') {
            A06[0] = "n7aIj5hp7lyBwHeNy22XvNfOlXYQiwaL";
            Object uid = abstractC11486AM2.A0A(c11746Et.A02, this.A04, true).A03;
            int newPeriodIndex = abstractC11486AM.A04(uid);
            if (newPeriodIndex == -1) {
                return c11489ap;
            }
            int newWindowIndex = abstractC11486AM.A09(newPeriodIndex, this.A04).A00;
            return new C11489AP(newWindowIndex, c11489ap.A01.A00(newPeriodIndex));
        }
        throw new RuntimeException();
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final C11489AP A03() {
        return this.A01;
    }

    public final C11489AP A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        return this.A05.get(this.A05.size() - 1);
    }

    public final C11489AP A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final C11489AP A06() {
        return this.A02;
    }

    public final C11746Et A07(int i) {
        C11746Et c11746Et = null;
        if (this.A00 != null) {
            int A00 = this.A00.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                C11489AP mediaPeriod = this.A05.get(periodIndex);
                C11746Et match = mediaPeriod.A01;
                int i2 = match.A02;
                if (i2 < A00 && this.A00.A09(i2, this.A04).A00 == i) {
                    if (c11746Et != null) {
                        return null;
                    }
                    c11746Et = mediaPeriod.A01;
                }
            }
        }
        return c11746Et;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, C11746Et c11746Et) {
        this.A05.add(new C11489AP(i, c11746Et));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i, C11746Et c11746Et) {
        C11489AP mediaPeriod;
        C11489AP c11489ap = new C11489AP(i, c11746Et);
        this.A05.remove(c11489ap);
        C11489AP mediaPeriod2 = this.A02;
        if (c11489ap.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                C11489AP mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i, C11746Et c11746Et) {
        this.A02 = new C11489AP(i, c11746Et);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(com.facebook.ads.redexgen.p370X.AbstractC11486AM r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r0 = r3.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L1d
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r1 = r3.A05
            java.util.ArrayList<com.facebook.ads.redexgen.X.AP> r0 = r3.A05
            java.lang.Object r0 = r0.get(r2)
            com.facebook.ads.redexgen.X.AP r0 = (com.facebook.ads.redexgen.p370X.C11489AP) r0
            com.facebook.ads.redexgen.X.AP r0 = r3.A00(r0, r4)
            r1.set(r2, r0)
            int r2 = r2 + 1
            goto L1
        L1d:
            com.facebook.ads.redexgen.X.AP r0 = r3.A02
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.AP r0 = r3.A02
            com.facebook.ads.redexgen.X.AP r0 = r3.A00(r0, r4)
            r3.A02 = r0
        L29:
            r3.A00 = r4
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11488AO.A0E(com.facebook.ads.redexgen.X.AM):void");
    }

    public final boolean A0F() {
        return this.A03;
    }
}
