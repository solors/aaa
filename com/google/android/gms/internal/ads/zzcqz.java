package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzcqz implements zzegr {
    protected final zzfca zza;
    protected final zzfbo zzb;
    private final zzcws zzc;
    private final zzcxf zzd;
    @Nullable
    private final zzezc zze;
    private final zzcvm zzf;
    private final zzdac zzg;
    private final zzcxj zzh;
    private final zzddh zzi;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcqz(zzcqy zzcqyVar) {
        zzfca zzfcaVar;
        zzfbo zzfboVar;
        zzcws zzcwsVar;
        zzcxf zzcxfVar;
        zzezc zzezcVar;
        zzcvm zzcvmVar;
        zzdac zzdacVar;
        zzcxj zzcxjVar;
        zzddh zzddhVar;
        zzfcaVar = zzcqyVar.zza;
        this.zza = zzfcaVar;
        zzfboVar = zzcqyVar.zzb;
        this.zzb = zzfboVar;
        zzcwsVar = zzcqyVar.zzc;
        this.zzc = zzcwsVar;
        zzcxfVar = zzcqyVar.zzd;
        this.zzd = zzcxfVar;
        zzezcVar = zzcqyVar.zze;
        this.zze = zzezcVar;
        zzcvmVar = zzcqyVar.zzf;
        this.zzf = zzcvmVar;
        zzdacVar = zzcqyVar.zzg;
        this.zzg = zzdacVar;
        zzcxjVar = zzcqyVar.zzh;
        this.zzh = zzcxjVar;
        zzddhVar = zzcqyVar.zzi;
        this.zzi = zzddhVar;
    }

    public void zzb() {
        this.zzc.zza(null);
    }

    public void zzk() {
        this.zzd.zzs();
        this.zzh.zza(this);
    }

    public final zzcvm zzm() {
        return this.zzf;
    }

    public final zzcws zzn() {
        return this.zzc;
    }

    public final zzczz zzo() {
        return this.zzg.zzi();
    }

    @Nullable
    public final zzezc zzp() {
        return this.zze;
    }

    public final zzfca zzq() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        this.zzi.zzt();
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }
}
