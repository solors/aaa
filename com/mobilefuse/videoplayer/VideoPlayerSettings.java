package com.mobilefuse.videoplayer;

import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.videoplayer.model.DataRegulation;
import com.mobilefuse.videoplayer.model.VastClickType;
import com.mobilefuse.videoplayer.model.VastVersion;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerSettings.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VideoPlayerSettings {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static String advertisingId = null;
    private static final Set<DataRegulation> applicableDataRegulations;
    @Nullable
    private static String deviceIp = null;
    private static boolean isLimitTrackingEnabled = false;
    @NotNull
    public static final String playerName = "MobileFuseVASTPlayer";
    @NotNull
    public static final String playerVersion = "Android_1.8.0";
    @NotNull
    private static String sdkName;
    @NotNull
    private static String sdkVersion;
    @NotNull
    private static final Set<ApiFramework> supportedApiFrameworks;
    @NotNull
    private static final VastClickType supportedClickType;
    @NotNull
    private static final Set<VastVersion> supportedVastVersions;
    @NotNull
    private static final Set<String> supportedVideoContainers;

    static {
        Set<String> m17119j;
        Set<VastVersion> m17119j2;
        Set<ApiFramework> m17127d;
        m17119j = C37572z0.m17119j("video/mp4", "video/3gpp");
        supportedVideoContainers = m17119j;
        m17119j2 = C37572z0.m17119j(VastVersion.VAST2, VastVersion.VAST2_WRAPPER, VastVersion.VAST3, VastVersion.VAST3_WRAPPER, VastVersion.VAST4, VastVersion.VAST4_WRAPPER, VastVersion.VAST4_1, VastVersion.VAST4_1_WRAPPER, VastVersion.VAST4_2, VastVersion.VAST4_2_WRAPPER);
        supportedVastVersions = m17119j2;
        m17127d = SetsJVM.m17127d(ApiFramework.OMID1);
        supportedApiFrameworks = m17127d;
        applicableDataRegulations = new LinkedHashSet();
        sdkName = "n/a";
        sdkVersion = "n/a";
        supportedClickType = VastClickType.BUTTON_OR_LINK;
    }

    public static final void addApplicableDataRegulations(@NotNull DataRegulation dataRegulation) {
        Companion.addApplicableDataRegulations(dataRegulation);
    }

    @Nullable
    public static final String getAdvertisingId() {
        return advertisingId;
    }

    @NotNull
    public static final Set<DataRegulation> getApplicableDataRegulations() {
        return Companion.getApplicableDataRegulations();
    }

    @Nullable
    public static final String getDeviceIp() {
        return deviceIp;
    }

    @NotNull
    public static final String getSdkName() {
        return sdkName;
    }

    @NotNull
    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static final boolean isLimitTrackingEnabled() {
        return isLimitTrackingEnabled;
    }

    public static final void removeApplicableDataRegulations(@NotNull DataRegulation dataRegulation) {
        Companion.removeApplicableDataRegulations(dataRegulation);
    }

    public static final void setAdvertisingId(@Nullable String str) {
        advertisingId = str;
    }

    public static final void setDeviceIp(@Nullable String str) {
        deviceIp = str;
    }

    public static final void setLimitTrackingEnabled(boolean z) {
        isLimitTrackingEnabled = z;
    }

    public static final void setSdkName(@NotNull String str) {
        sdkName = str;
    }

    public static final void setSdkVersion(@NotNull String str) {
        sdkVersion = str;
    }

    /* compiled from: VideoPlayerSettings.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addApplicableDataRegulations(@NotNull DataRegulation regulation) {
            Intrinsics.checkNotNullParameter(regulation, "regulation");
            VideoPlayerSettings.applicableDataRegulations.add(regulation);
        }

        @Nullable
        public final String getAdvertisingId() {
            return VideoPlayerSettings.advertisingId;
        }

        @NotNull
        public final Set<DataRegulation> getApplicableDataRegulations() {
            return VideoPlayerSettings.applicableDataRegulations;
        }

        @Nullable
        public final String getDeviceIp() {
            return VideoPlayerSettings.deviceIp;
        }

        @NotNull
        public final String getSdkName() {
            return VideoPlayerSettings.sdkName;
        }

        @NotNull
        public final String getSdkVersion() {
            return VideoPlayerSettings.sdkVersion;
        }

        @NotNull
        public final Set<ApiFramework> getSupportedApiFrameworks() {
            return VideoPlayerSettings.supportedApiFrameworks;
        }

        @NotNull
        public final VastClickType getSupportedClickType() {
            return VideoPlayerSettings.supportedClickType;
        }

        @NotNull
        public final Set<VastVersion> getSupportedVastVersions() {
            return VideoPlayerSettings.supportedVastVersions;
        }

        @NotNull
        public final Set<String> getSupportedVideoContainers() {
            return VideoPlayerSettings.supportedVideoContainers;
        }

        public final boolean isLimitTrackingEnabled() {
            return VideoPlayerSettings.isLimitTrackingEnabled;
        }

        public final void removeApplicableDataRegulations(@NotNull DataRegulation regulation) {
            Intrinsics.checkNotNullParameter(regulation, "regulation");
            VideoPlayerSettings.applicableDataRegulations.remove(regulation);
        }

        public final void setAdvertisingId(@Nullable String str) {
            VideoPlayerSettings.advertisingId = str;
        }

        public final void setDeviceIp(@Nullable String str) {
            VideoPlayerSettings.deviceIp = str;
        }

        public final void setLimitTrackingEnabled(boolean z) {
            VideoPlayerSettings.isLimitTrackingEnabled = z;
        }

        public final void setSdkName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            VideoPlayerSettings.sdkName = str;
        }

        public final void setSdkVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            VideoPlayerSettings.sdkVersion = str;
        }

        public static /* synthetic */ void getAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getDeviceIp$annotations() {
        }

        public static /* synthetic */ void getSdkName$annotations() {
        }

        public static /* synthetic */ void getSdkVersion$annotations() {
        }

        public static /* synthetic */ void isLimitTrackingEnabled$annotations() {
        }
    }
}
