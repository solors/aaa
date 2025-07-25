package com.applovin.impl;

/* renamed from: com.applovin.impl.ja */
/* loaded from: classes2.dex */
abstract class AbstractC4643ja {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m98281a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 > 0) {
                return i2;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m98282a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m98280a(Object obj) {
        return m98282a(obj == null ? 0 : obj.hashCode());
    }
}
