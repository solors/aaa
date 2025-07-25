package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.w0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C31714w0 {
    /* renamed from: a */
    public static String m28089a(Object[] objArr, int i, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }
}
