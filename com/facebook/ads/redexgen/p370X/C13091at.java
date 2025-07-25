package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.ads.internal.androidx.support.p369v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.at */
/* loaded from: assets/audience_network.dex */
public class C13091at extends AbstractC111584o implements InterfaceC1117050 {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC111424Y A04;
    public boolean A05;
    public int A06;
    public C111384T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C111364R A0D;
    public final C111374S A0E;

    public static String A0T(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C13091at(Context context) {
        this(context, 1, false);
    }

    public C13091at(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C111364R(this);
        this.A0E = new C111374S();
        this.A06 = 2;
        A2A(i);
        A0h(z);
        A1R(true);
    }

    private final int A04(int i, C111664w c111664w, C1117353 c1117353) {
        if (A0W() == 0 || i == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i > 0 ? 1 : -1;
        int consumed = Math.abs(i);
        A0Y(absDy, consumed, true, c1117353);
        int i2 = this.A07.A07;
        int layoutDirection = A08(c111664w, this.A07, c1117353, false);
        int i3 = i2 + layoutDirection;
        if (i3 < 0) {
            return 0;
        }
        int absDy2 = consumed > i3 ? absDy * i3 : i;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i, C111664w c111664w, C1117353 c1117353, boolean z) {
        int fixOffset;
        int gap = this.A04.A07() - i;
        if (gap > 0) {
            int i2 = -A04(-gap, c111664w, c1117353);
            int i3 = i + i2;
            if (z && (fixOffset = this.A04.A07() - i3) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i2;
            }
            return i2;
        }
        return 0;
    }

    private int A06(int i, C111664w c111664w, C1117353 c1117353, boolean z) {
        int A0A;
        int gap = i - this.A04.A0A();
        if (gap > 0) {
            int i2 = -A04(gap, c111664w, c1117353);
            int i3 = i + i2;
            if (z && (A0A = i3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i2 - A0A;
            }
            return i2;
        }
        return 0;
    }

    private final int A08(C111664w c111664w, C111384T c111384t, C1117353 c1117353, boolean z) {
        int i = c111384t.A00;
        int start = c111384t.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c111384t.A00;
            if (start2 < 0) {
                int i2 = c111384t.A07;
                int start3 = c111384t.A00;
                c111384t.A07 = i2 + start3;
            }
            A0e(c111664w, c111384t);
        }
        int i3 = c111384t.A00;
        int start4 = c111384t.A02;
        int i4 = i3 + start4;
        C111374S c111374s = this.A0E;
        while (true) {
            if ((!c111384t.A09 && i4 <= 0) || !c111384t.A05(c1117353)) {
                break;
            }
            c111374s.A00();
            A2D(c111664w, c1117353, c111384t, c111374s);
            if (!c111374s.A01) {
                int i5 = c111384t.A06;
                int remainingSpace = c111374s.A00;
                int start5 = c111384t.A05;
                c111384t.A06 = i5 + (remainingSpace * start5);
                if (!c111374s.A03 || this.A07.A08 != null || !c1117353.A07()) {
                    int remainingSpace2 = c111384t.A00;
                    int start6 = c111374s.A00;
                    c111384t.A00 = remainingSpace2 - start6;
                    int start7 = c111374s.A00;
                    i4 -= start7;
                }
                int start8 = c111384t.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c111384t.A07;
                    int start9 = c111374s.A00;
                    c111384t.A07 = remainingSpace3 + start9;
                    int start10 = c111384t.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c111384t.A07;
                        int start11 = c111384t.A00;
                        c111384t.A07 = remainingSpace4 + start11;
                    }
                    A0e(c111664w, c111384t);
                }
                if (z && c111374s.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c111384t.A00;
        return i - start12;
    }

    private int A09(C1117353 c1117353) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AbstractC1117757.A00(c1117353, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(C1117353 c1117353) {
        if (A0W() != 0) {
            A29();
            return AbstractC1117757.A02(c1117353, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        } else if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        } else {
            A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
            return 0;
        }
    }

    private int A0B(C1117353 c1117353) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AbstractC1117757.A01(c1117353, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(C1117353 c1117353) {
        if (c1117353.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i, int i2) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i2 > i) {
            next = 1;
        } else {
            next = i2 < i ? -1 : 0;
        }
        if (next == 0) {
            return A0t(i);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i, int i2, boolean z, boolean z2) {
        int i3;
        A29();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (z2) {
            i4 = 320;
        }
        int i5 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i5 == 0) {
            return super.A04.A00(i, i2, i3, i4);
        }
        return super.A05.A00(i, i2, i3, i4);
    }

    private View A0K(C111664w c111664w, C1117353 c1117353) {
        return A28(c111664w, c1117353, 0, A0W(), c1117353.A03());
    }

    private View A0L(C111664w c111664w, C1117353 c1117353) {
        return A28(c111664w, c1117353, A0W() - 1, -1, c1117353.A03());
    }

    private View A0M(C111664w c111664w, C1117353 c1117353) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C111664w c111664w, C1117353 c1117353) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C111664w c111664w, C1117353 c1117353) {
        return this.A05 ? A0K(c111664w, c1117353) : A0L(c111664w, c1117353);
    }

    private View A0P(C111664w c111664w, C1117353 c1117353) {
        return this.A05 ? A0L(c111664w, c1117353) : A0K(c111664w, c1117353);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final C111384T A0S() {
        return new C111384T();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i;
        this.A07.A05 = 1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        this.A07.A01 = i;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, C1117353 c1117353) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c1117353);
        this.A07.A05 = i;
        if (i == 1) {
            this.A07.A02 += this.A04.A08();
            View A0F2 = A0F();
            C111384T c111384t = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c111384t.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        this.A07.A00 = i2;
        if (z) {
            C111384T c111384t2 = this.A07;
            int scrollingOffset = c111384t2.A00;
            c111384t2.A00 = scrollingOffset - A0A;
        }
        this.A07.A07 = A0A;
    }

    private void A0Z(C111364R c111364r) {
        A0W(c111364r.A01, c111364r.A00);
    }

    private void A0a(C111364R c111364r) {
        A0X(c111364r.A01, c111364r.A00);
    }

    private void A0b(C111664w c111664w, int i) {
        int A0W = A0W();
        if (i < 0) {
            return;
        }
        int A06 = this.A04.A06() - i;
        boolean z = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z) {
            for (int i2 = 0; i2 < A0W; i2++) {
                View A0t = A0t(i2);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c111664w, 0, i2);
                    return;
                }
                A0d(c111664w, 0, i2);
                return;
            }
            return;
        }
        for (int i3 = A0W - 1; i3 >= 0; i3--) {
            View A0t2 = A0t(i3);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c111664w, childCount5, i3);
            return;
        }
    }

    private void A0c(C111664w c111664w, int i) {
        if (i < 0) {
            return;
        }
        int A0W = A0W();
        if (this.A05) {
            for (int i2 = A0W - 1; i2 >= 0; i2--) {
                View A0t = A0t(i2);
                AbstractC111424Y abstractC111424Y = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = abstractC111424Y.A0C(A0t);
                if (limit <= i) {
                    int limit2 = this.A04.A0G(A0t);
                    if (limit2 <= i) {
                    }
                }
                int limit3 = A0W - 1;
                A0d(c111664w, limit3, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < A0W; i3++) {
            View A0t2 = A0t(i3);
            int limit4 = this.A04.A0C(A0t2);
            if (limit4 <= i) {
                int limit5 = this.A04.A0G(A0t2);
                if (limit5 <= i) {
                }
            }
            A0d(c111664w, 0, i3);
            return;
        }
    }

    private void A0d(C111664w c111664w, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c111664w);
            }
            return;
        }
        while (i > i2) {
            A14(i, c111664w);
            i--;
        }
    }

    private void A0e(C111664w c111664w, C111384T c111384t) {
        if (!c111384t.A0B || c111384t.A09) {
            return;
        }
        if (c111384t.A05 == -1) {
            A0b(c111664w, c111384t.A07);
        } else {
            A0c(c111664w, c111384t.A07);
        }
    }

    private void A0f(C111664w c111664w, C1117353 c1117353, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c1117353.A08() || A0W() == 0 || c1117353.A07() || !A22()) {
            return;
        }
        int i = 0;
        int scrapExtraStart = 0;
        List<AbstractC1117656> A0J = c111664w.A0J();
        int i2 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i2; scrapSize++) {
            AbstractC1117656 abstractC1117656 = A0J.get(scrapSize);
            if (!abstractC1117656.A0a()) {
                int direction = 1;
                if ((abstractC1117656.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i += this.A04.A0D(abstractC1117656.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(abstractC1117656.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = i;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c111664w, this.A07, c1117353, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c111664w, this.A07, c1117353, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C111664w c111664w, C1117353 c1117353, C111364R c111364r) {
        if (A0k(c1117353, c111364r) || A0j(c111664w, c1117353, c111364r)) {
            return;
        }
        c111364r.A02();
        c111364r.A01 = this.A0C ? c1117353.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A1y(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C111664w c111664w, C1117353 c1117353, C111364R c111364r) {
        View A0P;
        int A0A;
        boolean z = false;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && c111364r.A06(A0s, c1117353)) {
            c111364r.A05(A0s);
            return true;
        } else if (this.A08 != this.A0C) {
            return false;
        } else {
            if (c111364r.A02) {
                A0P = A0O(c111664w, c1117353);
            } else {
                A0P = A0P(c111664w, c1117353);
            }
            if (A0P != null) {
                c111364r.A04(A0P);
                if (!c1117353.A07() && A22()) {
                    if ((this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) ? true : true) {
                        if (c111364r.A02) {
                            A0A = this.A04.A07();
                        } else {
                            A0A = this.A04.A0A();
                        }
                        c111364r.A00 = A0A;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b2, code lost:
        if ((r7 - r6) < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b4, code lost:
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00be, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00c7, code lost:
        if ((r7 - r6) < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ca, code lost:
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00d7, code lost:
        if (r1 >= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d9, code lost:
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00e3, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e6, code lost:
        if (r10.A02 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00e8, code lost:
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00f5, code lost:
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f8, code lost:
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0k(com.facebook.ads.redexgen.p370X.C1117353 r9, com.facebook.ads.redexgen.p370X.C111364R r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13091at.A0k(com.facebook.ads.redexgen.X.53, com.facebook.ads.redexgen.X.4R):boolean");
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public int A1d(int i, C111664w c111664w, C1117353 c1117353) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c111664w, c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public int A1e(int i, C111664w c111664w, C1117353 c1117353) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i, c111664w, c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1f(C1117353 c1117353) {
        return A09(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1g(C1117353 c1117353) {
        return A0A(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1h(C1117353 c1117353) {
        return A0B(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1i(C1117353 c1117353) {
        return A09(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1j(C1117353 c1117353) {
        return A0A(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final int A1k(C1117353 c1117353) {
        return A0B(c1117353);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final Parcelable A1l() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState.A01 = A0p(A0G2);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final View A1m(int i) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i) {
                return A0t;
            }
        }
        return super.A1m(i);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public View A1n(View view, int i, C111664w c111664w, C1117353 c1117353) {
        int maxScroll;
        View nextFocus;
        View A0F2;
        A0U();
        if (A0W() == 0 || (maxScroll = A27(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, c1117353);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c111664w, this.A07, c1117353, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c111664w, c1117353);
        } else {
            nextFocus = A0M(c111664w, c1117353);
        }
        if (maxScroll == -1) {
            A0F2 = A0G();
        } else {
            A0F2 = A0F();
        }
        if (A0F2.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return A0F2;
        }
        return nextFocus;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public C111594p A1o() {
        return new C111594p(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public void A1p(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1q(int i, int i2, C1117353 c1117353, InterfaceC111564m interfaceC111564m) {
        if (this.A00 != 0) {
            i = i2;
        }
        int delta = A0W();
        if (delta == 0 || i == 0) {
            return;
        }
        A29();
        int i3 = i > 0 ? 1 : -1;
        int delta2 = Math.abs(i);
        A0Y(i3, delta2, true, c1117353);
        A2E(c1117353, this.A07, interfaceC111564m);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1r(int i, InterfaceC111564m interfaceC111564m) {
        boolean z;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            if (this.A01 == -1) {
                direction = z ? i - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z ? -1 : 1;
        for (int i2 = 0; i2 < this.A06 && direction >= 0 && direction < i; i2++) {
            interfaceC111564m.A3o(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1s(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A0y();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1t(AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A25());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0240, code lost:
        if (r8 < r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x024e, code lost:
        if (r9.A04.A0C(r5) > r9.A04.A0A()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0250, code lost:
        r9.A0D.A05(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0257, code lost:
        if (r8 < r7) goto L80;
     */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1u(com.facebook.ads.redexgen.p370X.C111664w r10, com.facebook.ads.redexgen.p370X.C1117353 r11) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13091at.A1u(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53):void");
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public void A1v(C1117353 c1117353) {
        super.A1v(c1117353);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1w(C11774FL c11774fl, C111664w c111664w) {
        super.A1w(c11774fl, c111664w);
        if (this.A09) {
            A1I(c111664w);
            c111664w.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public void A1x(C11774FL c11774fl, C1117353 c1117353, int i) {
        C13090as linearSmoothScroller = new C13090as(c11774fl.getContext());
        linearSmoothScroller.A0A(i);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final void A1y(String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final boolean A1z() {
        return (A0Y() == 1073741824 || A0i() == 1073741824 || !A1S()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC111584o
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    public final int A27(int i) {
        switch (i) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean A2F = A2F();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return A2F ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 66:
                int i2 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i2 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A28(C111664w c111664w, C1117353 c1117353, int i, int i2, int i3) {
        A29();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i2 > i ? 1 : -1;
        while (i != i2) {
            View outOfBoundsMatch = A0t(i);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i3) {
                if (((C111594p) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            C111384T A0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = A0S;
        }
        if (this.A04 == null) {
            this.A04 = AbstractC111424Y.A02(this, this.A00);
        }
    }

    public final void A2A(int i) {
        if (i == 0 || i == 1) {
            A1y(null);
            if (i == this.A00) {
                return;
            }
            this.A00 = i;
            this.A04 = null;
            A0y();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i);
    }

    public final void A2B(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    public void A2C(C111664w c111664w, C1117353 c1117353, C111364R c111364r, int i) {
    }

    public void A2D(C111664w c111664w, C1117353 c1117353, C111384T c111384t, C111374S c111374s) {
        int A0g;
        int right;
        int i;
        int i2;
        View A03 = c111384t.A03(c111664w);
        if (A03 == null) {
            c111374s.A01 = true;
            return;
        }
        C111594p c111594p = (C111594p) A03.getLayoutParams();
        if (c111384t.A08 == null) {
            boolean z = this.A05;
            int bottom = c111384t.A05 == -1 ? 1 : 0;
            if (z == bottom) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z2 = this.A05;
            int bottom2 = c111384t.A05;
            int bottom3 = bottom2 == -1 ? 1 : 0;
            if (z2 == bottom3) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        c111374s.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2F()) {
                i2 = A0h() - A0f();
                i = i2 - this.A04.A0E(A03);
            } else {
                i = A0e();
                i2 = this.A04.A0E(A03) + i;
            }
            if (c111384t.A05 == -1) {
                right = c111384t.A06;
                A0g = c111384t.A06 - c111374s.A00;
            } else {
                A0g = c111384t.A06;
                right = c111384t.A06 + c111374s.A00;
            }
        } else {
            A0g = A0g();
            right = this.A04.A0E(A03) + A0g;
            int bottom4 = c111384t.A05;
            if (bottom4 == -1) {
                i2 = c111384t.A06;
                int i3 = c111384t.A06;
                int bottom5 = c111374s.A00;
                i = i3 - bottom5;
            } else {
                i = c111384t.A06;
                int i4 = c111384t.A06;
                int bottom6 = c111374s.A00;
                i2 = i4 + bottom6;
            }
        }
        A1B(A03, i, A0g, i2, right);
        if (c111594p.A02() || c111594p.A01()) {
            c111374s.A03 = true;
        }
        c111374s.A02 = A03.hasFocusable();
    }

    public void A2E(C1117353 c1117353, C111384T c111384t, InterfaceC111564m interfaceC111564m) {
        int i = c111384t.A01;
        if (i >= 0) {
            int pos = c1117353.A03();
            if (i < pos) {
                int pos2 = c111384t.A07;
                interfaceC111564m.A3o(i, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1117050
    public final PointF A4k(int i) {
        if (A0W() == 0) {
            return null;
        }
        boolean z = i < A0p(A0t(0));
        boolean z2 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos != 13) {
            A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
            int i2 = z != z2 ? -1 : 1;
            int direction = this.A00;
            if (direction == 0) {
                return new PointF(i2, 0.0f);
            }
            return new PointF(0.0f, i2);
        }
        throw new RuntimeException();
    }
}
