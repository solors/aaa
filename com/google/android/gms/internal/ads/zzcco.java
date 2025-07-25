package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcco {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzarc zzarcVar;
        zzarb zzarbVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaqx(new zzccn(duplicate), zzccr.zzb).zzd().iterator();
            while (true) {
                zzarcVar = null;
                if (it.hasNext()) {
                    zzaqz zzaqzVar = (zzaqz) it.next();
                    if (zzaqzVar instanceof zzarb) {
                        zzarbVar = (zzarb) zzaqzVar;
                        break;
                    }
                } else {
                    zzarbVar = null;
                    break;
                }
            }
            Iterator it2 = zzarbVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaqz zzaqzVar2 = (zzaqz) it2.next();
                if (zzaqzVar2 instanceof zzarc) {
                    zzarcVar = (zzarc) zzaqzVar2;
                    break;
                }
            }
            long zzc = (zzarcVar.zzc() * 1000) / zzarcVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
