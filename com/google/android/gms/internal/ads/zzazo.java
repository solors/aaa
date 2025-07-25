package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazo {
    private final int zza;
    private final zzazl zzb = new zzazq();

    public zzazo(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb2.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzazn zzaznVar = new zzazn();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazm(this));
        for (String str : split) {
            String[] zzb = zzazp.zzb(str, false);
            if (zzb.length != 0) {
                zzazt.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaznVar.zzb.write(this.zzb.zzb(((zzazs) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaznVar.toString();
    }
}
