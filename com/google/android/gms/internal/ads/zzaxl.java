package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaxl extends zzaxr {
    private final zzawk zzh;
    private long zzi;

    public zzaxl(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, zzawk zzawkVar) {
        super(zzawdVar, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", zzascVar, i, 53);
        this.zzh = zzawkVar;
        if (zzawkVar != null) {
            this.zzi = zzawkVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
