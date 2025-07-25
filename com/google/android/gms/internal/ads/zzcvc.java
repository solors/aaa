package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcvc {
    private final Context zza;
    private final zzfcj zzb;
    private final Bundle zzc;
    @Nullable
    private final zzfcb zzd;
    @Nullable
    private final zzcut zze;
    @Nullable
    private final zzedb zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcvc(zzcva zzcvaVar, zzcvb zzcvbVar) {
        this.zza = zzcva.zzb(zzcvaVar);
        this.zzb = zzcva.zzo(zzcvaVar);
        this.zzc = zzcva.zzc(zzcvaVar);
        this.zzd = zzcva.zzn(zzcvaVar);
        this.zze = zzcva.zzd(zzcvaVar);
        this.zzf = zzcva.zzm(zzcvaVar);
        this.zzg = zzcva.zza(zzcvaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb(Context context) {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final Bundle zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzcut zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcva zze() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(this.zzb);
        zzcvaVar.zzg(this.zzc);
        zzcvaVar.zzh(this.zze);
        zzcvaVar.zze(this.zzf);
        return zzcvaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzedb zzf(String str) {
        zzedb zzedbVar = this.zzf;
        if (zzedbVar != null) {
            return zzedbVar;
        }
        return new zzedb(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzfcb zzg() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfcj zzh() {
        return this.zzb;
    }
}
