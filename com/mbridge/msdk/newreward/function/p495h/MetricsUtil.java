package com.mbridge.msdk.newreward.function.p495h;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.SameTool;

/* renamed from: com.mbridge.msdk.newreward.function.h.d */
/* loaded from: classes6.dex */
public final class MetricsUtil {
    /* renamed from: a */
    public static String m50252a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return SameMD5.getMD5(SameTool.m51732d());
        }
        try {
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                str2 = split[2];
            } else {
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                return SameMD5.getMD5(SameTool.m51732d());
            }
            return str2;
        } catch (Exception unused) {
            return SameMD5.getMD5(SameTool.m51732d());
        }
    }
}
