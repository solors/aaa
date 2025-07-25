package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.util.e0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15444e0 {
    /* renamed from: a */
    public static String m76507a(String str, HashMap hashMap) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                str2 = "?";
            } else {
                str2 = C21114v8.C21123i.f54135c;
            }
            sb2.append(str2);
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb2.toString();
    }
}
