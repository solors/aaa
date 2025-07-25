package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cu0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vj1 extends qm1 {
    @Nullable

    /* renamed from: b */
    private final String f86768b;

    /* renamed from: c */
    private final long f86769c;
    @NotNull

    /* renamed from: d */
    private final BufferedSource f86770d;

    public vj1(@Nullable String str, long j, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f86768b = str;
        this.f86769c = j;
        this.f86770d = source;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    /* renamed from: a */
    public final long mo28297a() {
        return this.f86769c;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    @Nullable
    /* renamed from: b */
    public final cu0 mo28296b() {
        String str = this.f86768b;
        if (str != null) {
            int i = cu0.f77770d;
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return cu0.C30121a.m35156a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.qm1
    @NotNull
    /* renamed from: c */
    public final BufferedSource mo28295c() {
        return this.f86770d;
    }
}
