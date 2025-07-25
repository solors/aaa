package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdjh {
    private final zzdrw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjh(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public final void zza(@Nullable View view, zzfbo zzfboVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() && view != null) {
            if (true != com.google.android.gms.ads.internal.util.zzac.zza(view)) {
                str = "0";
            } else {
                str = "1";
            }
            zzdrv zza = this.zza.zza();
            zza.zzb("action", "hcp");
            zza.zzb("hcp", str);
            zza.zzc(zzfboVar);
            zza.zzg();
        }
    }
}
