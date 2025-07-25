package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zzf implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ zzc f42067a;

    public zzf(zzc zzcVar) {
        this.f42067a = zzcVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zziu
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (!this.f42067a.f42054a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", zzd.zza(str2));
        analyticsConnectorListener = this.f42067a.f42055b;
        analyticsConnectorListener.onMessageTriggered(2, bundle2);
    }
}
