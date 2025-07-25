package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbse implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbse(zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}
