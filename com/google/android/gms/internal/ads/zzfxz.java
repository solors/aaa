package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfxz extends zzfzs {
    final /* synthetic */ zzfya zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxz(zzfya zzfyaVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzfyaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
