package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37798s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TopicsService.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class TopicsService {
    @NotNull
    private final ISDKDispatchers dispatchers;
    @NotNull
    private final IEventSender eventSender;
    @Nullable
    private final TopicsManager topicsManager;

    public TopicsService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers, @NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() < 33 || SdkExtensions.getExtensionVersion(1000000) < 4) {
            return null;
        }
        return (TopicsManager) context.getSystemService(TopicsManager.class);
    }

    @NotNull
    public final TopicsStatus checkAvailability() {
        if (Device.getApiLevel() < 33) {
            return TopicsStatus.ERROR_API_BELOW_33;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return TopicsStatus.ERROR_AD_SERVICES_DISABLED;
        }
        return TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(@NotNull String adsSdkName, boolean z) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(adsSdkName).setShouldRecordObservation(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(build, C37798s1.m16101a(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e.toString());
            DeviceLog.debug("Failed to get topics with error: " + e);
        }
    }
}
