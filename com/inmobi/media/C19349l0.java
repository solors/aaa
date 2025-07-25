package com.inmobi.media;

import java.util.Map;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.l0 */
/* loaded from: classes6.dex */
public final class C19349l0 {
    /* renamed from: a */
    public static final String m60086a(String str, Map map) {
        if (map != null && str != null) {
            String str2 = str;
            for (Object obj : map.keySet()) {
                if (str2 != null) {
                    str2 = StringsJVM.m16628I(str2, String.valueOf(obj), String.valueOf(map.get(obj)), false, 4, null);
                } else {
                    str2 = null;
                }
            }
            return str2;
        }
        return str;
    }
}
