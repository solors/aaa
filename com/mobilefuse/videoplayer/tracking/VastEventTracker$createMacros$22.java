package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormatting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastEventTracker.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastEventTracker$createMacros$22 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$22 INSTANCE = new VastEventTracker$createMacros$22();

    VastEventTracker$createMacros$22() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        String encodeUriComponent;
        String deviceIp = VideoPlayerSettings.Companion.getDeviceIp();
        return (deviceIp == null || (encodeUriComponent = StringEncodingAndFormatting.encodeUriComponent(deviceIp)) == null) ? "-1" : encodeUriComponent;
    }
}
