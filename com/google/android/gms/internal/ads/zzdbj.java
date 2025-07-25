package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzdbj {
    protected final Map zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdbj(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzddk zzddkVar) {
        zzo(zzddkVar.zza, zzddkVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzddk) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzq(final zzdbi zzdbiVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbh
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdbi.this.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
