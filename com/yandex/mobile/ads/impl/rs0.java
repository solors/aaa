package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class rs0 {
    /* renamed from: a */
    public static byte[] m29955a(us0 us0Var, String str, int i, String str2) {
        us0Var.getClass();
        byte[] decode = Base64.decode(str, i);
        Intrinsics.checkNotNullExpressionValue(decode, str2);
        return decode;
    }
}
