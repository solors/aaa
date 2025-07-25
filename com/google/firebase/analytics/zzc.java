package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zzkk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
final class zzc implements zzkk {

    /* renamed from: a */
    private final /* synthetic */ zzdq f42075a;

    public zzc(zzdq zzdqVar) {
        this.f42075a = zzdqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final int zza(String str) {
        return this.f42075a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str) {
        this.f42075a.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzc(String str) {
        this.f42075a.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final long zzf() {
        return this.f42075a.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    @Nullable
    public final String zzg() {
        return this.f42075a.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    @Nullable
    public final String zzh() {
        return this.f42075a.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    @Nullable
    public final String zzi() {
        return this.f42075a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    @Nullable
    public final String zzj() {
        return this.f42075a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    @Nullable
    public final Object zza(int i) {
        return this.f42075a.zza(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str, String str2, Bundle bundle) {
        this.f42075a.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final List<Bundle> zza(@Nullable String str, @Nullable String str2) {
        return this.f42075a.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(zziu zziuVar) {
        this.f42075a.zzb(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Map<String, Object> zza(@Nullable String str, @Nullable String str2, boolean z) {
        return this.f42075a.zza(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f42075a.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, String str2, Bundle bundle, long j) {
        this.f42075a.zza(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zziu zziuVar) {
        this.f42075a.zza(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(Bundle bundle) {
        this.f42075a.zza(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zzir zzirVar) {
        this.f42075a.zza(zzirVar);
    }
}
