package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzapx {
    public static final boolean zza = zzapy.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzapy.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j) {
        if (!this.zzc) {
            this.zzb.add(new zzapw(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        List list;
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = ((zzapw) this.zzb.get(list.size() - 1)).zzc - ((zzapw) this.zzb.get(0)).zzc;
        }
        if (j > 0) {
            long j2 = ((zzapw) this.zzb.get(0)).zzc;
            zzapy.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzapw zzapwVar : this.zzb) {
                long j3 = zzapwVar.zzc;
                zzapy.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzapwVar.zzb), zzapwVar.zza);
                j2 = j3;
            }
        }
    }
}
