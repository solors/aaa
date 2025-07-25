package com.taurusx.tax.p606j;

import android.content.Context;
import android.webkit.WebSettings;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.s */
/* loaded from: classes7.dex */
public class C28536s {

    /* renamed from: a */
    public static String f73989a;

    /* renamed from: b */
    public static String f73990b = System.getProperty(C28162a.f73047a.m23824a(new byte[]{Byte.MAX_VALUE, 53, 99, 49, 57, 32, 112, 36, 121, 53}, new byte[]{23, 65}));

    /* renamed from: a */
    public static String m37986a(Context context) {
        String str;
        String str2 = f73989a;
        if (str2 == null) {
            synchronized (C28536s.class) {
                str2 = f73989a;
                if (str2 == null) {
                    try {
                        str = WebSettings.getDefaultUserAgent(context);
                    } catch (Exception unused) {
                        str = f73990b;
                    }
                    f73989a = str;
                    str2 = str;
                }
            }
        }
        return str2;
    }
}
