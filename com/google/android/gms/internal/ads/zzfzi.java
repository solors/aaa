package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfzi extends zzfvo {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzi(zzfzj zzfzjVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzc;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
