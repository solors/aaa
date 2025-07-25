package com.google.android.p378a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* loaded from: classes4.dex */
public class BaseProxy implements IInterface {

    /* renamed from: b */
    private final IBinder f30850b;

    /* renamed from: c */
    private final String f30851c = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseProxy(IBinder iBinder) {
        this.f30850b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30850b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Parcel m76349i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30851c);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final Parcel m76348u(Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f30850b.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
