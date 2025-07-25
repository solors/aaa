package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzvp extends zztf implements zzvg {
    private final zzfx zza;
    private final zzrf zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    @Nullable
    private zzgy zzh;
    @GuardedBy("this")
    private zzar zzi;
    private final zzvm zzj;
    private final zzyo zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzvp(zzar zzarVar, zzfx zzfxVar, zzvm zzvmVar, zzrf zzrfVar, zzyo zzyoVar, int i, boolean z, zzfvf zzfvfVar, zzvo zzvoVar) {
        this.zzi = zzarVar;
        this.zza = zzfxVar;
        this.zzj = zzvmVar;
        this.zzb = zzrfVar;
        this.zzk = zzyoVar;
        this.zzc = i;
    }

    private final void zzw() {
        zzal zzalVar;
        zzbq zzbqVar;
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzar zzJ = zzJ();
        if (z2) {
            zzalVar = zzJ.zzc;
        } else {
            zzalVar = null;
        }
        zzwc zzwcVar = new zzwc(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzJ, zzalVar);
        if (this.zzd) {
            zzbqVar = new zzvl(this, zzwcVar);
        } else {
            zzbqVar = zzwcVar;
        }
        zzo(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzueVar) {
        ((zzvk) zzueVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzue zzI(zzug zzugVar, zzyk zzykVar, long j) {
        zzfy zza = this.zza.zza();
        zzgy zzgyVar = this.zzh;
        if (zzgyVar != null) {
            zza.zzf(zzgyVar);
        }
        zzam zzamVar = zzJ().zzb;
        zzamVar.getClass();
        Uri uri = zzamVar.zza;
        zzvm zzvmVar = this.zzj;
        zzb();
        return new zzvk(uri, zza, new zzti(zzvmVar.zza), this.zzb, zzc(zzugVar), this.zzk, zze(zzugVar), this, zzykVar, null, this.zzc, false, zzei.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final synchronized zzar zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzn(@Nullable zzgy zzgyVar) {
        this.zzh = zzgyVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final synchronized void zzt(zzar zzarVar) {
        this.zzi = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}
