package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes6.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(@NotNull InMobiNative inMobiNative, boolean z) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onVideoSkipped(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }
}
