package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnc {
    private final String zza;
    private final zzbop zzb;
    private final Executor zzc;
    private zzcnh zzd;
    private final zzbjp zze = new zzcmz(this);
    private final zzbjp zzf = new zzcnb(this);

    public zzcnc(String str, zzbop zzbopVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbopVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzg(zzcnc zzcncVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcncVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcnh zzcnhVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnhVar;
    }

    public final void zzd(zzcex zzcexVar) {
        zzcexVar.zzag("/updateActiveView", this.zze);
        zzcexVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcex zzcexVar) {
        zzcexVar.zzaz("/updateActiveView", this.zze);
        zzcexVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
