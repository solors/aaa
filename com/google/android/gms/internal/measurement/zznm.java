package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zznm implements zznj {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;
    private static final zzgz<Boolean> zzc;
    private static final zzgz<Boolean> zzd;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.consent.stop_reset_on_storage_denied.client", true);
        zzb = zza2.zza("measurement.consent.stop_reset_on_storage_denied.service", true);
        zza2.zza("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        zzc = zza2.zza("measurement.consent.scrub_audience_data_analytics_consent", true);
        zzd = zza2.zza("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }
}
