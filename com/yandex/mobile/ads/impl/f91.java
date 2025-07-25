package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f91 implements e91 {
    @NotNull

    /* renamed from: a */
    private final C31753wi f79016a;

    public /* synthetic */ f91() {
        this(new C31753wi());
    }

    @Override // com.yandex.mobile.ads.impl.e91
    @Nullable
    /* renamed from: a */
    public final String mo34192a(@NotNull nm1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] m29983a = networkResponse.m31465a().m29983a();
        if (m29983a != null) {
            this.f79016a.getClass();
            return C31753wi.m27896a(m29983a);
        }
        return null;
    }

    public f91(@NotNull C31753wi base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f79016a = base64Decoder;
    }
}
