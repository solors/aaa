package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzol extends BroadcastReceiver {
    final /* synthetic */ zzon zza;

    public /* synthetic */ zzol(zzon zzonVar, zzom zzomVar) {
        this.zza = zzonVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zze zzeVar;
        zzoo zzooVar;
        if (!isInitialStickyBroadcast()) {
            zzon zzonVar = this.zza;
            zzeVar = zzonVar.zzh;
            zzooVar = zzonVar.zzg;
            zzonVar.zzj(zzoi.zzd(context, intent, zzeVar, zzooVar));
        }
    }
}
