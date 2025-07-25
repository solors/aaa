package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9353eqN;

/* renamed from: com.bytedance.sdk.openadsdk.utils.WR */
/* loaded from: classes3.dex */
public class C9533WR {
    /* renamed from: IL */
    private static String m82558IL(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return C9353eqN.m82984IL(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: bg */
    public static void m82556bg(String str) {
        m82555bg("any_door_id", str);
    }

    /* renamed from: bg */
    public static String m82557bg() {
        return m82558IL("any_door_id", null);
    }

    /* renamed from: bg */
    private static void m82555bg(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C9353eqN.m82974bg((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
