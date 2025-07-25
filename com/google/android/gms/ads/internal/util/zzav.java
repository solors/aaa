package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzav extends zzdk {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzay zzayVar, Context context) {
        this.zza = context;
        this.zzb = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(@Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzi(this.zza, zzeVar.zzb, true, true);
    }
}
