package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcrb implements zzcrc {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrb(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrc
    @Nullable
    public final zzecw zza(int i, String str) {
        return (zzecw) this.zza.get(str);
    }
}
