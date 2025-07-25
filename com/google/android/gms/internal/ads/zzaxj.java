package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaxj extends zzaxr {
    private final StackTraceElement[] zzh;

    public zzaxj(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzawdVar, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", zzascVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            int i = 1;
            zzavu zzavuVar = new zzavu((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                this.zzd.zzF(zzavuVar.zza.longValue());
                if (zzavuVar.zzb.booleanValue()) {
                    zzasc zzascVar = this.zzd;
                    if (true != zzavuVar.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzascVar.zzac(i);
                } else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}
