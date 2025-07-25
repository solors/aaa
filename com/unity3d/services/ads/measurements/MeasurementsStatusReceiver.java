package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MeasurementsStatusReceiver.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class MeasurementsStatusReceiver implements OutcomeReceiver<Integer, Exception> {
    @NotNull
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(@NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(Integer num) {
        onResult(num.intValue());
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.NOT_AVAILABLE, MeasurementErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(int i) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementEvents.AVAILABLE, Integer.valueOf(i));
    }
}
