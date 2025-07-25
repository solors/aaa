package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class zzaah implements zzcc {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzu
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzaab zzc;
    private final zzaal zzd;
    private final zzaaq zze;
    private final zzbl zzf;
    private final List zzg;
    private final zzabh zzh;
    private final zzcx zzi;
    private final CopyOnWriteArraySet zzj;
    private zzaai zzk;
    private zzdh zzl;
    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaah(zzzw zzzwVar, zzaag zzaagVar) {
        Context zza2 = zzzw.zza(zzzwVar);
        this.zzb = zza2;
        zzaab zzaabVar = new zzaab(this, zza2);
        this.zzc = zzaabVar;
        zzcx zzc = zzzw.zzc(zzzwVar);
        this.zzi = zzc;
        zzaal zzf = zzzw.zzf(zzzwVar);
        this.zzd = zzf;
        zzf.zzk(zzc);
        zzaaq zzaaqVar = new zzaaq(new zzzx(this, null), zzf);
        this.zze = zzaaqVar;
        zzbl zzb = zzzw.zzb(zzzwVar);
        zzcw.zzb(zzb);
        this.zzf = zzb;
        this.zzg = zzzw.zzg(zzzwVar);
        this.zzh = new zzzh(zzf, zzaaqVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzj = copyOnWriteArraySet;
        this.zzo = 0;
        new zzz().zzag();
        copyOnWriteArraySet.add(zzaabVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzcb zzc(zzaah zzaahVar, zzab zzabVar) {
        boolean z;
        if (zzaahVar.zzo == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzk zzw = zzw(zzabVar.zzC);
        if (zzw.zzd == 7 && zzei.zza < 34) {
            zzi zzc = zzw.zzc();
            zzc.zzd(6);
            zzw = zzc.zzg();
        }
        zzk zzkVar = zzw;
        zzcx zzcxVar = zzaahVar.zzi;
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        final zzdh zzd = zzcxVar.zzd(myLooper, null);
        zzaahVar.zzl = zzd;
        try {
            zzbl zzblVar = zzaahVar.zzf;
            Context context = zzaahVar.zzb;
            zzn zznVar = zzn.zza;
            Objects.requireNonNull(zzd);
            zzblVar.zza(context, zzkVar, zznVar, zzaahVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzd.zzh(runnable);
                }
            }, zzfxn.zzn(), 0L);
            Pair pair = zzaahVar.zzm;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                zzdz zzdzVar = (zzdz) pair.second;
                zzdzVar.zzb();
                zzdzVar.zza();
            }
            throw null;
        } catch (zzbz e) {
            throw new zzabg(e, zzabVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzl(zzaah zzaahVar, boolean z) {
        if (zzaahVar.zzo == 1) {
            zzaahVar.zzn++;
            zzaahVar.zzh.zzd(z);
            zzdh zzdhVar = zzaahVar.zzl;
            zzcw.zzb(zzdhVar);
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                {
                    zzaah.this = zzaahVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaah.this.zzr();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzu(zzaah zzaahVar, long j) {
        if (zzaahVar.zzn == 0 && zzaahVar.zze.zze(j)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzw(@Nullable zzk zzkVar) {
        if (zzkVar != null && zzkVar.zzf()) {
            return zzkVar;
        }
        return zzk.zza;
    }

    public final zzabh zzh() {
        return this.zzc;
    }

    public final void zzq() {
        zzdz zzdzVar = zzdz.zza;
        zzdzVar.zzb();
        zzdzVar.zza();
        this.zzm = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        this.zzn--;
    }

    public final void zzs() {
        if (this.zzo == 2) {
            return;
        }
        zzdh zzdhVar = this.zzl;
        if (zzdhVar != null) {
            zzdhVar.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzt(Surface surface, zzdz zzdzVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzdz) this.zzm.second).equals(zzdzVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzdzVar);
        zzdzVar.zzb();
        zzdzVar.zza();
    }
}
