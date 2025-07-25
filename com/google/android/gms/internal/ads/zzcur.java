package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcur implements zzcxh, zzcwo {
    private final zzfbo zza;

    public zzcur(Context context, zzfbo zzfboVar, zzbtj zzbtjVar) {
        this.zza = zzfboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzbtk zzbtkVar = this.zza.zzad;
        if (zzbtkVar != null && zzbtkVar.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zza.zzad.zzb.isEmpty()) {
                arrayList.add(this.zza.zzad.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context) {
    }
}
