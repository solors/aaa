package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Kl */
/* loaded from: classes9.dex */
public abstract class AbstractC34024Kl {
    /* renamed from: a */
    public static String m22488a(Map map) {
        if (AbstractC34679kn.m21469a(map)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb2.append((String) entry.getKey());
            sb2.append(":");
            sb2.append((String) entry.getValue());
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    /* renamed from: b */
    public static HashMap m22487b(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!TextUtils.isEmpty(str) && !str.contains(":") && !str.contains(",") && !str.contains(C21114v8.C21123i.f54135c)) {
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2) && ParseUtils.parseLong(str2, -1L) != -1) {
                        hashMap.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap m22490a(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m22489a(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                Integer.parseInt((String) entry.getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
