package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
final class zzkh implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzki zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkh(zzki zzkiVar, boolean z, Uri uri, String str, String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
