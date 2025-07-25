package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.my.tracker.obfuscated.x0 */
/* loaded from: classes7.dex */
public final class C26456x0 {
    /* renamed from: a */
    public static <T> T m41542a(Context context, String str, Class<T> cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            C26468z0.m41527a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    /* renamed from: a */
    public static String m41541a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
        } catch (Throwable th) {
            C26468z0.m41527a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        if (TextUtils.isEmpty(str2)) {
            C26468z0.m41528a("SystemUtils: value in system properties is null for " + str);
            return null;
        }
        return str2;
    }
}
