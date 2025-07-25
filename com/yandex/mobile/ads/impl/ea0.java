package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ea0 {
    @NotNull
    /* renamed from: a */
    public final String m34643a() {
        byte[] decode = Base64.decode("QVNVU19aMDBBRA==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }
}
