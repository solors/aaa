package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.model.VastError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastEventTracker.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastEventTracker$createMacros$17 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$17 INSTANCE = new VastEventTracker$createMacros$17();

    VastEventTracker$createMacros$17() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        return String.valueOf(VideoPlayerSettings.Companion.getSupportedClickType().getValue()) + "";
    }
}
