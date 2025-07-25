package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            int size = size();
            zzv zzvVar = this.zza;
            i = zzvVar.zza;
            boolean z = false;
            if (size > i) {
                arrayDeque = zzvVar.zzf;
                arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                int size2 = size();
                i2 = this.zza.zza;
                if (size2 > i2) {
                    z = true;
                }
                return z;
            }
            return false;
        }
    }
}
