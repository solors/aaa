package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.o0 */
/* loaded from: classes7.dex */
public final class C26378o0 {

    /* renamed from: a */
    public static final boolean f68775a;

    /* renamed from: b */
    public static final boolean f68776b;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i <= 30) {
            z = true;
        } else {
            z = false;
        }
        f68775a = z;
        if (i > 30 || Build.MODEL.equals("Pixel 5")) {
            z2 = false;
        }
        f68776b = z2;
    }

    /* renamed from: a */
    public static boolean m41901a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m41900a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
