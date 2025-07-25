package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zze implements zza {

    /* renamed from: a */
    private AnalyticsConnector.AnalyticsConnectorListener f42064a;

    /* renamed from: b */
    private AppMeasurementSdk f42065b;

    /* renamed from: c */
    private zzg f42066c;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f42064a = analyticsConnectorListener;
        this.f42065b = appMeasurementSdk;
        zzg zzgVar = new zzg(this);
        this.f42066c = zzgVar;
        this.f42065b.registerOnMeasurementEventListener(zzgVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f42064a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
    }
}
