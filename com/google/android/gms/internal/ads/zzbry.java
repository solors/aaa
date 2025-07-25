package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbry implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbry(zzbrz zzbrzVar) {
        this.zza = zzbrzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
