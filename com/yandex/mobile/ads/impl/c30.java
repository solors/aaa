package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c30 {
    @NotNull

    /* renamed from: c */
    private static final c30 f77485c = new c30(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");
    @NotNull

    /* renamed from: a */
    private final String f77486a;

    /* renamed from: b */
    private final int f77487b;

    public c30(int i, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.f77486a = publicKey;
        this.f77487b = i;
    }

    @NotNull
    /* renamed from: b */
    public final String m35373b() {
        return this.f77486a;
    }

    /* renamed from: c */
    public final int m35372c() {
        return this.f77487b;
    }

    @NotNull
    /* renamed from: d */
    public final String m35371d() {
        return this.f77486a;
    }

    /* renamed from: e */
    public final int m35370e() {
        return this.f77487b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c30)) {
            return false;
        }
        c30 c30Var = (c30) obj;
        if (Intrinsics.m17075f(this.f77486a, c30Var.f77486a) && this.f77487b == c30Var.f77487b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77487b) + (this.f77486a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f77486a;
        int i = this.f77487b;
        return "EncryptionParameters(publicKey=" + str + ", version=" + i + ")";
    }
}
