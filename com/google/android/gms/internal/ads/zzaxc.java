package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaxc extends zzaxr {
    private final zzavg zzh;
    private final long zzi;
    private final long zzj;

    public zzaxc(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, zzavg zzavgVar, long j, long j2) {
        super(zzawdVar, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", zzascVar, i, 11);
        this.zzh = zzavgVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavg zzavgVar = this.zzh;
        if (zzavgVar != null) {
            zzave zzaveVar = new zzave((String) this.zze.invoke(null, zzavgVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                this.zzd.zzz(zzaveVar.zza.longValue());
                if (zzaveVar.zzb.longValue() >= 0) {
                    this.zzd.zzQ(zzaveVar.zzb.longValue());
                }
                if (zzaveVar.zzc.longValue() >= 0) {
                    this.zzd.zzf(zzaveVar.zzc.longValue());
                }
            }
        }
    }
}
