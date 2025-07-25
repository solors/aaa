package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zzg implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ zze f42068a;

    public zzg(zze zzeVar) {
        this.f42068a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zziu
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (str != null && zzd.zze(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            analyticsConnectorListener = this.f42068a.f42064a;
            analyticsConnectorListener.onMessageTriggered(3, bundle2);
        }
    }
}
