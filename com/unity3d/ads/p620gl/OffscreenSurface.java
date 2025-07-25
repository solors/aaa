package com.unity3d.ads.p620gl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OffscreenSurface.kt */
@Metadata
/* renamed from: com.unity3d.ads.gl.OffscreenSurface */
/* loaded from: classes7.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(@NotNull EglCore eglCore, int i, int i2) {
        super(eglCore);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
