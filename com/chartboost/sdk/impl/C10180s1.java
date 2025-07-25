package com.chartboost.sdk.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.chartboost.sdk.impl.s1 */
/* loaded from: classes3.dex */
public final class C10180s1 {

    /* renamed from: a */
    public static final C10180s1 f23092a = new C10180s1();

    /* renamed from: a */
    public static final String m80638a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        C10180s1 c10180s1 = f23092a;
        return c10180s1.m80637a(c10180s1.m80636b(bytes));
    }

    /* renamed from: b */
    public final byte[] m80636b(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }

    /* renamed from: a */
    public final String m80637a(byte[] bArr) {
        String format = String.format("%0" + (bArr.length << 1) + "x", Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
