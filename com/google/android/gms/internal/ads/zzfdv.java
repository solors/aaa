package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfdv {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfeu zzd = new zzfeu();

    public zzfdv(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((zzfef) this.zza.getFirst()).zzd >= this.zzc) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    @Nullable
    public final zzfef zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfef zzfefVar = (zzfef) this.zza.remove();
        if (zzfefVar != null) {
            this.zzd.zzh();
        }
        return zzfefVar;
    }

    public final zzfet zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfef zzfefVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfefVar);
        return true;
    }
}
