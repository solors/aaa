package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbsb implements View.OnClickListener {
    final /* synthetic */ zzbsc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsb(zzbsc zzbscVar) {
        this.zza = zzbscVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
