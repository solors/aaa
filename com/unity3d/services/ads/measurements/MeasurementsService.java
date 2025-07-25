package com.unity3d.services.ads.measurements;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37798s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MeasurementsService.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class MeasurementsService {
    @NotNull
    private final ISDKDispatchers dispatchers;
    @NotNull
    private final IEventSender eventSender;
    @Nullable
    private final MeasurementManager measurementManager;

    public MeasurementsService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers, @NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() < 33 || SdkExtensions.getExtensionVersion(1000000) < 4) {
            return null;
        }
        return (MeasurementManager) context.getSystemService(MeasurementManager.class);
    }

    public final void checkAvailability() {
        if (Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.NOT_AVAILABLE, MeasurementErrors.ERROR_API_BELOW_33);
        } else if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.NOT_AVAILABLE, MeasurementErrors.ERROR_EXTENSION_BELOW_4);
        } else if (this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.NOT_AVAILABLE, MeasurementErrors.ERROR_MANAGER_NULL);
        } else if (!AdServicesState.isAdServicesStateEnabled()) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.NOT_AVAILABLE, MeasurementErrors.ERROR_AD_SERVICES_DISABLED);
        } else {
            this.measurementManager.getMeasurementApiStatus(C37798s1.m16101a(this.dispatchers.getDefault()), new MeasurementsStatusReceiver(this.eventSender));
        }
    }

    public final void registerClick(@NotNull String url, @NotNull InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(url), inputEvent, C37798s1.m16101a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementEvents.CLICK_SUCCESSFUL, MeasurementEvents.CLICK_ERROR));
        }
    }

    public final void registerTrigger(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerTrigger(Uri.parse(url), C37798s1.m16101a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementEvents.TRIGGER_SUCCESSFUL, MeasurementEvents.TRIGGER_ERROR));
        }
    }

    public final void registerView(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(url), (InputEvent) null, C37798s1.m16101a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementEvents.VIEW_SUCCESSFUL, MeasurementEvents.VIEW_ERROR));
        }
    }
}
