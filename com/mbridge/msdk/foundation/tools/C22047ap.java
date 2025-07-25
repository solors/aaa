package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;

/* compiled from: StringUtils.java */
/* renamed from: com.mbridge.msdk.foundation.tools.ap */
/* loaded from: classes6.dex */
public final class C22047ap {
    /* renamed from: a */
    public static boolean m51693a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m51692b(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return true;
        }
        return false;
    }
}
