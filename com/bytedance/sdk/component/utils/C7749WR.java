package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.utils.WR */
/* loaded from: classes3.dex */
public class C7749WR {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bg */
    private static Context f16926bg;

    /* renamed from: IL */
    private static Configuration m87852IL(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    /* renamed from: bg */
    public static void m87851bg(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            f16926bg = context.createConfigurationContext(m87852IL(context, str, str2));
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
        }
        C7730Fy.m87918bg(f16926bg);
    }
}
