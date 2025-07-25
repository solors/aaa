package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.Gc */
/* loaded from: assets/audience_network.dex */
public final class C11851Gc implements Comparable<C11851Gc> {
    public static String[] A07 = {"Pg1hszkiSUaQ1Q3zUSDOGcwj", "XShA8NFwXMYGNPNQ1BnInLPPJxqL39cw", "4AD4jwCbTLaGqX9NncWpOLB6kKpQgghq", "doOTHA4oEA3dklajbgRwWhS1FJUNjIcN", "kRAYWFoIfk1tahKyvQkcWyD9", "v3c98y91ZIbNDnVgLScu", "QZvUGrumLzA7euHuZCA08HkLf7D5kSmU", "3DTCIPMv7b0hO08Etp6WfnPKrfF9T0Ka"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public C11851Gc(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C11649D1.A0H(i, false) ? 1 : 0;
        this.A03 = C11649D1.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C11851Gc c11851Gc) {
        int resultSign;
        int resultSign2;
        int resultSign3;
        int A01;
        int A012;
        int A013;
        int A014;
        if (this.A05 != c11851Gc.A05) {
            A014 = C11649D1.A01(this.A05, c11851Gc.A05);
            return A014;
        } else if (this.A03 != c11851Gc.A03) {
            A013 = C11649D1.A01(this.A03, c11851Gc.A03);
            return A013;
        } else if (this.A02 != c11851Gc.A02) {
            A012 = C11649D1.A01(this.A02, c11851Gc.A02);
            return A012;
        } else if (this.A06.A0D) {
            int i = c11851Gc.A00;
            if (A07[3].charAt(16) != 'v') {
                A07[1] = "Pc63tSmZUGJUTTfLdPyCZoSTnPj3qyRn";
                A01 = C11649D1.A01(i, this.A00);
                return A01;
            }
            throw new RuntimeException();
        } else {
            int i2 = this.A05 != 1 ? -1 : 1;
            int i3 = this.A01;
            int resultSign4 = c11851Gc.A01;
            if (i3 != resultSign4) {
                int i4 = this.A01;
                int resultSign5 = c11851Gc.A01;
                resultSign3 = C11649D1.A01(i4, resultSign5);
                return resultSign3 * i2;
            }
            int i5 = this.A04;
            int resultSign6 = c11851Gc.A04;
            if (i5 != resultSign6) {
                int i6 = this.A04;
                int resultSign7 = c11851Gc.A04;
                resultSign2 = C11649D1.A01(i6, resultSign7);
                return resultSign2 * i2;
            }
            int i7 = this.A00;
            int resultSign8 = c11851Gc.A00;
            resultSign = C11649D1.A01(i7, resultSign8);
            return resultSign * i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11851Gc c11851Gc = (C11851Gc) obj;
        return this.A05 == c11851Gc.A05 && this.A03 == c11851Gc.A03 && this.A02 == c11851Gc.A02 && this.A01 == c11851Gc.A01 && this.A04 == c11851Gc.A04 && this.A00 == c11851Gc.A00;
    }

    public final int hashCode() {
        int result = this.A05;
        int i = result * 31;
        int result2 = this.A03;
        int result3 = this.A01;
        int result4 = this.A00;
        return ((((((((i + result2) * 31) + this.A02) * 31) + result3) * 31) + this.A04) * 31) + result4;
    }
}
