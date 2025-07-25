package com.applovin.impl;

/* renamed from: com.applovin.impl.ui */
/* loaded from: classes2.dex */
public abstract class AbstractC5638ui {
    /* renamed from: a */
    public static int m94078a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m94077b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m94077b(int i, int i2) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2 && (i2 & 2) != 0) {
                return true;
            }
            return false;
        } else if ((i2 & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
