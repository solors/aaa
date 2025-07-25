package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfkp {
    public static zzfkp zza(zzfkq zzfkqVar, zzfkr zzfkrVar) {
        zzfmk.zza();
        return new zzfkt(zzfkqVar, zzfkrVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfkw zzfkwVar, @Nullable String str);

    public abstract void zzc();

    public abstract void zzd(@Nullable View view);

    public abstract void zze();
}
