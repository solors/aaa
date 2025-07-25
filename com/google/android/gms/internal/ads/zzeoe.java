package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeoe implements zzetr {
    @Nullable
    private final zzeym zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeoe(@Nullable zzeym zzeymVar) {
        this.zza = zzeymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        zzeym zzeymVar = this.zza;
        if (zzeymVar == null) {
            return zzgch.zzh(new zzeod(null));
        }
        String zza = zzeymVar.zza();
        if (Strings.isEmptyOrWhitespace(zza)) {
            return zzgch.zzh(new zzeod(null));
        }
        return zzgch.zzh(new zzeod(zza));
    }
}
