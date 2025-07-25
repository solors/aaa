package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e9 */
/* loaded from: classes8.dex */
public final class C30225e9 {
    @NotNull

    /* renamed from: a */
    private final C30370g9 f78482a;
    @NotNull

    /* renamed from: b */
    private final C30533i5 f78483b;
    @NotNull

    /* renamed from: c */
    private final C31423t4 f78484c;

    public C30225e9(@NotNull C30370g9 adStateHolder, @NotNull C30533i5 playbackStateController, @NotNull C31423t4 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f78482a = adStateHolder;
        this.f78483b = playbackStateController;
        this.f78484c = adInfoStorage;
    }

    @NotNull
    /* renamed from: a */
    public final C31423t4 m34650a() {
        return this.f78484c;
    }

    @NotNull
    /* renamed from: b */
    public final C30370g9 m34649b() {
        return this.f78482a;
    }

    @NotNull
    /* renamed from: c */
    public final C30533i5 m34648c() {
        return this.f78483b;
    }
}
