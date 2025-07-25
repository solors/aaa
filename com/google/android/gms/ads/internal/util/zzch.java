package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzch extends BroadcastReceiver {
    final /* synthetic */ zzci zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
