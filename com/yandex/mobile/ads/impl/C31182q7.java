package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q7 */
/* loaded from: classes8.dex */
public final class C31182q7 {
    @Nullable
    /* renamed from: a */
    public static HashMap m30454a(@Nullable Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append(C21114v8.C21123i.f54135c);
            sb2.append(Uri.encode(str));
            sb2.append("=");
            sb2.append(Uri.encode(str2));
            if (sb2.length() > 61440) {
                int i = vi1.f86761b;
                vi1.m28305a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return hashMap;
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public static String m30455a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            int i = vi1.f86761b;
            vi1.m28305a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
