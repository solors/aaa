package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t41 implements t71 {
    @NotNull

    /* renamed from: a */
    private final o71 f85503a;
    @Nullable

    /* renamed from: b */
    private b92 f85504b;

    public t41(@NotNull o71 nativeVideoController, @NotNull w82 videoLifecycleListener, @Nullable b92 b92Var) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        this.f85503a = nativeVideoController;
        this.f85504b = b92Var;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29264a() {
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: b */
    public final void mo29262b() {
        b92 b92Var = this.f85504b;
        if (b92Var != null) {
            b92Var.onVideoComplete();
        }
    }

    /* renamed from: c */
    public final void m29299c() {
        this.f85503a.m31138b(this);
        this.f85504b = null;
    }

    /* renamed from: d */
    public final void m29298d() {
        this.f85503a.m31139a(this);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29263a(long j, long j2) {
    }
}
