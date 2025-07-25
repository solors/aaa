package com.bytedance.adsdk.ugeno.p222iR;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.bytedance.adsdk.ugeno.iR.eqN */
/* loaded from: classes3.dex */
public final class C7120eqN {

    /* renamed from: IL */
    private static Resources f15290IL;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bX */
    private static Context f15291bX;

    /* renamed from: bg */
    private static String f15292bg;

    /* renamed from: bg */
    public static void m89989bg(String str) {
        f15292bg = str;
    }

    /* renamed from: bg */
    private static String m89992bg(Context context) {
        if (f15292bg == null) {
            f15292bg = context.getPackageName();
        }
        return f15292bg;
    }

    /* renamed from: bg */
    private static int m89990bg(Context context, String str, String str2) {
        if (f15290IL == null) {
            f15290IL = context.getResources();
        }
        return f15290IL.getIdentifier(str, str2, m89992bg(context));
    }

    /* renamed from: bg */
    public static int m89991bg(Context context, String str) {
        return m89990bg(context, str, "drawable");
    }
}
