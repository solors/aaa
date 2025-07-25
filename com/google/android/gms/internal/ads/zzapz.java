package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzapz implements zzapl {
    private final Map zza = new HashMap();
    @Nullable
    private final zzaoy zzb;
    @Nullable
    private final BlockingQueue zzc;
    private final zzapd zzd;

    public zzapz(@NonNull zzaoy zzaoyVar, @NonNull BlockingQueue blockingQueue, zzapd zzapdVar) {
        this.zzd = zzapdVar;
        this.zzb = zzaoyVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zza(zzapm zzapmVar) {
        Map map = this.zza;
        String zzj = zzapmVar.zzj();
        List list = (List) map.remove(zzj);
        if (list != null && !list.isEmpty()) {
            if (zzapy.zzb) {
                zzapy.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzapm zzapmVar2 = (zzapm) list.remove(0);
            this.zza.put(zzj, list);
            zzapmVar2.zzu(this);
            try {
                this.zzc.put(zzapmVar2);
            } catch (InterruptedException e) {
                zzapy.zzb("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zzb(zzapm zzapmVar, zzaps zzapsVar) {
        List<zzapm> list;
        zzaov zzaovVar = zzapsVar.zzb;
        if (zzaovVar != null && !zzaovVar.zza(System.currentTimeMillis())) {
            String zzj = zzapmVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzapy.zzb) {
                    zzapy.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                for (zzapm zzapmVar2 : list) {
                    this.zzd.zzb(zzapmVar2, zzapsVar, null);
                }
                return;
            }
            return;
        }
        zza(zzapmVar);
    }

    public final synchronized boolean zzc(zzapm zzapmVar) {
        Map map = this.zza;
        String zzj = zzapmVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzapmVar.zzm("waiting-for-response");
            list.add(zzapmVar);
            this.zza.put(zzj, list);
            if (zzapy.zzb) {
                zzapy.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzapmVar.zzu(this);
        if (zzapy.zzb) {
            zzapy.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
