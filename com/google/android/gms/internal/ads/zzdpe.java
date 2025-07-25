package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdpe implements zzcwo {
    @Nullable
    private final zzcex zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpe(@Nullable zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onResume();
        }
    }
}
