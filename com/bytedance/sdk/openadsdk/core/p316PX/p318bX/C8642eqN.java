package com.bytedance.sdk.openadsdk.core.p316PX.p318bX;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.eqN */
/* loaded from: classes3.dex */
public class C8642eqN {

    /* renamed from: bg */
    public static final List<String> f19062bg = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: bg */
    public static double m85476bg(int i, double d, int i2, int i3, int i4, @Nullable String str) {
        double m85477bg = m85477bg(i, d, i2, i3);
        return m85475bg(str) * (1.0d / ((m85477bg + 1.0d) + m85478bg(i4)));
    }

    /* renamed from: bg */
    private static double m85477bg(int i, double d, int i2, int i3) {
        return (d > 0.0d ? Math.abs(d - (i3 > 0 ? i2 / i3 : 0.0d)) : 0.0d) + (i > 0 ? Math.abs((i - i2) / i) : 0.0d);
    }

    /* renamed from: bg */
    private static double m85478bg(int i) {
        int max = Math.max(i, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f);
        }
        return 0.0d;
    }

    /* renamed from: bg */
    private static double m85475bg(String str) {
        char c;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("video/3gpp")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? 1.0d : 1.5d;
    }
}
