package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasurementsReceiver.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class MeasurementsReceiver implements OutcomeReceiver<Object, Exception> {
    @NotNull
    private final MeasurementEvents errorEvent;
    @NotNull
    private final IEventSender eventSender;
    @NotNull
    private final MeasurementEvents successEvent;

    public MeasurementsReceiver(@NotNull IEventSender eventSender, @NotNull MeasurementEvents successEvent, @NotNull MeasurementEvents errorEvent) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        Intrinsics.checkNotNullParameter(successEvent, "successEvent");
        Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(@NotNull Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
