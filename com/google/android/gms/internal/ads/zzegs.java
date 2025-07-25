package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzegs {
    private final zzfdb zza;
    private final zzdpj zzb;
    private final zzdrw zzc;

    public zzegs(zzfdb zzfdbVar, zzdpj zzdpjVar, zzdrw zzdrwVar) {
        this.zza = zzfdbVar;
        this.zzb = zzdpjVar;
        this.zzc = zzdrwVar;
    }

    public final void zza(zzfbr zzfbrVar, zzfbo zzfboVar, int i, zzeda zzedaVar, long j) {
        zzdpi zzdpiVar;
        zzdrv zza = this.zzc.zza();
        zza.zzd(zzfbrVar);
        zza.zzc(zzfboVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j));
        zza.zzb("sc", Integer.toString(i));
        if (zzedaVar != null) {
            zza.zzb("arec", Integer.toString(zzedaVar.zzb().zza));
            String zza2 = this.zza.zza(zzedaVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdpj zzdpjVar = this.zzb;
        Iterator it = zzfboVar.zzt.iterator();
        while (true) {
            if (it.hasNext()) {
                zzdpiVar = zzdpjVar.zza((String) it.next());
                if (zzdpiVar != null) {
                    break;
                }
            } else {
                zzdpiVar = null;
                break;
            }
        }
        if (zzdpiVar != null) {
            zza.zzb("ancn", zzdpiVar.zza);
            zzbrs zzbrsVar = zzdpiVar.zzb;
            if (zzbrsVar != null) {
                zza.zzb("adapter_v", zzbrsVar.toString());
            }
            zzbrs zzbrsVar2 = zzdpiVar.zzc;
            if (zzbrsVar2 != null) {
                zza.zzb("adapter_sv", zzbrsVar2.toString());
            }
        }
        zza.zzg();
    }
}
