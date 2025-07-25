package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzp extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzs zzsVar, zzr zzrVar) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.gms.ads.internal.util.client.zzl.zzi();
        zzd.zza(context);
    }
}
