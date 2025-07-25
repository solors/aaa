package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.ads.internal.androidx.support.p368v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.p368v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3h */
/* loaded from: assets/audience_network.dex */
public class C110903h extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"e0WzfCgg5XcVfGi", "ISw7K0NC0JjGKw3aqLZnEeCyQmnJarTP", "Hy7VicQaJFFlWaz3OdTjA4ZWS7Vff8v7", "WcFZxi67WO2ZtzqmgJX02c4dryVYoE5T", "rF0iooiSTOADQgiXw4j324HAbDkNAAle", "vgT88YiEWUZNicvmty9GpsXkAZSLF8rx", "LdGmA2eGd1B3SK0OmViQAh3pNWcZcixS", "9ZqOeGgvX4TfhHbWbTIbZxI4Pt81j06N"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final C110893g A0w;
    public static final Comparator<C110823Z> A0x;
    public int A00;
    public AbstractC110623E A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public InterfaceC110853c A0Y;
    public C110873e A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<InterfaceC110853c> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final C110823Z A0p;
    public final Runnable A0q;
    public final ArrayList<C110823Z> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C110823Z A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        C110823Z c110823z = null;
        int i2 = 0;
        while (i2 < this.A0r.size()) {
            C110823Z c110823z2 = this.A0r.get(i2);
            if (!z && c110823z2.A02 != i + 1) {
                c110823z2 = this.A0p;
                c110823z2.A00 = f2 + f3 + f;
                c110823z2.A02 = i + 1;
                c110823z2.A01 = this.A01.A00(c110823z2.A02);
                i2--;
            }
            f2 = c110823z2.A00;
            float f4 = c110823z2.A01 + f2;
            String[] strArr = A0t;
            if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A0t[0] = "anv8UthCgv3bxkb";
            float f5 = f4 + f;
            if (!z && scrollX < f2) {
                return c110823z;
            }
            if (scrollX < f5 || i2 == this.A0r.size() - 1) {
                return c110823z2;
            }
            z = false;
            i = c110823z2.A02;
            f3 = c110823z2.A01;
            c110823z = c110823z2;
            i2++;
        }
        return c110823z;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0s, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0s = new byte[]{-32, -3, -2, -32, -6, 42, 59, 65, 63, 76, -6, 61, 70, 59, 77, 77, 20, -6, -88, -40, -23, -17, -19, -6, -88, -15, -20, -62, -88, 11, 59, 93, 90, 77, 87, 80, 88, 76, 95, 84, 78, 11, 76, 79, 76, 91, 95, 80, 93, 37, 11, -66, 18, 13, 13, -66, 17, 11, -1, 10, 10, -39, -66, 2, 3, 4, -1, 19, 10, 18, 7, 12, 5, -66, 18, 13, -66, 16, 4, 74, 83, 89, 82, 72, 30, 4, -49, -19, -6, -6, -5, 0, -84, -19, -16, -16, -84, -4, -19, -13, -15, -2, -84, -16, -15, -17, -5, -2, -84, 2, -11, -15, 3, -84, -16, 1, -2, -11, -6, -13, -84, -8, -19, 5, -5, 1, 0, 61, 80, 92, 96, 80, 94, 95, 80, 79, 11, 90, 81, 81, 94, 78, 93, 80, 80, 89, 11, 91, 76, 82, 80, 11, 87, 84, 88, 84, 95, 11, -57, -37, -40, -109, -44, -29, -29, -33, -36, -42, -44, -25, -36, -30, -31, -102, -26, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -109, -42, -37, -44, -31, -38, -40, -41, -109, -25, -37, -40, -109, -44, -41, -44, -29, -25, -40, -27, -102, -26, -109, -42, -30, -31, -25, -40, -31, -25, -26, -109, -22, -36, -25, -37, -30, -24, -25, -109, -42, -44, -33, -33, -36, -31, -38, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -106, -31, -30, -25, -36, -39, -20, -73, -44, -25, -44, -58, -40, -25, -74, -37, -44, -31, -38, -40, -41, -108, -109, -72, -21, -29, -40, -42, -25, -40, -41, -109, -44, -41, -44, -29, -25, -40, -27, -109, -36, -25, -40, -32, -109, -42, -30, -24, -31, -25, -83, -109, 16, 35, 31, 49, 10, 27, 33, 31, 44, -3, 14, 14, 11, 19, -17, -1, 14, 11, 8, 8, -68, 16, 14, 5, 1, 0, -68, 16, 11, -68, 2, 5, 10, 0, -68, 2, 11, -1, 17, 15, -68, -2, -3, 15, 1, 0, -68, 11, 10, -68, 10, 11, 10, -55, -1, 4, 5, 8, 0, -68, -1, 17, 14, 14, 1, 10, 16, -68, 2, 11, -1, 17, 15, 1, 0, -68, 18, 5, 1, 19, -68, 67, 66, 21, 56, 53, 68, 72, 57, 70, 23, 60, 53, 66, 59, 57, 56, 1, 0, -30, -13, -7, -9, -27, -11, 4, 1, -2, -2, -9, -10, -78, -10, -5, -10, -78, 0, 1, 6, -78, -11, -13, -2, -2, -78, 5, 7, 2, -9, 4, -11, -2, -13, 5, 5, -78, -5, -1, 2, -2, -9, -1, -9, 0, 6, -13, 6, -5, 1, 0, 96, 94, 77, 90, 95, 82, 91, 94, 89, 60, 77, 83, 81};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.A0X == null || this.A0X.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[4] = "Z0LZClJ0au8nSBm1r5wZo4UlFxtb531d";
        strArr[2] = "ZltNMTIOlLDzNXpQzZy3241df7YiJdYF";
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float A00 = i6 + (i6 * A00(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(A00 / abs) * 1000.0f) * 4 : (int) ((1.0f + (Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f), 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, min);
        AbstractC110773T.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C110823Z A07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.onMeasure(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0162, code lost:
        if (r5 > r9.A0R) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0166, code lost:
        if (r5 <= r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0168, code lost:
        r9.A0i = true;
        A0T(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0173, code lost:
        if ((r7 - r9.A03) <= 0.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0175, code lost:
        r1 = r9.A03 + r9.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x017b, code lost:
        r9.A05 = r1;
        r9.A06 = r2;
        r2 = com.facebook.ads.redexgen.p370X.C110903h.A0t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0191, code lost:
        if (r2[4].charAt(21) == r2[2].charAt(21)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0199, code lost:
        r1 = r9.A03 - r9.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c3, code lost:
        if (r5 > r9.A0R) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01c6, code lost:
        r2 = com.facebook.ads.redexgen.p370X.C110903h.A0t;
        r2[5] = "e7fI1kGLNvpqtNm7aDmxtkJeXMvTP5FY";
        r2[3] = "XvYFrHQXjTrYZxGmpAYONm66bvHDiRqC";
        setScrollState(1);
        setScrollingCacheEnabled(true);
        r0 = getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01dc, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01de, code lost:
        r0.requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3g] */
    static {
        A0C();
        A0u = new int[]{16842931};
        A0x = new Comparator<C110823Z>() { // from class: com.facebook.ads.redexgen.X.3V
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(C110823Z c110823z, C110823Z c110823z2) {
                return c110823z.A02 - c110823z2.A02;
            }
        };
        A0v = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3W
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0w = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3g
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(View view, View view2) {
                C110833a c110833a = (C110833a) view.getLayoutParams();
                C110833a c110833a2 = (C110833a) view2.getLayoutParams();
                if (c110833a.A05 != c110833a2.A05) {
                    return c110833a.A05 ? 1 : -1;
                }
                return c110833a.A02 - c110833a2.A02;
            }
        };
    }

    public C110903h(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new C110823Z();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new Runnable() { // from class: com.facebook.ads.redexgen.X.3X
            {
                C110903h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C110903h.this.setScrollState(0);
                C110903h.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i = ((int) (f + truncator)) + i;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            C110823Z lastItem = this.A0r.get(0);
            ArrayList<C110823Z> arrayList = this.A0r;
            int targetPage3 = this.A0r.size();
            return Math.max(lastItem.A02, Math.min(i, arrayList.get(targetPage3 - 1).A02));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            int i = rect.bottom;
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[5] = "TxsWzRbkVVm53KJb0hYxYLTaFP4RvuCR";
            strArr2[3] = "7IWTmTKlEE0GT3GusYYvAPWFxogbhPhf";
            rect.bottom = i + viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.p370X.C110823Z A04(int r7) {
        /*
            r6 = this;
            r5 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            int r0 = r0.size()
            if (r5 >= r0) goto L3a
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            java.lang.Object r4 = r0.get(r5)
            com.facebook.ads.redexgen.X.3Z r4 = (com.facebook.ads.redexgen.p370X.C110823Z) r4
            int r3 = r4.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C110903h.A0t
            r0 = 6
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 53
            if (r1 == r0) goto L34
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C110903h.A0t
            java.lang.String r1 = "FTW8lMLV1WF1uT7A98mx1WW44JTpX4mD"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "8smTuGxWqqiqky02WbAruJcj0nAU8eAT"
            r0 = 3
            r2[r0] = r1
            if (r3 != r7) goto L31
            return r4
        L31:
            int r5 = r5 + 1
            goto L1
        L34:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A04(int):com.facebook.ads.redexgen.X.3Z");
    }

    private final C110823Z A05(int i, int i2) {
        C110823Z c110823z = new C110823Z();
        c110823z.A02 = i;
        c110823z.A03 = this.A01.A04(this, i);
        c110823z.A01 = this.A01.A00(i);
        if (i2 < 0 || i2 >= this.A0r.size()) {
            this.A0r.add(c110823z);
        } else {
            this.A0r.add(i2, c110823z);
        }
        return c110823z;
    }

    private final C110823Z A06(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (A0t[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "Cp8HLsoEDfOeEYMqWHrr049HoHROoinV";
            strArr[2] = "T0VfZL8wtEwZV1iGxV5Hd4QPubsH4Hu8";
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.p370X.C110823Z A07(android.view.View r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r4.A0r
            int r0 = r0.size()
            if (r3 >= r0) goto L1f
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r4.A0r
            java.lang.Object r2 = r0.get(r3)
            com.facebook.ads.redexgen.X.3Z r2 = (com.facebook.ads.redexgen.p370X.C110823Z) r2
            com.facebook.ads.redexgen.X.3E r1 = r4.A01
            java.lang.Object r0 = r2.A03
            boolean r0 = r1.A08(r5, r0)
            if (r0 == 0) goto L1c
            return r2
        L1c:
            int r3 = r3 + 1
            goto L1
        L1f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A07(android.view.View):com.facebook.ads.redexgen.X.3Z");
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        if (this.A0U != null) {
            this.A0U.recycle();
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0A() {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L1d
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3a r0 = (com.facebook.ads.redexgen.p370X.C110833a) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L1a
            r2.removeViewAt(r1)
            int r1 = r1 + (-1)
        L1a:
            int r1 = r1 + 1
            goto L1
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A0A():void");
    }

    private void A0B() {
        if (this.A0F != 0) {
            if (this.A0b == null) {
                this.A0b = new ArrayList<>();
            } else {
                this.A0b.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0b.add(getChildAt(i));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        AbstractC110773T.A0B(this, new C13101b4(this));
        if (AbstractC110773T.A00(this) == 0) {
            AbstractC110773T.A09(this, 1);
        }
        AbstractC110773T.A0C(this, new C13102b5(this));
    }

    private void A0E(int i) {
        List<InterfaceC110853c> list = this.A0d;
        String[] strArr = A0t;
        if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0t;
        strArr2[1] = "BVTy00cMA02UZPGNllJjIH3AYkDj1BkJ";
        strArr2[7] = "OotLKoFjxgYdGdzuGdwdV1ikaCSVhdo5";
        if (list != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    private void A0F(int i) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x01a4, code lost:
        if (r10 < r12) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01a6, code lost:
        r12 = r16.A0r.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01b6, code lost:
        if (r10 < r12) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01b9, code lost:
        r12 = null;
     */
    /* JADX WARN: Incorrect condition in loop: B:330:0x0294 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0G(int r17) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A0G(int):void");
    }

    private void A0H(int i, float f, int i2) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i3 = 0; i3 < z; i3++) {
                this.A0d.get(i3);
            }
        }
    }

    private final void A0I(int i, float f, int i2) {
        int max;
        if (this.A0D > 0) {
            int childLeft = getScrollX();
            int paddingLeft = getPaddingLeft();
            int childLeft2 = getPaddingRight();
            int hgrav = getWidth();
            int i3 = getChildCount();
            for (int childCount = 0; childCount < i3; childCount++) {
                View childAt = getChildAt(childCount);
                C110833a lp = (C110833a) childAt.getLayoutParams();
                int paddingLeft2 = A0t[6].charAt(18);
                if (paddingLeft2 != 53) {
                    A0t[0] = "eLb4kWjiyFzQgYZ";
                    if (lp.A05) {
                        int scrollX = lp.A04;
                        switch (scrollX & 7) {
                            case 1:
                                int scrollX2 = childAt.getMeasuredWidth();
                                max = Math.max((hgrav - scrollX2) / 2, paddingLeft);
                                break;
                            case 2:
                            case 4:
                            default:
                                max = paddingLeft;
                                break;
                            case 3:
                                max = paddingLeft;
                                int scrollX3 = childAt.getWidth();
                                paddingLeft += scrollX3;
                                break;
                            case 5:
                                int scrollX4 = childAt.getMeasuredWidth();
                                max = (hgrav - childLeft2) - scrollX4;
                                int scrollX5 = childAt.getMeasuredWidth();
                                childLeft2 += scrollX5;
                                break;
                        }
                        int scrollX6 = childAt.getLeft();
                        int i4 = (max + childLeft) - scrollX6;
                        String[] strArr = A0t;
                        String str = strArr[4];
                        String str2 = strArr[2];
                        int paddingLeft3 = str.charAt(21);
                        int scrollX7 = str2.charAt(21);
                        if (paddingLeft3 == scrollX7) {
                            String[] strArr2 = A0t;
                            strArr2[5] = "8dfGriTrd9bOdESwE5mGPvbaI7ots8HA";
                            strArr2[3] = "OX1hZuxAiPsPngs8SIDO4tRfQKy4SqJm";
                            if (i4 != 0) {
                                childAt.offsetLeftAndRight(i4);
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        A0H(i, f, i2);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = getChildAt(i5);
                String[] strArr3 = A0t;
                String str3 = strArr3[5];
                String str4 = strArr3[3];
                int childCount3 = str3.charAt(3);
                int scrollX8 = str4.charAt(3);
                if (childCount3 == scrollX8) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0t;
                strArr4[4] = "xqiTxeHFqkAvCvaAoyIYw4ze8LixE8Bg";
                strArr4[2] = "dxU2iatDRuS97WdbX1MSD4wOgw4tArLe";
                if (!((C110833a) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 123));
                }
            }
        }
        this.A0e = true;
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.A0r.isEmpty()) {
            if (!this.A0X.isFinished()) {
                this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int widthWithMargin = getPaddingLeft();
            int i5 = i2 - widthWithMargin;
            int widthWithMargin2 = getPaddingRight();
            int widthWithMargin3 = getScrollX();
            int oldWidthWithMargin = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (widthWithMargin3 / ((i5 - widthWithMargin2) + i4)));
            int widthWithMargin4 = getScrollY();
            scrollTo(oldWidthWithMargin, widthWithMargin4);
            return;
        }
        int i6 = this.A00;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "zbIyuU4nFdtSfTRFogYOf2jKfKMbfeaA";
        C110823Z ii = A04(i6);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft == getScrollX()) {
            return;
        }
        A0R(false);
        scrollTo(paddingLeft, getScrollY());
    }

    private final void A0L(int i, boolean z) {
        this.A0m = false;
        A0N(i, z, false);
    }

    private void A0M(int i, boolean z, int i2, boolean z2) {
        C110823Z A04 = A04(i);
        int destX = 0;
        if (A04 != null) {
            destX = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        if (z) {
            A0J(destX, 0, i2);
            if (z2) {
                A0E(i);
                return;
            }
            return;
        }
        if (z2) {
            A0E(i);
        }
        A0R(false);
        scrollTo(destX, 0);
        A0Z(destX);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    private final void A0O(int i, boolean z, boolean z2, int i2) {
        if (this.A01 == null || this.A01.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i) {
            int size = this.A0r.size();
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            A0t[0] = "caHeuZPLB8pjODm";
            if (size != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A01()) {
            i = this.A01.A01() - 1;
        }
        int i3 = this.A0L;
        if (i > this.A00 + i3 || i < this.A00 - i3) {
            for (int i4 = 0; i4 < this.A0r.size(); i4++) {
                this.A0r.get(i4).A04 = true;
            }
        }
        boolean z3 = this.A00 != i;
        boolean dispatchSelected = this.A0g;
        if (dispatchSelected) {
            this.A00 = i;
            if (z3) {
                A0E(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A0M(i, z, i2, z3);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId != pointerIndex) {
            return;
        }
        int pointerId2 = actionIndex == 0 ? 1 : 0;
        this.A05 = motionEvent.getX(pointerId2);
        int pointerIndex2 = motionEvent.getPointerId(pointerId2);
        this.A08 = pointerIndex2;
        if (this.A0U != null) {
            VelocityTracker velocityTracker = this.A0U;
            int pointerId3 = A0t[6].charAt(18);
            if (pointerId3 == 53) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "bDxXC3oviTuOT7HziZkEX4OVFsay8yQk";
            strArr[2] = "Td40sAmtginQL7DIEYzsL4IjnbfuGR0u";
            velocityTracker.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0090, code lost:
        r0 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0092, code lost:
        if (r6 >= r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0094, code lost:
        r3 = r3 + (r12.A01.A00(r6) + r5);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x009f, code lost:
        r7.A00 = r3;
        r3 = r3 + (r7.A01 + r5);
        r6 = r6 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:125:0x0024 */
    /* JADX WARN: Incorrect condition in loop: B:151:0x00c4 */
    /* JADX WARN: Incorrect condition in loop: B:161:0x0103 */
    /* JADX WARN: Incorrect condition in loop: B:179:0x0188 */
    /* JADX WARN: Incorrect condition in loop: B:197:0x01ff */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(com.facebook.ads.redexgen.p370X.C110823Z r13, int r14, com.facebook.ads.redexgen.p370X.C110823Z r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A0Q(com.facebook.ads.redexgen.X.3Z, int, com.facebook.ads.redexgen.X.3Z):void");
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i = 0; i < this.A0r.size(); i++) {
            C110823Z c110823z = this.A0r.get(i);
            boolean needPopulate2 = c110823z.A04;
            if (needPopulate2) {
                z2 = true;
                c110823z.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                AbstractC110773T.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        if (this.A00 > 0) {
            A0L(this.A00 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        if (this.A01 != null && this.A00 < this.A01.A01() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        return false;
    }

    private boolean A0X(float f) {
        boolean z = false;
        this.A05 = f;
        float scrollX = getScrollX() + (this.A05 - f);
        int clientWidth = getClientWidth();
        float f2 = clientWidth * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C110823Z c110823z = this.A0r.get(0);
        C110823Z c110823z2 = this.A0r.get(this.A0r.size() - 1);
        if (c110823z.A02 != 0) {
            rightAbsolute = false;
            f2 = c110823z.A00 * clientWidth;
        }
        if (c110823z2.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float leftBound3 = c110823z2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < f2) {
            if (rightAbsolute) {
                float scrollX2 = f2 - scrollX;
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                A0t[6] = "BqGUV6FWN85Kb3W2SyX26JGUB7qlw7kS";
                this.A0V.onPull(Math.abs(scrollX2) / clientWidth);
                z = true;
            }
            scrollX = f2;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float over = Math.abs(scrollX - leftBound2);
                edgeEffect.onPull(over / clientWidth);
                z = true;
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        return (f < ((float) this.A0I) && f2 > 0.0f) || (f > ((float) (getWidth() - this.A0I)) && f2 < 0.0f);
    }

    private boolean A0Z(int i) {
        int size = this.A0r.size();
        String A08 = A08(397, 53, 33);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C110823Z A03 = A03();
        int currentPage = getClientWidth();
        int widthWithMargin = this.A0M + currentPage;
        float f = this.A0M / currentPage;
        int i2 = A03.A02;
        float f2 = ((i / currentPage) - A03.A00) / (A03.A01 + f);
        this.A0e = false;
        A0I(i2, f2, (int) (widthWithMargin * f2));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    z = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(A08(0, 4, 79)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 73), A08(309, 72, 43) + sb2.toString());
                findFocus = null;
            }
        }
        boolean z2 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i == 17) {
                z2 = (findFocus == null || A02(this.A0o, nextFocused).left < A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i == 66) {
                z2 = (findFocus == null || A02(this.A0o, nextFocused).left > A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            z2 = A0V();
        } else if (i == 66 || i == 2) {
            z2 = A0W();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean handled2 = keyEvent.hasModifiers(2);
                if (handled2) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled3 = keyEvent.hasNoModifiers();
                if (handled3) {
                    return A0a(2);
                }
                boolean handled4 = keyEvent.hasModifiers(1);
                if (!handled4) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int count = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + count >= childAt.getLeft() && i2 + count < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && A0d(childAt, true, i, (i2 + count) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Incorrect condition in loop: B:74:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0e() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.A0e():void");
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        C110823Z A07;
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i3 = 0;
            while (true) {
                int childCount = getChildCount();
                int descendantFocusability2 = A0t[6].charAt(18);
                if (descendantFocusability2 == 53) {
                    throw new RuntimeException();
                }
                A0t[0] = "IpvXuWuZmfdtaN6";
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (A07 = A07(childAt)) != null) {
                    int descendantFocusability3 = A07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability3 == focusableCount2) {
                        childAt.addFocusables(views, i, i2);
                    }
                }
                i3++;
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = views.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability4 = i2 & 1;
        if ((descendantFocusability4 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && views != null) {
            views.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C110833a c110833a = (C110833a) layoutParams;
        boolean z = c110833a.A05;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "0hKurRTmjdCHvNVYXWivI507L49T3Iz9";
        c110833a.A05 = z | A0c(view);
        if (this.A0h) {
            if (c110833a == null || !c110833a.A05) {
                c110833a.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 27));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C110833a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0Z(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            AbstractC110773T.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            String[] strArr = A0t;
            if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                String[] strArr2 = A0t;
                strArr2[5] = "SnNuJhKin8DS21TzQefDZ7b1qeceX1Jv";
                strArr2[3] = "R0wvzxNXSAt5doStTJlFm1lxESFLXhHC";
                return dispatchPopulateAccessibilityEvent;
            }
        } else {
            int childCount = getChildCount();
            if (A0t[0].length() == 15) {
                A0t[6] = "LA2rc0K0poOotSQUO6QKpLGNHvEBCZdG";
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    int childCount2 = childAt.getVisibility();
                    if (childCount2 == 0) {
                        C110823Z A07 = A07(childAt);
                        String[] strArr3 = A0t;
                        String str = strArr3[1];
                        String str2 = strArr3[7];
                        int i2 = str.charAt(20);
                        int childCount3 = str2.charAt(20);
                        if (i2 == childCount3) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[1] = "08daBwAiC3e1eMunN04MWwSicEkZtb5w";
                        strArr4[7] = "VX7AcKsgdRXMMXDzaUN7bbmrPcZJNGdB";
                        if (A07 != null) {
                            int i3 = A07.A02;
                            int childCount4 = this.A00;
                            if (i3 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.A01 != null && this.A01.A01() > 1)) {
            EdgeEffect edgeEffect = this.A0V;
            int overScrollMode2 = A0t[0].length();
            if (overScrollMode2 != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "05N514BeFeDJgHlm81yP34LPQc7rkHPA";
            strArr[2] = "pzL9ltF7r1sXjfs3WepY84pTO2WENAbf";
            boolean needsInvalidate = edgeEffect.isFinished();
            if (!needsInvalidate) {
                int save = canvas.save();
                int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int height = getWidth();
                canvas.rotate(270.0f);
                int overScrollMode3 = -width;
                canvas.translate(overScrollMode3 + getPaddingTop(), this.A02 * height);
                this.A0V.setSize(width, height);
                boolean needsInvalidate2 = this.A0V.draw(canvas);
                z = false | needsInvalidate2;
                canvas.restoreToCount(save);
            }
            boolean needsInvalidate3 = this.A0W.isFinished();
            if (!needsInvalidate3) {
                int width2 = canvas.save();
                int width3 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width3);
                this.A0W.setSize(height2, width3);
                boolean needsInvalidate4 = this.A0W.draw(canvas);
                z |= needsInvalidate4;
                canvas.restoreToCount(width2);
            }
        } else {
            this.A0V.finish();
            this.A0W.finish();
        }
        if (z) {
            AbstractC110773T.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C110833a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C110833a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC110623E getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((C110833a) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        if (this.A0X != null && !this.A0X.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int scrollX = getScrollX();
            int pos = getWidth();
            float f2 = this.A0M / pos;
            int firstPos = 0;
            C110823Z c110823z = this.A0r.get(0);
            float marginOffset = c110823z.A00;
            int itemCount = this.A0r.size();
            int i = this.A0r.get(itemCount - 1).A02;
            for (int i2 = c110823z.A02; i2 < i; i2++) {
                while (i2 > c110823z.A02 && firstPos < itemCount) {
                    firstPos++;
                    c110823z = this.A0r.get(firstPos);
                }
                if (i2 == c110823z.A02) {
                    f = (c110823z.A00 + c110823z.A01) * pos;
                    float marginOffset2 = c110823z.A00;
                    marginOffset = marginOffset2 + c110823z.A01 + f2;
                } else {
                    float A00 = this.A01.A00(i2);
                    f = (marginOffset + A00) * pos;
                    marginOffset += A00 + f2;
                }
                if (this.A0M + f > scrollX) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f);
                    int i3 = this.A0Q;
                    int width = Math.round(this.A0M + f);
                    drawable.setBounds(round, i3, width, this.A09);
                    this.A0S.draw(canvas);
                }
                if (f > scrollX + pos) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a0, code lost:
        if (r3 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a8, code lost:
        if (r10 <= r17.A0R) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00af, code lost:
        if ((0.5f * r10) <= r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00b1, code lost:
        r17.A0i = true;
        A0T(true);
        setScrollState(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00bb, code lost:
        if (r3 <= r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00bd, code lost:
        r1 = r17.A03 + r17.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00c3, code lost:
        r17.A05 = r1;
        r17.A06 = r2;
        setScrollingCacheEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00cc, code lost:
        if (r17.A0i == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00d2, code lost:
        if (A0X(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d4, code lost:
        com.facebook.ads.redexgen.p370X.AbstractC110773T.A07(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00d9, code lost:
        r1 = r17.A03 - r17.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e5, code lost:
        if (r9 <= r17.A0R) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e7, code lost:
        r17.A0k = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0071, code lost:
        if (r3 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0079, code lost:
        if (A0Y(r17.A05, r3) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0087, code lost:
        if (A0d(r17, false, (int) r3, (int) r4, (int) r2) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0089, code lost:
        r17.A05 = r4;
        r17.A06 = r2;
        r17.A0k = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0090, code lost:
        return false;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C110823Z A07;
        int paddingRight;
        int count;
        int scrollX = getChildCount();
        int childTop = i3 - i;
        int childWidth = i4 - i2;
        int vgrav = getPaddingLeft();
        int width = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int i5 = 0;
        int paddingTop = 0;
        while (true) {
            int count2 = 8;
            if (paddingTop < scrollX) {
                View childAt = getChildAt(paddingTop);
                if (childAt.getVisibility() != 8) {
                    C110833a c110833a = (C110833a) childAt.getLayoutParams();
                    if (c110833a.A05) {
                        int count3 = c110833a.A04 & 7;
                        int childTop2 = c110833a.A04 & 112;
                        switch (count3) {
                            case 1:
                                paddingRight = Math.max((childTop - childAt.getMeasuredWidth()) / 2, vgrav);
                                break;
                            case 2:
                            case 4:
                            default:
                                paddingRight = vgrav;
                                break;
                            case 3:
                                paddingRight = vgrav;
                                int paddingBottom2 = childAt.getMeasuredWidth();
                                String[] strArr = A0t;
                                String str = strArr[1];
                                String str2 = strArr[7];
                                int count4 = str.charAt(20);
                                if (count4 == str2.charAt(20)) {
                                    throw new RuntimeException();
                                }
                                A0t[0] = "4DhY9NaEfbkSZ9C";
                                vgrav += paddingBottom2;
                                break;
                            case 5:
                                int paddingRight2 = childTop - childLeft;
                                paddingRight = paddingRight2 - childAt.getMeasuredWidth();
                                childLeft += childAt.getMeasuredWidth();
                                break;
                        }
                        switch (childTop2) {
                            case 16:
                                count = Math.max((childWidth - childAt.getMeasuredHeight()) / 2, width);
                                break;
                            case 48:
                                count = width;
                                width += childAt.getMeasuredHeight();
                                break;
                            case 80:
                                int count5 = childWidth - paddingBottom;
                                count = count5 - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                                break;
                            default:
                                count = width;
                                break;
                        }
                        int paddingRight3 = paddingRight + hgrav;
                        childAt.layout(paddingRight3, count, paddingRight3 + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + count);
                        i5++;
                    } else {
                        continue;
                    }
                }
                paddingTop++;
            } else {
                int childLeft2 = (childTop - vgrav) - childLeft;
                int paddingBottom3 = 0;
                while (paddingBottom3 < scrollX) {
                    View childAt2 = getChildAt(paddingBottom3);
                    if (childAt2.getVisibility() != count2) {
                        C110833a c110833a2 = (C110833a) childAt2.getLayoutParams();
                        if (!c110833a2.A05 && (A07 = A07(childAt2)) != null) {
                            int i6 = vgrav + ((int) (childLeft2 * A07.A00));
                            if (c110833a2.A03) {
                                c110833a2.A03 = false;
                                int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (childLeft2 * c110833a2.A00), 1073741824);
                                childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((childWidth - width) - paddingBottom, 1073741824));
                            }
                            int childTop3 = childAt2.getMeasuredWidth() + i6;
                            width = width;
                            int height = childAt2.getMeasuredHeight() + width;
                            String[] strArr2 = A0t;
                            String str3 = strArr2[1];
                            String str4 = strArr2[7];
                            int widthSpec2 = str3.charAt(20);
                            if (widthSpec2 != str4.charAt(20)) {
                                String[] strArr3 = A0t;
                                strArr3[1] = "z1EGVKAINgCK1pWg9AJjq4tA4jzMvRMS";
                                strArr3[7] = "NHHZP3L5Wb2TlMM1gmFw9TkZDHFcmZzw";
                                childAt2.layout(i6, width, childTop3, height);
                            } else {
                                childAt2.layout(i6, width, childTop3, height);
                            }
                        }
                    }
                    paddingBottom3++;
                    count2 = 8;
                }
                this.A0Q = width;
                this.A09 = childWidth - paddingBottom;
                this.A0D = i5;
                if (this.A0g) {
                    z2 = false;
                    A0M(this.A00, false, 0, false);
                } else {
                    z2 = false;
                }
                this.A0g = z2;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int end;
        C110823Z A07;
        int childCount = getChildCount();
        int count = i & 2;
        if (count != 0) {
            i2 = 0;
            end = 1;
        } else {
            i2 = childCount - 1;
            end = -1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            int count2 = childAt.getVisibility();
            if (count2 == 0 && (A07 = A07(childAt)) != null) {
                int index = A07.A02;
                int count3 = this.A00;
                if (index == count3 && childAt.requestFocus(i, rect)) {
                    int index2 = A0t[6].charAt(18);
                    if (index2 != 53) {
                        String[] strArr = A0t;
                        strArr[4] = "Znu0WDOQkx79zIIXKJQFb47iIrfdw3ED";
                        strArr[2] = "SboSqac50StP5vJHTPKGX42Xta1ZIbyJ";
                        return true;
                    }
                    throw new RuntimeException();
                }
            }
            i2 += end;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        if (this.A01 != null) {
            Parcelable superState2 = this.A01.A03();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            A0K(i, i3, this.A0M, this.A0M);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:42:0x0012 */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.ads.redexgen.X.3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAdapter(com.facebook.ads.redexgen.p370X.AbstractC110623E r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L54
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            r0.A06(r3)
            r5 = 0
        Lc:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            int r0 = r0.size()
            if (r5 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            java.lang.Object r0 = r0.get(r5)
            com.facebook.ads.redexgen.X.3Z r0 = (com.facebook.ads.redexgen.p370X.C110823Z) r0
            com.facebook.ads.redexgen.X.3E r2 = r6.A01
            int r1 = r0.A02
            java.lang.Object r0 = r0.A03
            r2.A07(r6, r1, r0)
            int r5 = r5 + 1
            goto Lc
        L28:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r5 = r6.A0r
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C110903h.A0t
            r0 = 5
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lc2
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C110903h.A0t
            java.lang.String r1 = "5tjoWE4Q5tO0E95pkDqQ6gCRa23v2VF9"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "zPJLPuVWeZXbdPcD4tg2pz6GDm3T23cV"
            r0 = 3
            r2[r0] = r1
            r5.clear()
            r6.A0A()
            r6.A00 = r4
            r6.scrollTo(r4, r4)
        L54:
            r6.A01 = r7
            r6.A0G = r4
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            if (r0 == 0) goto L8d
            com.facebook.ads.redexgen.X.3e r0 = r6.A0Z
            if (r0 != 0) goto L67
            com.facebook.ads.redexgen.X.3e r0 = new com.facebook.ads.redexgen.X.3e
            r0.<init>()
            r6.A0Z = r0
        L67:
            com.facebook.ads.redexgen.X.3E r1 = r6.A01
            com.facebook.ads.redexgen.X.3e r0 = r6.A0Z
            r1.A06(r0)
            r6.A0m = r4
            boolean r2 = r6.A0g
            r1 = 1
            r6.A0g = r1
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            int r0 = r0.A01()
            r6.A0G = r0
            int r0 = r6.A0O
            if (r0 < 0) goto Lb7
            int r0 = r6.A0O
            r6.A0N(r0, r4, r1)
            r0 = -1
            r6.A0O = r0
            r6.A0T = r3
            r6.A0a = r3
        L8d:
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            if (r0 == 0) goto Lc1
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc1
            r1 = 0
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto Lc1
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            r0.get(r1)
            r2 = 381(0x17d, float:5.34E-43)
            r1 = 16
            r0 = 99
            java.lang.String r1 = A08(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        Lb7:
            if (r2 != 0) goto Lbd
            r6.A0f()
            goto L8d
        Lbd:
            r6.requestLayout()
            goto L8d
        Lc1:
            return
        Lc2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110903h.setAdapter(com.facebook.ads.redexgen.X.3E):void");
    }

    public void setCurrentItem(int i) {
        this.A0m = false;
        A0N(i, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(300, 9, 73), A08(127, 31, 122) + i + A08(51, 26, 45) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC110853c interfaceC110853c) {
        this.A0Y = interfaceC110853c;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AbstractC110332k.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (0 != 0) {
            A0S(i != 0);
        }
        A0F(i);
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        A0t[0] = "blMFZWDPlO2VlWf";
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0n != z) {
            this.A0n = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
