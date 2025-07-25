package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e72 {
    @NotNull

    /* renamed from: a */
    private final sa2 f78478a;

    /* renamed from: b */
    private boolean f78479b;

    public e72(@NotNull f72<?> videoAdPlayer, @NotNull sa2 videoTracker) {
        boolean z;
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f78478a = videoTracker;
        if (videoAdPlayer.getVolume() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f78479b = z;
    }

    /* renamed from: a */
    public final void m34652a(float f) {
        if (f == 0.0f) {
            if (!this.f78479b) {
                this.f78479b = true;
                this.f78478a.mo29030l();
            }
        } else if (this.f78479b) {
            this.f78479b = false;
            this.f78478a.mo29047a();
        }
    }
}
