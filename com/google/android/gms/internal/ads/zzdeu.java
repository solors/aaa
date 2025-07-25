package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzdeu {
    private final zzdgc zza;
    @Nullable
    private final zzcex zzb;

    public zzdeu(zzdgc zzdgcVar, @Nullable zzcex zzcexVar) {
        this.zza = zzdgcVar;
        this.zzb = zzcexVar;
    }

    @Nullable
    public final View zza() {
        zzcex zzcexVar = this.zzb;
        if (zzcexVar == null) {
            return null;
        }
        return zzcexVar.zzG();
    }

    @Nullable
    public final View zzb() {
        zzcex zzcexVar = this.zzb;
        if (zzcexVar != null) {
            return zzcexVar.zzG();
        }
        return null;
    }

    @Nullable
    public final zzcex zzc() {
        return this.zzb;
    }

    public final zzddk zzd(Executor executor) {
        final zzcex zzcexVar = this.zzb;
        return new zzddk(new zzdai() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdai
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcex zzcexVar2 = zzcex.this;
                if (zzcexVar2 != null && (zzL = zzcexVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdgc zze() {
        return this.zza;
    }

    public Set zzf(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddk(zzcuoVar, zzbzw.zzg));
    }

    public Set zzg(zzcuo zzcuoVar) {
        return Collections.singleton(new zzddk(zzcuoVar, zzbzw.zzg));
    }
}
