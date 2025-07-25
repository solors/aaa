package com.fyber.inneractive.sdk.util;

import com.amazon.aps.shared.util.APSSharedUtil;

/* renamed from: com.fyber.inneractive.sdk.util.h0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15450h0 {
    /* renamed from: a */
    public static String m76502a(String str, int i) {
        if (i > 0 && str.length() > i) {
            return str.substring(0, i - 3) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        return str;
    }
}
