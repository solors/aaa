package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfxp {
    Object[] zza;
    int zzb;
    zzfxo zzc;

    public zzfxp() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfxh.zze(length, i2));
        }
    }

    public final zzfxp zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfwk.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzfxp zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfxq zzc() {
        zzfxo zzfxoVar = this.zzc;
        if (zzfxoVar == null) {
            zzfze zzj = zzfze.zzj(this.zzb, this.zza, this);
            zzfxo zzfxoVar2 = this.zzc;
            if (zzfxoVar2 == null) {
                return zzj;
            }
            throw zzfxoVar2.zza();
        }
        throw zzfxoVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxp(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
