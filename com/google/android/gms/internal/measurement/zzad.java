package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzad {
    private static final ImmutableSet<String> zza = ImmutableSet.m69328of("_syn", "_err", "_el");
    private String zzb;
    private long zzc;
    private Map<String, Object> zzd;

    public zzad(String str, long j, Map<String, Object> map) {
        this.zzb = str;
        this.zzc = j;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.zzc != zzadVar.zzc || !this.zzb.equals(zzadVar.zzb)) {
            return false;
        }
        return this.zzd.equals(zzadVar.zzd);
    }

    public final int hashCode() {
        long j = this.zzc;
        return (((this.zzb.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zzb;
        long j = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + valueOf + "}";
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Map<String, Object> zzc() {
        return this.zzd;
    }

    public final Object zza(String str) {
        if (this.zzd.containsKey(str)) {
            return this.zzd.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public static Object zza(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            return ((obj instanceof String) || obj == null) ? obj2 : obj;
        } else if (obj instanceof Double) {
            return obj2;
        } else {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            return obj instanceof String ? obj2.toString() : obj2;
        }
    }

    public final void zza(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
            return;
        }
        this.zzd.put(str, zza(str, this.zzd.get(str), obj));
    }
}
