package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzeyp implements zzgcd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyp(zzeyr zzeyrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
