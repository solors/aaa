package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfza extends zzfxn {
    final /* synthetic */ zzfzb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfza(zzfzb zzfzbVar) {
        this.zza = zzfzbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfun.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        objArr = this.zza.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public final boolean zzf() {
        return true;
    }
}
