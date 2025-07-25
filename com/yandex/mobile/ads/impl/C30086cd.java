package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cd */
/* loaded from: classes8.dex */
public final class C30086cd {
    @NotNull

    /* renamed from: a */
    private final C30162dd f77600a;

    public /* synthetic */ C30086cd() {
        this(new C30162dd());
    }

    /* renamed from: a */
    public final boolean m35248a() {
        this.f77600a.getClass();
        int m34960a = C30162dd.m34960a();
        this.f77600a.getClass();
        if (m34960a >= 21) {
            return true;
        }
        return false;
    }

    public C30086cd(@NotNull C30162dd androidSdkApiProvider) {
        Intrinsics.checkNotNullParameter(androidSdkApiProvider, "androidSdkApiProvider");
        this.f77600a = androidSdkApiProvider;
    }
}
