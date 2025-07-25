package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgbk extends zzgbi {
    private zzgbk() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbi
    public final int zza(zzgbm zzgbmVar) {
        int i;
        int i2;
        synchronized (zzgbmVar) {
            i = zzgbmVar.remaining;
            i2 = i - 1;
            zzgbmVar.remaining = i2;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzb(zzgbm zzgbmVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgbmVar) {
            set3 = zzgbmVar.seenExceptions;
            if (set3 == null) {
                zzgbmVar.seenExceptions = set2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgbk(zzgbl zzgblVar) {
        super(null);
    }
}
