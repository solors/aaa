package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfyn extends zzfyr {
    final /* synthetic */ Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyn(Comparator comparator) {
        this.zza = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyr
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
