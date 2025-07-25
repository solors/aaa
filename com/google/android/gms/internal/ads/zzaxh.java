package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaxh extends zzaxr {
    private List zzh;
    private final Context zzi;

    public zzaxh(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, Context context) {
        super(zzawdVar, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", zzascVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, context);
        }
        List list = this.zzh;
        if (list != null && list.size() == 2) {
            synchronized (this.zzd) {
                this.zzd.zzW(((Long) this.zzh.get(0)).longValue());
                this.zzd.zzS(((Long) this.zzh.get(1)).longValue());
            }
        }
    }
}
