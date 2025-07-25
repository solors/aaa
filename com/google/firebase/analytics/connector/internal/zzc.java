package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
public final class zzc implements zza {

    /* renamed from: a */
    Set<String> f42054a;

    /* renamed from: b */
    private AnalyticsConnector.AnalyticsConnectorListener f42055b;

    /* renamed from: c */
    private AppMeasurementSdk f42056c;

    /* renamed from: d */
    private zzf f42057d;

    public zzc(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f42055b = analyticsConnectorListener;
        this.f42056c = appMeasurementSdk;
        zzf zzfVar = new zzf(this);
        this.f42057d = zzfVar;
        this.f42056c.registerOnMeasurementEventListener(zzfVar);
        this.f42054a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f42055b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
        this.f42054a.clear();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
        this.f42054a.clear();
        Set<String> set2 = this.f42054a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzd.zzc(str) && zzd.zzd(str)) {
                String zzb = zzd.zzb(str);
                Preconditions.checkNotNull(zzb);
                hashSet.add(zzb);
            }
        }
        set2.addAll(hashSet);
    }
}
