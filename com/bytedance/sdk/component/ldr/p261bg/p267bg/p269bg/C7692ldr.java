package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.ldr */
/* loaded from: classes3.dex */
public class C7692ldr {
    /* renamed from: IL */
    public static String m88032IL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }

    /* renamed from: bg */
    public static String m88031bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
