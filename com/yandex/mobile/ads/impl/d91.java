package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class d91 {
    @NotNull

    /* renamed from: a */
    private final mj1 f78007a;
    @NotNull

    /* renamed from: b */
    private final nj1 f78008b;

    public /* synthetic */ d91() {
        this(new mj1(), nj1.f82799b.m31488a());
    }

    @Nullable
    /* renamed from: a */
    public final c91 m34989a(@NotNull ml1<?> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String m31490a = this.f78008b.m31490a(request);
        if (m31490a != null) {
            try {
                lj1 m31977a = this.f78007a.m31977a(m31490a);
                byte[] bytes = m31977a.m32245a().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return new c91(200, bytes, m31977a.m32244b(), false);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public d91(@NotNull mj1 readyResponseDecoder, @NotNull nj1 readyResponseStorage) {
        Intrinsics.checkNotNullParameter(readyResponseDecoder, "readyResponseDecoder");
        Intrinsics.checkNotNullParameter(readyResponseStorage, "readyResponseStorage");
        this.f78007a = readyResponseDecoder;
        this.f78008b = readyResponseStorage;
    }
}
