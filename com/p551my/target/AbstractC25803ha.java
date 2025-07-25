package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* renamed from: com.my.target.ha */
/* loaded from: classes7.dex */
public abstract class AbstractC25803ha {
    /* renamed from: a */
    public static Object m43783a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("SystemUtils: exception when access to application info with key - " + str + ", " + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m43782a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("SystemUtils: error occurred when getting value for property - " + str + ", " + th.getMessage());
        }
        if (TextUtils.isEmpty(str2)) {
            AbstractC25846ja.m43680a("SystemUtils: value in system properties is null for " + str);
            return null;
        }
        return str2;
    }
}
