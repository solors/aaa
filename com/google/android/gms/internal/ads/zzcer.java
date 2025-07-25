package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcer implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcer(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.confirm();
    }
}
