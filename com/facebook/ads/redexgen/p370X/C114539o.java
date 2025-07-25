package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.9o */
/* loaded from: assets/audience_network.dex */
public final class C114539o implements Comparable<C114539o> {
    public int A00;
    public long A01;
    public Object A02;
    public final C11477AD A03;

    public C114539o(C11477AD c11477ad) {
        this.A03 = c11477ad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C114539o c114539o) {
        if ((this.A02 == null) != (c114539o.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i = this.A00 - c114539o.A00;
            if (i != 0) {
                return i;
            }
            int comparePeriodIndex = AbstractC11953IK.A07(this.A01, c114539o.A01);
            return comparePeriodIndex;
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
