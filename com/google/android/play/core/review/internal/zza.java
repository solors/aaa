package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public class zza implements IInterface {

    /* renamed from: b */
    private final IBinder f39229b;

    /* renamed from: c */
    private final String f39230c = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    /* JADX INFO: Access modifiers changed from: protected */
    public zza(IBinder iBinder, String str) {
        this.f39229b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39229b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m70141i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39230c);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m70140u(int i, Parcel parcel) throws RemoteException {
        try {
            this.f39229b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
