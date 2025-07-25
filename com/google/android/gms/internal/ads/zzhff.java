package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzhff implements zzher {
    private final List zza;
    private final List zzb;

    static {
        zzhes.zza(Collections.emptySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhff(List list, List list2, zzhfd zzhfdVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhfe zza(int i, int i2) {
        return new zzhfe(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zza.size();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int size2 = this.zzb.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhfa) this.zzb.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza = zzheo.zza(size);
        int size3 = this.zza.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zzhfa) this.zza.get(i2)).zzb();
            zzb.getClass();
            zza.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                zza.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza);
    }
}
