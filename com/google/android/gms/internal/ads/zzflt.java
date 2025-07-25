package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflt extends BroadcastReceiver {
    final /* synthetic */ zzflu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflt(zzflu zzfluVar) {
        this.zza = zzfluVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzflu zzfluVar = this.zza;
            z2 = zzfluVar.zzd;
            zzfluVar.zzd(true, z2);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzflu zzfluVar2 = this.zza;
            z = zzfluVar2.zzd;
            zzfluVar2.zzd(false, z);
            this.zza.zzc = false;
        }
    }
}
