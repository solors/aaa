package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.my.tracker.obfuscated.b1 */
/* loaded from: classes7.dex */
public final class C26300b1 {

    /* renamed from: a */
    private static volatile String f68521a;

    /* renamed from: a */
    public static String m42125a(Context context) {
        String str = f68521a;
        if (str == null) {
            synchronized (C26300b1.class) {
                str = f68521a;
                if (str == null) {
                    str = C26400r0.m41763a(context).m41739j();
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString();
                        C26400r0.m41763a(context).m41736k(str);
                        f68521a = str;
                    }
                }
            }
        }
        return str;
    }
}
