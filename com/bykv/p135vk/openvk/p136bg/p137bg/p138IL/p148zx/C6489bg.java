package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p148zx;

import android.os.Build;
import android.view.View;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.zx.bg */
/* loaded from: classes3.dex */
public class C6489bg {

    /* renamed from: bg */
    private static final int f13540bg = Build.VERSION.SDK_INT;

    /* renamed from: bg */
    public static int m91765bg(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    /* renamed from: bg */
    public static String m91766bg(long j) {
        StringBuilder sb2 = new StringBuilder();
        long j2 = j / 60000;
        long j3 = ((j % 3600000) % 60000) / 1000;
        if (j2 >= 10) {
            sb2.append(j2);
        } else if (j2 > 0) {
            sb2.append(0);
            sb2.append(j2);
        } else {
            sb2.append(0);
            sb2.append(0);
        }
        sb2.append(":");
        if (j3 >= 10) {
            sb2.append(j3);
        } else if (j3 > 0) {
            sb2.append(0);
            sb2.append(j3);
        } else {
            sb2.append(0);
            sb2.append(0);
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    public static void m91764bg(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i = f13540bg;
        if (i >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
