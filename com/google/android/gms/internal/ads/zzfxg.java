package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfxg extends zzfxh {
    Object[] zza;
    int zzb;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxg(int i) {
        zzfwk.zza(i, "initialCapacity");
        this.zza = new Object[i];
        this.zzb = 0;
    }

    private final void zzf(int i) {
        int length = this.zza.length;
        int zze = zzfxh.zze(length, this.zzb + i);
        if (zze <= length && !this.zzc) {
            return;
        }
        this.zza = Arrays.copyOf(this.zza, zze);
        this.zzc = false;
    }

    public final zzfxg zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public /* bridge */ /* synthetic */ zzfxh zzb(Object obj) {
        throw null;
    }

    public final zzfxh zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzfxi) {
                this.zzb = ((zzfxi) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(Object[] objArr, int i) {
        zzfyx.zzb(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
