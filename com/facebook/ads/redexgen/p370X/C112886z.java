package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6z */
/* loaded from: assets/audience_network.dex */
public final class C112886z implements InterfaceC11944IA {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC13254dl A01;
    public final InterfaceC13253dk A02;
    public final C13245db A03;
    public final C13245db A04;
    public final List<Rect> A05;
    public final Map<String, C13244da> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, 61, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, 63, 8, 29, 2, 31, 25};
    }

    static {
        A03();
        A0B = C112886z.class.getSimpleName();
    }

    public C112886z(InterfaceC13253dk interfaceC13253dk) {
        this(interfaceC13253dk, false, false);
    }

    public C112886z(InterfaceC13253dk interfaceC13253dk, boolean z, boolean z2) {
        this.A06 = new HashMap();
        this.A04 = new C13245db();
        this.A03 = new C13245db();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC13253dk;
        this.A08 = z;
        this.A07 = z2;
    }

    public static Rect A00(C13244da c13244da) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        if (c13244da != null) {
            rect = c13244da.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c13244da.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c13244da.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c13244da.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c13244da.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException(A02(0, 143, 9));
    }

    private C13244da A01(C13257do c13257do, Rect rect, Rect rect2) {
        boolean A06;
        Rect rect3;
        List list;
        C13244da c13244da = this.A06.get(c13257do.A00);
        A06 = this.A04.A06(c13257do);
        if (A06) {
            if (c13244da != null) {
                c13244da.A01 = EnumC13248de.A04;
            } else {
                c13244da = C13244da.A03(this.A00);
                this.A06.put(c13257do.A00, c13244da);
            }
        }
        rect3 = c13244da.A02;
        rect3.set(rect2);
        list = c13244da.A03;
        list.add(new Rect(rect));
        return c13244da;
    }

    private void A04(C13245db c13245db) {
        Collection<C13257do> A01;
        List list;
        A01 = c13245db.A01();
        for (C13257do c13257do : A01) {
            C13244da c13244da = this.A06.get(c13257do.A00);
            if (c13244da == null) {
                if (0 != 0) {
                    String str = A02(150, 36, 26) + c13257do.A00;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c13244da.A01 = EnumC13248de.A03;
                list = c13244da.A03;
                list.clear();
                c13257do.A03(this);
                if (this.A08) {
                    this.A06.remove(c13244da);
                }
            }
        }
    }

    private void A05(C13245db c13245db) {
        Collection<C13257do> A00;
        A00 = c13245db.A00();
        for (C13257do c13257do : A00) {
            c13257do.A03(this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11944IA
    public final void A3r(C13257do c13257do, Rect rect, Rect rect2) {
        boolean A06;
        List list;
        Rect rect3;
        List list2;
        A01(c13257do, rect, rect2);
        C13257do c13257do2 = c13257do.A02;
        C13257do parentViewpointData = C13257do.A08;
        if (c13257do2 == parentViewpointData) {
            return;
        }
        A06 = this.A03.A06(c13257do2);
        C13244da parentViewProperties = this.A06.get(c13257do2.A00);
        if (A06) {
            if (parentViewProperties == null) {
                parentViewProperties = C13244da.A03(this.A00);
                rect3 = parentViewProperties.A02;
                rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c13257do2.A00, parentViewProperties);
            } else {
                list2 = parentViewProperties.A03;
                list2.clear();
                if (!this.A07 || c13257do2.A04()) {
                    parentViewProperties.A01 = EnumC13248de.A04;
                }
            }
        }
        list = parentViewProperties.A03;
        list.add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11944IA
    public final void A4N(long j, List<Rect> list) {
        Collection A01;
        Collection<C13257do> A012;
        List list2;
        this.A00 = j;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((C13257do) it2.next()).A00);
                    } else if (!hasNext2) {
                        break;
                    } else {
                        this.A06.remove(((C13257do) it2.next()).A00);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C13257do viewpointData : A012) {
                    this.A06.remove(viewpointData.A00);
                }
                for (C13244da c13244da : this.A06.values()) {
                    list2 = c13244da.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11944IA
    public final void A5v() {
        Collection A00;
        Collection A002;
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            String obj = toString();
            List<Rect> list = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new C13243dZ(obj, this, list, A00, A002);
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC13247dd
    public final void A7W(C13257do c13257do, Rect rect) {
        List<Rect> list;
        rect.setEmpty();
        list = this.A06.get(c13257do.A00).A03;
        for (Rect rect2 : list) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC13247dd
    public final EnumC13248de A8h(C13257do c13257do) {
        EnumC13248de enumC13248de;
        enumC13248de = this.A06.get(c13257do.A00).A01;
        return enumC13248de;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC13247dd
    public final void A8j(Rect rect) {
        rect.setEmpty();
        for (Rect rect2 : this.A05) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC13247dd
    public final float A8k(C13257do c13257do) {
        List<Rect> list;
        C13244da c13244da = this.A06.get(c13257do.A00);
        if (c13244da != null) {
            Rect A00 = A00(c13244da);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c13244da.A03;
            for (Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11944IA
    public final void AGh(InterfaceC13254dl interfaceC13254dl) {
        this.A01 = interfaceC13254dl;
    }
}
