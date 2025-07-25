package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcma implements zzcwo {
    private final zzfdh zza;

    public zzcma(zzfdh zzfdhVar) {
        this.zza = zzfdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context) {
        try {
            this.zza.zzt();
        } catch (zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
