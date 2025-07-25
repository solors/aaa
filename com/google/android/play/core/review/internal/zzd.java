package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.google.android.play.core.review.internal.zzf
    public final void zzc(String str, Bundle bundle, zzh zzhVar) throws RemoteException {
        Parcel m70141i = m70141i();
        m70141i.writeString(str);
        zzc.zzc(m70141i, bundle);
        zzc.zzd(m70141i, zzhVar);
        m70140u(2, m70141i);
    }
}
