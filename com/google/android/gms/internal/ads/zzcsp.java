package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcsp implements zzcxh, com.google.android.gms.ads.internal.client.zza, zzcyq, zzcwn, zzcvt, zzdbc {
    private final Clock zza;
    private final zzbzf zzb;

    public zzcsp(Clock clock, zzbzf zzbzfVar) {
        this.zza = clock;
        this.zzb = zzbzfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(zzbbq.zzb zzbVar) {
        this.zzb.zzi();
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(zzbbq.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(zzbbq.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
    }
}
