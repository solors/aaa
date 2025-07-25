package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ak1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sb0 {
    @NotNull

    /* renamed from: a */
    private final Object f85166a;

    public sb0(@NotNull Object fusedLocationProviderObject) {
        Intrinsics.checkNotNullParameter(fusedLocationProviderObject, "fusedLocationProviderObject");
        this.f85166a = fusedLocationProviderObject;
    }

    @Nullable
    /* renamed from: a */
    public final eq0 m29655a() {
        Object m35839a = ak1.C29944a.m35839a(this.f85166a, "getLastLocation", new Object[0]);
        if (m35839a != null) {
            return new eq0(m35839a);
        }
        return null;
    }
}
