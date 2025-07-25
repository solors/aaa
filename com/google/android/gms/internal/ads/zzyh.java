package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzyh {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyi zzyiVar) {
        zzc(zzyiVar);
        this.zza.add(new zzyg(handler, zzyiVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyg zzygVar = (zzyg) it.next();
            z = zzygVar.zzc;
            if (!z) {
                handler = zzygVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyi zzyiVar;
                        zzyiVar = zzyg.this.zzb;
                        zzyiVar.zzY(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzyi zzyiVar) {
        zzyi zzyiVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyg zzygVar = (zzyg) it.next();
            zzyiVar2 = zzygVar.zzb;
            if (zzyiVar2 == zzyiVar) {
                zzygVar.zzc();
                this.zza.remove(zzygVar);
            }
        }
    }
}
