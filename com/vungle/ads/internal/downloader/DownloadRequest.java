package com.vungle.ads.internal.downloader;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.C29136g2;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.downloader.d */
/* loaded from: classes7.dex */
public final class DownloadRequest {
    @NotNull
    private final AdAsset asset;
    @NotNull
    private final AtomicBoolean cancelled;
    @Nullable
    private final String creativeId;
    @Nullable
    private C29136g2 downloadDuration;
    @Nullable
    private final String eventId;
    @Nullable
    private final String placementId;
    @NotNull
    private final EnumC29190a priority;

    /* compiled from: DownloadRequest.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.downloader.d$a */
    /* loaded from: classes7.dex */
    public enum EnumC29190a {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);
        
        private final int priority;

        EnumC29190a(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(@NotNull EnumC29190a priority, @NotNull AdAsset asset, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    @NotNull
    public final AdAsset getAsset() {
        return this.asset;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* renamed from: getPriority  reason: collision with other method in class */
    public final EnumC29190a m110314getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isHtmlTemplate() {
        return Intrinsics.m17075f(this.asset.getAdIdentifier(), AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return Intrinsics.m17075f(this.asset.getAdIdentifier(), Constants.KEY_MAIN_VIDEO);
    }

    public final boolean isTemplate() {
        if (this.asset.getFileType() != AdAsset.EnumC29244a.ZIP && !isHtmlTemplate()) {
            return false;
        }
        return true;
    }

    public final void startRecord() {
        C29136g2 c29136g2 = new C29136g2(Sdk$SDKMetric.EnumC29430b.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = c29136g2;
        c29136g2.markStart();
    }

    public final void stopRecord() {
        C29136g2 c29136g2 = this.downloadDuration;
        if (c29136g2 != null) {
            c29136g2.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(c29136g2, this.placementId, this.creativeId, this.eventId, this.asset.getServerPath());
        }
    }

    @NotNull
    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", placementId=" + this.placementId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + '}';
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ DownloadRequest(EnumC29190a enumC29190a, AdAsset adAsset, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC29190a, adAsset, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
