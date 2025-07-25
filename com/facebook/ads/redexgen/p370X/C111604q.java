package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.4q */
/* loaded from: assets/audience_network.dex */
public final class C111604q extends C11672DO implements Comparable<C111604q> {
    public long A00;

    public C111604q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C111604q c111604q) {
        if (A04() != c111604q.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((C12971Yw) this).A00 - ((C12971Yw) c111604q).A00;
        if (j == 0) {
            long j2 = this.A00;
            long delta = c111604q.A00;
            j = j2 - delta;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
