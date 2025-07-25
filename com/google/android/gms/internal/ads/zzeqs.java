package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeqs implements zzetq {
    public final String zza;
    public final boolean zzb;

    public zzeqs(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuv) obj).zzb.putString("gct", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
        }
    }
}
