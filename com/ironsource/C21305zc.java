package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.zc */
/* loaded from: classes6.dex */
public class C21305zc {
    /* renamed from: a */
    public static String m53852a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: b */
    static String m53851b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
