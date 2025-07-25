package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfh {
    public final zzfxn zza;
    public final zzfa zzb;
    @Nullable
    public final zzfc zzc;
    @Nullable
    public final zzfg zzd;

    public zzfh(zzey zzeyVar, @Nullable List list, zzfa zzfaVar, @Nullable zzfc zzfcVar, @Nullable zzfg zzfgVar) {
        zzfxn zzn;
        if (list != null) {
            zzn = zzfxn.zzl(list);
        } else {
            zzn = zzfxn.zzn();
        }
        this.zza = zzn;
        this.zzb = zzfaVar;
        this.zzc = zzfcVar;
        this.zzd = zzfgVar;
    }
}
