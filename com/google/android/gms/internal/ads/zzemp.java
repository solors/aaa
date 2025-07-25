package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemp {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    @Nullable
    private zzemo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final zzemo zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzemo zzemoVar) {
        this.zzb = zzemoVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
