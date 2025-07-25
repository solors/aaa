package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.utils.tC */
/* loaded from: classes3.dex */
public class C7763tC {

    /* renamed from: bg */
    private static volatile String f16939bg;

    /* renamed from: bg */
    public static String m87803bg() {
        if (!TextUtils.isEmpty(f16939bg)) {
            return f16939bg;
        }
        String str = Build.MODEL;
        f16939bg = str;
        return str;
    }
}
