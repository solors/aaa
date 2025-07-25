package sg.bigo.ads.common.utils;

import android.content.Context;

/* renamed from: sg.bigo.ads.common.utils.e */
/* loaded from: classes10.dex */
public final class C43822e {
    /* renamed from: a */
    public static float m4907a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static int m4905b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: c */
    public static int m4903c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: d */
    private static float m4901d(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: a */
    public static int m4906a(Context context, int i) {
        return (int) ((m4907a(context) * i) + 0.5d);
    }

    /* renamed from: b */
    public static int m4904b(Context context, int i) {
        return (int) ((m4901d(context) * i) + 0.5d);
    }

    /* renamed from: c */
    public static int m4902c(Context context, int i) {
        return (int) ((i / m4901d(context)) + 0.5d);
    }
}
