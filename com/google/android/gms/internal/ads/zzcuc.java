package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcuc implements zzcyq, zzdee {
    private final Context zza;
    private final zzfcj zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdua zze;
    private final zzfhk zzf;

    public zzcuc(Context context, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdua zzduaVar, zzfhk zzfhkVar) {
        this.zza = context;
        this.zzb = zzfcjVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzduaVar;
        this.zzf = zzfhkVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfcj zzfcjVar = this.zzb;
            zzfhk zzfhkVar = this.zzf;
            com.google.android.gms.ads.internal.zzv.zza().zzc(context, versionInfoParcel, zzfcjVar.zzf, zzgVar.zzg(), zzfhkVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzec)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
    }
}
