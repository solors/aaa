package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Jf */
/* loaded from: classes9.dex */
public final class C33994Jf {
    /* renamed from: a */
    public static C33962I7 m22510a(String str) {
        HashMap hashMap;
        String decode = Uri.decode((String) m22509b(str).get("appmetrica_deep_link"));
        if (!TextUtils.isEmpty(decode)) {
            HashMap m22509b = m22509b(decode);
            hashMap = new HashMap(m22509b.size());
            for (Map.Entry entry : m22509b.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        } else {
            hashMap = null;
        }
        return new C33962I7(decode, hashMap, str);
    }

    /* renamed from: b */
    public static HashMap m22509b(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split(C21114v8.C21123i.f54135c)) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }
}
