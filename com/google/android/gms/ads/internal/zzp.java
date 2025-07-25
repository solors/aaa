package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzava;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzp implements View.OnTouchListener {
    final /* synthetic */ zzu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzava zzavaVar;
        zzava zzavaVar2;
        zzu zzuVar = this.zza;
        zzavaVar = zzuVar.zzh;
        if (zzavaVar != null) {
            zzavaVar2 = zzuVar.zzh;
            zzavaVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
