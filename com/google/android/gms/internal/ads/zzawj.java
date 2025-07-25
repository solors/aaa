package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzawj extends BroadcastReceiver {
    final /* synthetic */ zzawk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawj(zzawk zzawkVar) {
        this.zza = zzawkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
