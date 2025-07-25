package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnh implements zzayk, zzcwo, com.google.android.gms.ads.internal.overlay.zzr, zzcwn {
    private final zzcnc zza;
    private final zzcnd zzb;
    private final zzbos zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcng zzh = new zzcng();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcnh(zzbop zzbopVar, zzcnd zzcndVar, Executor executor, zzcnc zzcncVar, Clock clock) {
        this.zza = zzcncVar;
        zzboa zzboaVar = zzbod.zza;
        this.zzd = zzbopVar.zza("google.afma.activeView.handleUpdate", zzboaVar, zzboaVar);
        this.zzb = zzcndVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcex zzcexVar : this.zzc) {
            this.zza.zzf(zzcexVar);
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdh(@Nullable Context context) {
        this.zzh.zze = ApsMetricsDataMap.APSMETRICS_FIELD_URL;
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdj(@Nullable Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void zzdk(@Nullable Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(zzayj zzayjVar) {
        zzcng zzcngVar = this.zzh;
        zzcngVar.zza = zzayjVar.zzj;
        zzcngVar.zzf = zzayjVar;
        zzg();
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (!this.zzi && this.zzg.get()) {
                try {
                    this.zzh.zzd = this.zzf.elapsedRealtime();
                    final JSONObject zzb = this.zzb.zzb(this.zzh);
                    for (final zzcex zzcexVar : this.zzc) {
                        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcex.this.zzl("AFMA_updateActiveView", zzb);
                            }
                        });
                    }
                    zzbzz.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                    return;
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
                    return;
                }
            }
            return;
        }
        zzj();
    }

    public final synchronized void zzh(zzcex zzcexVar) {
        this.zzc.add(zzcexVar);
        this.zza.zzd(zzcexVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
    }
}
