package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.zzb
    /* renamed from: c */
    protected final boolean mo70139c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzb(parcel);
            zzb((Bundle) zzc.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
