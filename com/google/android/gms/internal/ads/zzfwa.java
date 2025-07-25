package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfwa extends zzfvt implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfwg zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwa(zzfwg zzfwgVar, SortedMap sortedMap) {
        super(zzfwgVar, sortedMap);
        this.zze = zzfwgVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfwa(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfwa(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfwa(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) ((zzfvt) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfwb(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfvt, com.google.android.gms.internal.ads.zzfyj, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}
