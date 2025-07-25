package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ew0 {
    @NotNull

    /* renamed from: a */
    private final v52 f78816a;

    public ew0(@NotNull v52 versionParser) {
        Intrinsics.checkNotNullParameter(versionParser, "versionParser");
        this.f78816a = versionParser;
    }

    /* renamed from: a */
    public final boolean m34416a(@NotNull String current, @Nullable String str) {
        boolean m16635B;
        Intrinsics.checkNotNullParameter(current, "current");
        if (str != null) {
            m16635B = StringsJVM.m16635B(str);
            if (m16635B) {
                return true;
            }
            this.f78816a.getClass();
            u52 m28523a = v52.m28523a(current);
            if (m28523a == null) {
                return true;
            }
            this.f78816a.getClass();
            u52 m28523a2 = v52.m28523a(str);
            if (m28523a2 == null || m28523a.compareTo(m28523a2) >= 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
