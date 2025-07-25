package com.google.android.gms.internal.ads;

import com.ironsource.C20096if;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbf(zzcbg zzcbgVar, boolean z) {
        this.zza = z;
        this.zzb = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", C20096if.f50580k, String.valueOf(this.zza));
    }
}
