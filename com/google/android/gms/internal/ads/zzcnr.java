package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnr implements zzayk {
    private zzcex zza;
    private final Executor zzb;
    private final zzcnd zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcng zzg = new zzcng();

    public zzcnr(Executor executor, zzcnd zzcndVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcndVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                    {
                        zzcnr.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcnr.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        boolean z;
        if (this.zzf) {
            z = false;
        } else {
            z = zzayjVar.zzj;
        }
        zzcng zzcngVar = this.zzg;
        zzcngVar.zza = z;
        zzcngVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzayjVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcex zzcexVar) {
        this.zza = zzcexVar;
    }
}
