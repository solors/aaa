package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzhaa implements Iterator {
    final /* synthetic */ zzhad zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhaa(zzhad zzhadVar, zzhac zzhacVar) {
        this.zza = zzhadVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zzb + 1;
        zzhad zzhadVar = this.zza;
        i = zzhadVar.zzb;
        if (i2 >= i) {
            map = zzhadVar.zzc;
            if (!map.isEmpty() && zza().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzhad zzhadVar = this.zza;
        i = zzhadVar.zzb;
        if (i2 < i) {
            objArr = zzhadVar.zza;
            return (zzgzz) objArr[i2];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i2 = this.zzb;
            zzhad zzhadVar = this.zza;
            i = zzhadVar.zzb;
            if (i2 < i) {
                this.zzb = i2 - 1;
                zzhadVar.zzm(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
