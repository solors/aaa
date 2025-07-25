package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemk implements zzetr {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemk(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzgch.zzh(new zzemi(arrayList, null));
    }
}
