package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.57 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1117757 {
    public static String[] A00 = {"X094Ff6hX91n4UOeNZ5q6xBODyRF", "3SZuvdCuB3BE6lfK5qku2XxobaMEdUie", "GC5CoEiK4nrbG2wHW0FtwppW4DiO", "wga3z1tjiA3hov6SpIvZwMukezgQNZlv", "3xUgR2JHsSdawQ9thG1dfHrpvR", "GYcoMrIBN4ZdBxcuGgG7c5lcAAiSjlKe", "4bECUaOSHZBdJ", ""};

    public static int A00(C1117353 c1117353, AbstractC111424Y abstractC111424Y, View view, View view2, AbstractC111584o abstractC111584o, boolean z) {
        if (abstractC111584o.A0W() != 0) {
            int A03 = c1117353.A03();
            if (A00[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "A1oAKfZoAPhZUsftVBl6ZIJw4txQWtbe";
            strArr[5] = "SaLVqq6GZrXjANh28rEV2dsKSTV0teZe";
            if (A03 == 0 || view == null || view2 == null) {
                return 0;
            }
            if (!z) {
                return Math.abs(abstractC111584o.A0p(view) - abstractC111584o.A0p(view2)) + 1;
            }
            int A0C = abstractC111424Y.A0C(view2) - abstractC111424Y.A0F(view);
            int extend = abstractC111424Y.A0B();
            return Math.min(extend, A0C);
        }
        return 0;
    }

    public static int A01(C1117353 c1117353, AbstractC111424Y abstractC111424Y, View view, View view2, AbstractC111584o abstractC111584o, boolean z) {
        if (abstractC111584o.A0W() == 0 || c1117353.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1117353.A03();
        }
        int A0C = abstractC111424Y.A0C(view2) - abstractC111424Y.A0F(view);
        int A0p = abstractC111584o.A0p(view);
        int laidOutArea = abstractC111584o.A0p(view2);
        float abs = A0C / (Math.abs(A0p - laidOutArea) + 1);
        int laidOutArea2 = c1117353.A03();
        return (int) (abs * laidOutArea2);
    }

    public static int A02(C1117353 c1117353, AbstractC111424Y abstractC111424Y, View view, View view2, AbstractC111584o abstractC111584o, boolean z, boolean z2) {
        int laidOutArea;
        if (abstractC111584o.A0W() == 0 || c1117353.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        int maxPosition = Math.min(abstractC111584o.A0p(view), abstractC111584o.A0p(view2));
        int A0p = abstractC111584o.A0p(view);
        int minPosition = abstractC111584o.A0p(view2);
        int max = Math.max(A0p, minPosition);
        if (z2) {
            int minPosition2 = c1117353.A03();
            laidOutArea = Math.max(0, (minPosition2 - max) - 1);
        } else {
            laidOutArea = Math.max(0, maxPosition);
        }
        if (!z) {
            return laidOutArea;
        }
        int itemsBefore = abstractC111424Y.A0C(view2);
        int minPosition3 = abstractC111424Y.A0F(view);
        int maxPosition2 = Math.abs(itemsBefore - minPosition3);
        int itemsBefore2 = abstractC111584o.A0p(view);
        int minPosition4 = abstractC111584o.A0p(view2);
        float abs = laidOutArea * (maxPosition2 / (Math.abs(itemsBefore2 - minPosition4) + 1));
        int itemsBefore3 = abstractC111424Y.A0A();
        int minPosition5 = abstractC111424Y.A0F(view);
        return Math.round(abs + (itemsBefore3 - minPosition5));
    }
}
