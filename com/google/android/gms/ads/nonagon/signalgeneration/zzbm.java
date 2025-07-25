package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdee;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbm implements zzdee {
    private final zzb zza;
    private final int zzb;
    @Nullable
    private final String zzc;

    @VisibleForTesting
    public zzbm(zzb zzbVar, int i, @Nullable String str) {
        this.zza = zzbVar;
        this.zzb = i;
        this.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbk zzbkVar) {
        this.zza.zzd(this.zzc, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable final zzbk zzbkVar) {
        if (zzbkVar != null && this.zzb == 2 && !TextUtils.isEmpty(this.zzc)) {
            com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
                {
                    zzbm.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbm.this.zza(zzbkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
    }
}
