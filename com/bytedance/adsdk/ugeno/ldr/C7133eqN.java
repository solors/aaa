package com.bytedance.adsdk.ugeno.ldr;

import java.util.Collection;

/* renamed from: com.bytedance.adsdk.ugeno.ldr.eqN */
/* loaded from: classes3.dex */
public class C7133eqN {
    /* renamed from: bg */
    public static int m89947bg(boolean z, int i, int i2) {
        if (i2 != 0 && z) {
            int i3 = i - 1073741823;
            int abs = Math.abs(i3) % i2;
            return (i3 >= 0 || abs == 0) ? abs : i2 - abs;
        }
        return i;
    }

    /* renamed from: bg */
    public static boolean m89948bg(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
