package com.bytedance.adsdk.p183IL;

/* renamed from: com.bytedance.adsdk.IL.IL */
/* loaded from: classes3.dex */
class C6666IL {

    /* renamed from: bg */
    static final int[] f14138bg = new int[0];

    /* renamed from: IL */
    static final long[] f14136IL = new long[0];

    /* renamed from: bX */
    static final Object[] f14137bX = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static int m91209bg(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }
}
