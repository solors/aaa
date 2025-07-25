package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzajz {
    public static void zza(zzaka zzakaVar, zzake zzakeVar, zzdb zzdbVar) {
        for (int i = 0; i < zzakaVar.zza(); i++) {
            long zzb = zzakaVar.zzb(i);
            List zzc = zzakaVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i != zzakaVar.zza() - 1) {
                    long zzb2 = zzakaVar.zzb(i + 1) - zzakaVar.zzb(i);
                    if (zzb2 > 0) {
                        zzdbVar.zza(new zzajx(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
