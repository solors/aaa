package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.sdk.device.GetLastKnownLocationData;
import com.mobilefuse.sdk.device.LocationData;
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
final class VastEventTracker$createMacros$32 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$32 INSTANCE = new VastEventTracker$createMacros$32();

    VastEventTracker$createMacros$32() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        LocationData lastKnownLocationData;
        if (VideoPlayerSettings.Companion.isLimitTrackingEnabled()) {
            return "-2";
        }
        if (GetLastKnownLocationData.getLastKnownLocationData() != null) {
            String str = String.valueOf(lastKnownLocationData.getLatitude()) + "," + String.valueOf(lastKnownLocationData.getLongitude());
            if (str != null) {
                return str;
            }
        }
        return "-1";
    }
}
