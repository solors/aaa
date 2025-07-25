package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C1074a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgbj extends zzgbi {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbi
    public final int zza(zzgbm zzgbmVar) {
        return this.zzb.decrementAndGet(zzgbmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzb(zzgbm zzgbmVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            if (C1074a.m105283a(atomicReferenceFieldUpdater, zzgbmVar, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzgbmVar) == null);
    }
}
