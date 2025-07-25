package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbtx extends zzbts {
    final /* synthetic */ UpdateClickUrlCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtx(zzbub zzbubVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
