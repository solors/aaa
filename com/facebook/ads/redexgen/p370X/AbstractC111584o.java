package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4o */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111584o {
    public static byte[] A0I;
    public static String[] A0J = {"xyZ8yvYzp3wrHAf7Yx6bEToOMuLBTkeJ", "zRc0P2oS", "sxpemPSbJ0zjH5L170Fpc8WIJnMfTOYM", "JLvxwq6R3Maitb0M5MelMbaPMbiMlz5H", "qno0WD9sdyP92Tf9SwtsGsNlEh6m7cws", "isTf1gingqqcw8OSNjwv80foOygzMJYI", "cYtNYfyLYrQzxoivZChv", "OeXF3cqFYKXlQ2ABbzPAkdUOYZHirWRh"};
    public int A00;
    public C111214C A01;
    public AbstractC1117151 A02;
    public C11774FL A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC1117959 A0G = new C13083al(this);
    public final InterfaceC1117959 A0H = new C13082ak(this);
    public C111815B A04 = new C111815B(this.A0G);
    public C111815B A05 = new C111815B(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0I = new byte[]{99, -122, -122, -121, -122, 66, 120, -117, -121, -103, 66, -118, -125, -107, 66, 116, -121, -123, -101, -123, -114, -121, -108, 120, -117, -121, -103, 66, -125, -107, 66, -110, -125, -108, -121, -112, -106, 66, -124, -105, -106, 66, -104, -117, -121, -103, 66, -117, -107, 66, -112, -111, -106, 66, -125, 66, -108, -121, -125, -114, 66, -123, -118, -117, -114, -122, 80, 66, 119, -112, -120, -117, -114, -106, -121, -108, -121, -122, 66, -117, -112, -122, -121, -102, 92, -88, -58, -45, -45, -44, -39, -123, -46, -44, -37, -54, -123, -58, -123, -56, -51, -50, -47, -55, -123, -53, -41, -44, -46, -123, -45, -44, -45, -110, -54, -35, -50, -40, -39, -50, -45, -52, -123, -50, -45, -55, -54, -35, -97};
    }

    public abstract int A1d(int i, C111664w c111664w, C1117353 c1117353);

    public abstract int A1e(int i, C111664w c111664w, C1117353 c1117353);

    public abstract int A1f(C1117353 c1117353);

    public abstract int A1g(C1117353 c1117353);

    public abstract int A1h(C1117353 c1117353);

    public abstract int A1i(C1117353 c1117353);

    public abstract int A1j(C1117353 c1117353);

    public abstract int A1k(C1117353 c1117353);

    public abstract Parcelable A1l();

    public abstract View A1n(View view, int i, C111664w c111664w, C1117353 c1117353);

    public abstract C111594p A1o();

    public abstract void A1p(int i);

    public abstract void A1q(int i, int i2, C1117353 c1117353, InterfaceC111564m interfaceC111564m);

    public abstract void A1r(int i, InterfaceC111564m interfaceC111564m);

    public abstract void A1s(Parcelable parcelable);

    public abstract void A1u(C111664w c111664w, C1117353 c1117353);

    public abstract void A1x(C11774FL c11774fl, C1117353 c1117353, int i);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                int max = Math.max(i2, i3);
                int size2 = A0J[1].length();
                if (size2 != 8) {
                    throw new RuntimeException();
                }
                A0J[1] = "W1fJ2ceK";
                int mode2 = Math.min(size, max);
                return mode2;
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i2, i3);
                return mode3;
        }
    }

    public static int A01(int i, int i2, int i3, int i4, boolean z) {
        int max = Math.max(0, i - i3);
        int i5 = 0;
        int resultMode = 0;
        if (z) {
            if (i4 >= 0) {
                i5 = i4;
                resultMode = 1073741824;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = max;
                        resultMode = i2;
                        break;
                    case 0:
                        i5 = 0;
                        resultMode = 0;
                        break;
                }
            } else if (i4 == -2) {
                i5 = 0;
                resultMode = 0;
            }
        } else if (i4 >= 0) {
            i5 = i4;
            resultMode = 1073741824;
        } else if (i4 == -1) {
            i5 = max;
            resultMode = i2;
        } else if (i4 == -2) {
            i5 = max;
            resultMode = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size = View.MeasureSpec.makeMeasureSpec(i5, resultMode);
        return size;
    }

    private final int A02(View view) {
        return ((C111594p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C111594p) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C111594p) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C111594p) view.getLayoutParams()).A03.top;
    }

    private final int A06(C111664w c111664w, C1117353 c1117353) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        View child = A0t(i);
        if (child != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        View view = A0t(i);
        if (view != null) {
            A09(i);
            A0E(view, i2);
            String[] strArr = A0J;
            if (strArr[2].charAt(30) != strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "fev5lwy8caKDFGGcVLFTWETO5UF90dOq";
            strArr2[7] = "EDoCIrgXqzBYQTf4WlngJinORtzJmrfl";
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 81) + i + this.A03.toString());
    }

    private void A0C(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i) {
        A0F(view, i, (C111594p) view.getLayoutParams());
    }

    private final void A0F(View view, int i, C111594p c111594p) {
        AbstractC1117656 A0F = C11774FL.A0F(view);
        if (A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        this.A01.A0H(view, i, c111594p, A0F.A0a());
    }

    private void A0G(View view, int i, boolean z) {
        AbstractC1117656 A0F = C11774FL.A0F(view);
        if (z || A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        C111594p c111594p = (C111594p) view.getLayoutParams();
        if (A0F.A0g() || A0F.A0b()) {
            if (A0F.A0b()) {
                A0F.A0S();
            } else {
                A0F.A0O();
            }
            this.A01.A0H(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C11774FL c11774fl = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "uqKRxBtg59XPGVJDkfwEUsBOgdJYSppJ";
            if (parent == c11774fl) {
                int currentIndex = this.A01.A07(view);
                if (i == -1) {
                    i = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i) {
                        this.A03.A06.A0B(currentIndex, i);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 14) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i, false);
                c111594p.A01 = true;
                AbstractC1117151 abstractC1117151 = this.A02;
                if (A0J[4].charAt(12) == 'v') {
                    throw new RuntimeException();
                }
                A0J[6] = "si9YLNjLFs";
                if (abstractC1117151 != null && this.A02.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c111594p.A02) {
            View view2 = A0F.A0H;
            if (A0J[1].length() != 8) {
                throw new RuntimeException();
            }
            A0J[1] = "bg493IDm";
            view2.invalidate();
            c111594p.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        C11774FL.A0o(view, rect);
    }

    private void A0J(C111664w c111664w, int i, View view) {
        AbstractC1117656 A0F = C11774FL.A0F(view);
        if (A0F.A0f()) {
            return;
        }
        if (A0F.A0Z()) {
            boolean A0a = A0F.A0a();
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[2] = "wfzQKDpvqCerNRZHLtQvgaB031c5C1YU";
            strArr[5] = "KgFz3HBRwd8cETJWtdM1PF8pjKUjBKYl";
            if (!A0a && !this.A03.A04.A0A()) {
                A0A(i);
                c111664w.A0X(A0F);
                return;
            }
        }
        A09(i);
        c111664w.A0S(view);
        this.A03.A0t.A0C(A0F);
    }

    private final void A0K(C111664w c111664w, C1117353 c1117353, AccessibilityEvent accessibilityEvent) {
        if (this.A03 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!this.A03.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (this.A03.A04 != null) {
            accessibilityEvent.setItemCount(this.A03.A04.A0E());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r4.canScrollHorizontally(1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        if (r4.canScrollHorizontally(1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r4 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0L(com.facebook.ads.redexgen.p370X.C111664w r6, com.facebook.ads.redexgen.p370X.C1117353 r7, com.facebook.ads.redexgen.p370X.C111013s r8) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r3 = 1
            if (r0 != 0) goto L2d
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            boolean r4 = r0.canScrollHorizontally(r1)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.AbstractC111584o.A0J
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L8e
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.AbstractC111584o.A0J
            java.lang.String r1 = "KDPDh71uiY9dw6lSrmH00w2HuhKAvOYl"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "F84YzGx02ov8ufnexIEGkhiaGhnINbYS"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L35
        L2d:
            r0 = 8192(0x2000, float:1.14794E-41)
            r8.A0N(r0)
            r8.A0R(r3)
        L35:
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != 0) goto L5b
            com.facebook.ads.redexgen.X.FL r4 = r5.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.AbstractC111584o.A0J
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L7b
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.AbstractC111584o.A0J
            java.lang.String r1 = "8s5rDkFpP"
            r0 = 6
            r2[r0] = r1
            boolean r0 = r4.canScrollHorizontally(r3)
            if (r0 == 0) goto L63
        L5b:
            r0 = 4096(0x1000, float:5.74E-42)
            r8.A0N(r0)
            r8.A0R(r3)
        L63:
            int r3 = r5.A0r(r6, r7)
            int r2 = r5.A0q(r6, r7)
            boolean r1 = r5.A0P(r6, r7)
            int r0 = r5.A06(r6, r7)
            com.facebook.ads.redexgen.X.3p r0 = com.facebook.ads.redexgen.p370X.C110983p.A00(r3, r2, r1, r0)
            r8.A0P(r0)
            return
        L7b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.AbstractC111584o.A0J
            java.lang.String r1 = "3WqpoC752q4h2Wya5fT3BPHdY3ZkhgYP"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "HauWKBzmz4VUJQZuXSWVI1MWGOc6zBYt"
            r0 = 5
            r2[r0] = r1
            boolean r0 = r4.canScrollHorizontally(r3)
            if (r0 == 0) goto L63
            goto L5b
        L8e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC111584o.A0L(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53, com.facebook.ads.redexgen.X.3s):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AbstractC1117151 abstractC1117151) {
        if (this.A02 == abstractC1117151) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        return this.A02 != null && this.A02.A0F();
    }

    public static boolean A0O(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case 0:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    private final boolean A0P(C111664w c111664w, C1117353 c1117353) {
        return false;
    }

    private final boolean A0Q(C111664w c111664w, C1117353 c1117353, int i, Bundle bundle) {
        if (this.A03 == null) {
            return false;
        }
        int hScroll = 0;
        int i2 = 0;
        switch (i) {
            case 4096:
                if (this.A03.canScrollVertically(1)) {
                    int hScroll2 = A0X();
                    int vScroll = A0g();
                    int hScroll3 = hScroll2 - vScroll;
                    int vScroll2 = A0d();
                    hScroll = hScroll3 - vScroll2;
                }
                if (this.A03.canScrollHorizontally(1)) {
                    int A0h = A0h();
                    int vScroll3 = A0e();
                    int i3 = A0h - vScroll3;
                    int vScroll4 = A0f();
                    i2 = i3 - vScroll4;
                    break;
                }
                break;
            case 8192:
                if (this.A03.canScrollVertically(-1)) {
                    int hScroll4 = A0X();
                    int vScroll5 = A0g();
                    int hScroll5 = hScroll4 - vScroll5;
                    int vScroll6 = A0d();
                    hScroll = -(hScroll5 - vScroll6);
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    int A0h2 = A0h();
                    int vScroll7 = A0e();
                    int i4 = A0h2 - vScroll7;
                    int vScroll8 = A0f();
                    i2 = -(i4 - vScroll8);
                    break;
                }
                break;
        }
        if (hScroll == 0 && i2 == 0) {
            return false;
        }
        this.A03.scrollBy(i2, hScroll);
        return true;
    }

    private final boolean A0R(C111664w c111664w, C1117353 c1117353, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0S(C11774FL c11774fl, int i, int i2) {
        View focusedChild = c11774fl.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i >= parentTop2 || rect.right - i <= parentBottom || rect.top - i2 >= parentLeft2 || rect.bottom - i2 <= parentRight) {
            return false;
        }
        return true;
    }

    @Deprecated
    private final boolean A0T(C11774FL c11774fl, View view, View view2) {
        return A0N() || c11774fl.A1q();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childLeft = rect.width() + childBottom;
        int parentLeft = rect.height();
        int parentBottom = Math.min(0, childBottom - offScreenRight);
        int parentRight = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childLeft - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(parentBottom, childLeft - dy);
            }
        } else {
            parentTop = parentBottom != 0 ? parentBottom : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentRight == 0) {
            parentRight = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentRight;
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        if (this.A01 != null) {
            return this.A01.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        AbstractC111464c a;
        if (this.A03 != null) {
            C11774FL c11774fl = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "NhHtbEzlhB3n2IblVpNcmlHtdyAdrFMd";
            a = c11774fl.getAdapter();
        } else {
            a = null;
        }
        if (a != null) {
            return a.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return AbstractC110773T.A01(this.A03);
    }

    public final int A0b() {
        return AbstractC110773T.A02(this.A03);
    }

    public final int A0c() {
        return AbstractC110773T.A03(this.A03);
    }

    public final int A0d() {
        if (this.A03 != null) {
            return this.A03.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        if (this.A03 != null) {
            return this.A03.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        if (this.A03 != null) {
            return this.A03.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        if (this.A03 != null) {
            return this.A03.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C111594p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C111594p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C111594p) view.getLayoutParams()).A00();
    }

    public int A0q(C111664w c111664w, C1117353 c1117353) {
        if (this.A03 == null || this.A03.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(C111664w c111664w, C1117353 c1117353) {
        if (this.A03 == null || this.A03.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public final View A0s() {
        View focusedChild;
        if (this.A03 == null || (focusedChild = this.A03.getFocusedChild()) == null || this.A01.A0K(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final View A0t(int i) {
        if (this.A01 != null) {
            return this.A01.A09(i);
        }
        return null;
    }

    public final View A0u(View view, int i) {
        return null;
    }

    public C111594p A0v(Context context, AttributeSet attributeSet) {
        return new C111594p(context, attributeSet);
    }

    public C111594p A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C111594p) {
            return new C111594p((C111594p) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C111594p((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C111594p(layoutParams);
    }

    public final void A0x() {
        if (this.A02 != null) {
            this.A02.A09();
        }
    }

    public final void A0y() {
        if (this.A03 != null) {
            this.A03.requestLayout();
        }
    }

    public final void A0z(int i) {
        if (this.A03 != null) {
            this.A03.A1T(i);
        }
    }

    public final void A10(int i) {
        if (this.A03 != null) {
            this.A03.A1U(i);
        }
    }

    public final void A11(int i, int i2) {
        this.A0C = View.MeasureSpec.getSize(i);
        this.A0D = View.MeasureSpec.getMode(i);
        if (this.A0D == 0 && !C11774FL.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i2);
        this.A0B = View.MeasureSpec.getMode(i2);
        if (this.A0B == 0 && !C11774FL.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i, int i2) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1a(i, i2);
            String[] strArr = A0J;
            String str = strArr[2];
            String str2 = strArr[5];
            int charAt = str.charAt(30);
            int count = str2.charAt(30);
            if (charAt != count) {
                throw new RuntimeException();
            }
            A0J[1] = "XwkGDyjU";
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < A0W; i5++) {
            View A0t = A0t(i5);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count2 = rect.left;
            if (count2 < i3) {
                i3 = rect.left;
            }
            int count3 = rect.right;
            if (count3 > maxY) {
                maxY = rect.right;
            }
            int count4 = rect.top;
            if (count4 < i4) {
                i4 = rect.top;
            }
            int count5 = rect.bottom;
            if (count5 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i3, i4, maxY, maxX);
        A15(this.A03.A0p, i, i2);
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, C111664w c111664w) {
        View view = A0t(i);
        A0A(i);
        c111664w.A0T(view);
    }

    public void A15(Rect rect, int i, int i2) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i3 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i3 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i2, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(View view, int i, int i2) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        Rect A1D = this.A03.A1D(view);
        int i3 = i + A1D.left + A1D.right;
        int i4 = i2 + A1D.top + A1D.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c111594p.leftMargin + c111594p.rightMargin + i3, c111594p.width, A20());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c111594p.topMargin + c111594p.bottomMargin + i4, c111594p.height, A21());
        if (A1W(view, A01, A012, c111594p)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i, int i2, int i3, int i4) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        Rect rect = c111594p.A03;
        view.layout(rect.left + i + c111594p.leftMargin, rect.top + i2 + c111594p.topMargin, (i3 - rect.right) - c111594p.rightMargin, (i4 - rect.bottom) - c111594p.bottomMargin);
    }

    public final void A1C(View view, C111013s c111013s) {
        AbstractC1117656 A0F = C11774FL.A0F(view);
        if (A0F != null) {
            boolean A0a = A0F.A0a();
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[1] = "uJMRqraa";
            if (!A0a && !this.A01.A0K(A0F.A0H)) {
                A1K(this.A03.A0r, this.A03.A0s, view, c111013s);
            }
        }
    }

    public final void A1D(View view, C111664w c111664w) {
        A0D(view);
        c111664w.A0T(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C111594p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        C11774FL c11774fl = this.A03;
        String[] strArr = A0J;
        if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "0LJ8GvUexdNG1AG11Ii0XfPOyD5lBlCr";
        strArr2[7] = "NwYNIOYDHD2wNBVOHxFlNgVOQtOI4Jp5";
        if (c11774fl != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            double d = rectF.right;
            if (A0J[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0J;
            strArr3[0] = "AxZOVdXnwoPa2hByvRQIxFpOdsFmpigD";
            strArr3[7] = "eNbgBcin3tlOsNhY3b3xdMmObUbY1NrP";
            rect.set(floor, floor2, (int) Math.ceil(d), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C111013s c111013s) {
        A0L(this.A03.A0r, this.A03.A0s, c111013s);
    }

    public final void A1G(C111664w c111664w) {
        int A0E = c111664w.A0E();
        for (int i = A0E - 1; i >= 0; i--) {
            View A0F = c111664w.A0F(i);
            AbstractC1117656 A0F2 = C11774FL.A0F(A0F);
            if (!A0F2.A0f()) {
                A0F2.A0X(false);
                if (A0F2.A0c()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0F2);
                }
                A0F2.A0X(true);
                c111664w.A0R(A0F);
            }
        }
        c111664w.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C111664w c111664w) {
        int childCount = A0W();
        for (int i = childCount - 1; i >= 0; i--) {
            A0J(c111664w, i, A0t(i));
        }
    }

    public final void A1I(C111664w c111664w) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!C11774FL.A0F(A0t(A0W)).A0f()) {
                A14(A0W, c111664w);
            }
        }
    }

    public void A1J(C111664w c111664w, C1117353 c1117353, int i, int i2) {
        this.A03.A1a(i, i2);
    }

    public void A1K(C111664w c111664w, C1117353 c1117353, View view, C111013s c111013s) {
        C110993q itemInfo = C110993q.A00(A21() ? A0p(view) : 0, 1, A20() ? A0p(view) : 0, 1, false, false);
        c111013s.A0Q(itemInfo);
    }

    public final void A1L(AbstractC1117151 abstractC1117151) {
        if (this.A02 != null) {
            AbstractC1117151 abstractC11171512 = this.A02;
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[6] = RequestConfiguration.MAX_AD_CONTENT_RATING_G;
            if (abstractC1117151 != abstractC11171512 && this.A02.A0F()) {
                AbstractC1117151 abstractC11171513 = this.A02;
                if (A0J[6].length() != 15) {
                    A0J[3] = "jdqDA9lv9LoPYcF6nkiuFYbBQf2p3Jna";
                    abstractC11171513.A09();
                } else {
                    String[] strArr = A0J;
                    strArr[0] = "CfhUeeIqQu1BzHSX9SgRD70OnW7YoiZA";
                    strArr[7] = "rBLjTriW7e2LTgD4knhZEnVORkWVeovT";
                    abstractC11171513.A09();
                }
            }
        }
        this.A02 = abstractC1117151;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(C11774FL c11774fl) {
    }

    public final void A1N(C11774FL c11774fl) {
        this.A07 = true;
    }

    public final void A1O(C11774FL c11774fl) {
        A11(View.MeasureSpec.makeMeasureSpec(c11774fl.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c11774fl.getHeight(), 1073741824));
    }

    public final void A1P(C11774FL c11774fl) {
        if (c11774fl == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c11774fl;
            this.A01 = c11774fl.A01;
            this.A0C = c11774fl.getWidth();
            this.A0A = c11774fl.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(C11774FL c11774fl, C111664w c111664w) {
        this.A07 = false;
        A1w(c11774fl, c111664w);
    }

    public final void A1R(boolean z) {
        this.A06 = z;
    }

    public final boolean A1S() {
        int A0W = A0W();
        for (int i = 0; i < A0W; i++) {
            ViewGroup.LayoutParams layoutParams = A0t(i).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        if (A0J[4].charAt(12) != 'v') {
            A0J[3] = "WAOKNqtGQ8ovYE750tJA7vys4k4qcWl2";
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean A1T() {
        return this.A03 != null && this.A03.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1W(View view, int i, int i2, C111594p c111594p) {
        if (!view.isLayoutRequested()) {
            boolean z = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
                throw new RuntimeException();
            }
            A0J[4] = "WuiXnf3Uz62WBJXd3E4QIRzbwyGUV3fL";
            if (z && A0O(view.getWidth(), i, c111594p.width) && A0O(view.getHeight(), i2, c111594p.height)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1X(View view, int i, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1Y(C111594p c111594p) {
        return c111594p != null;
    }

    public final boolean A1Z(C11774FL c11774fl, View view, Rect rect, boolean z) {
        return A1a(c11774fl, view, rect, z, false);
    }

    public final boolean A1a(C11774FL c11774fl, View view, Rect rect, boolean z, boolean z2) {
        int[] scrollAmount = A0U(view, rect);
        int i = scrollAmount[0];
        int i2 = scrollAmount[1];
        if ((z2 && !A0S(c11774fl, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c11774fl.scrollBy(i, i2);
        } else {
            c11774fl.A1c(i, i2);
        }
        return true;
    }

    public final boolean A1b(C11774FL c11774fl, C1117353 c1117353, View view, View view2) {
        return A0T(c11774fl, view, view2);
    }

    public final boolean A1c(C11774FL c11774fl, ArrayList<View> views, int i, int i2) {
        return false;
    }

    public View A1m(int i) {
        int A0W = A0W();
        for (int i2 = 0; i2 < A0W; i2++) {
            View child = A0t(i2);
            AbstractC1117656 A0F = C11774FL.A0F(child);
            if (A0F != null) {
                int childCount = A0F.A0I();
                if (childCount == i && !A0F.A0f() && (this.A03.A0s.A07() || !A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(C1117353 c1117353) {
    }

    public void A1w(C11774FL c11774fl, C111664w c111664w) {
    }

    public void A1y(String str) {
        if (this.A03 != null) {
            this.A03.A1l(str);
        }
    }
}
