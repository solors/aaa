package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.uh2;
import com.yandex.mobile.ads.impl.w82;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public final class VideoController {
    @NotNull

    /* renamed from: a */
    private final w82 f76571a;

    public VideoController(@NotNull w82 videoEventController) {
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        this.f76571a = videoEventController;
    }

    public final void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.f76571a.m28005a(new uh2(videoEventListener));
            return;
        }
        this.f76571a.m28005a((uh2) null);
    }
}
