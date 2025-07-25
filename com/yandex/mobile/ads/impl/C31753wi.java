package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wi */
/* loaded from: classes8.dex */
public final class C31753wi {
    @NotNull
    /* renamed from: a */
    public static String m27897a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return m27896a(bytes);
    }

    @Nullable
    /* renamed from: b */
    public static String m27895b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = value.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            byte[] decode = Base64.decode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return new String(decode, charset);
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            return null;
        }
    }

    @NotNull
    /* renamed from: a */
    public static String m27896a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            byte[] decode = Base64.decode(data, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return new String(decode, Charsets.UTF_8);
        } catch (Exception unused) {
            String str = new String(data, Charsets.UTF_8);
            Object[] args = new Object[0];
            int i = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            return str;
        }
    }
}
