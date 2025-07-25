package com.bytedance.sdk.component.p256bg;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.bg.JAA */
/* loaded from: classes3.dex */
class JAA {

    /* renamed from: bg */
    private static boolean f16503bg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static String m88504bg() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static String m88502bg(Throwable th) {
        StringBuilder sb2 = new StringBuilder("{\"code\":");
        sb2.append(th instanceof C7601tuV ? ((C7601tuV) th).f16566bg : 0);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static String m88503bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f16503bg ? str.substring(1, str.length() - 1) : "";
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!substring.isEmpty()) {
            return concat + "," + substring + "}";
        }
        return concat + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static void m88501bg(boolean z) {
        f16503bg = z;
    }
}
