package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d9 */
/* loaded from: classes8.dex */
public final class C30154d9 {
    @NotNull

    /* renamed from: a */
    private final C30300f9 f78003a;
    @NotNull

    /* renamed from: b */
    private final C30443h5 f78004b;
    @NotNull

    /* renamed from: c */
    private final C31329s4 f78005c;

    public C30154d9(@NotNull C30300f9 adStateHolder, @NotNull C30443h5 playbackStateController, @NotNull C31329s4 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f78003a = adStateHolder;
        this.f78004b = playbackStateController;
        this.f78005c = adInfoStorage;
    }

    @NotNull
    /* renamed from: a */
    public final C31329s4 m34992a() {
        return this.f78005c;
    }

    @NotNull
    /* renamed from: b */
    public final C30300f9 m34991b() {
        return this.f78003a;
    }

    @NotNull
    /* renamed from: c */
    public final C30443h5 m34990c() {
        return this.f78004b;
    }
}
