package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbaz extends zzcab {
    final /* synthetic */ zzbbf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaz(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcab, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbbf.zze(this.zza);
        return super.cancel(z);
    }
}
