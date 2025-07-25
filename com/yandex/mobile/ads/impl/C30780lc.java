package com.yandex.mobile.ads.impl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lc */
/* loaded from: classes8.dex */
public final class C30780lc {
    @NotNull

    /* renamed from: a */
    private final String f81770a;
    @NotNull

    /* renamed from: b */
    private final byte[] f81771b;
    @NotNull

    /* renamed from: c */
    private final byte[] f81772c;

    public C30780lc(@NotNull String algorithm, @NotNull byte[] password, @NotNull byte[] iV) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(iV, "iV");
        this.f81770a = algorithm;
        this.f81771b = password;
        this.f81772c = iV;
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m32296a(@NotNull byte[] input) throws Exception {
        Intrinsics.checkNotNullParameter(input, "input");
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f81771b, "AES");
        Cipher cipher = Cipher.getInstance(this.f81770a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f81772c));
        byte[] doFinal = cipher.doFinal(input);
        Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }
}
