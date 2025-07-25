package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xg */
/* loaded from: classes8.dex */
public final class C31820xg {
    @NotNull
    /* renamed from: a */
    public final String m27511a() {
        byte[] decode = Base64.decode("QW1hem9u", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    @NotNull
    /* renamed from: b */
    public final String m27510b() {
        byte[] decode = Base64.decode("ZnVndQ==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    @NotNull
    /* renamed from: c */
    public final String m27509c() {
        byte[] decode = Base64.decode("WGlhb21p", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }
}
