package com.taurusx.tax.p606j.p616z;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.z.c */
/* loaded from: classes7.dex */
public final class C28563c implements IInterface {

    /* renamed from: a */
    public IBinder f74052a;

    public C28563c(IBinder iBinder) {
        this.f74052a = iBinder;
    }

    /* renamed from: a */
    public boolean m37925a(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            boolean z2 = false;
            obtain.writeInterfaceToken(C28162a.f73047a.m23824a(new byte[]{-57, -65, -55, -2, -61, -65, -53, -73, -56, -75, -118, -79, -54, -76, -42, -65, -51, -76, -118, -73, -55, -93, -118, -79, -64, -93, -118, -71, -64, -75, -54, -92, -51, -74, -51, -75, -42, -2, -51, -66, -48, -75, -42, -66, -59, -68, -118, -103, -27, -76, -46, -75, -42, -92, -51, -93, -51, -66, -61, -103, -64, -125, -63, -94, -46, -71, -57, -75}, new byte[]{-92, -48}));
            obtain.writeInt(z ? 1 : 0);
            try {
                this.f74052a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                obtain2.recycle();
                obtain.recycle();
                return z2;
            } catch (Throwable th) {
                th = th;
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f74052a;
    }

    /* renamed from: c */
    public String m37924c() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(C28162a.f73047a.m23824a(new byte[]{71, -124, 73, -59, 67, -124, 75, -116, 72, -114, 10, -118, 74, -113, 86, -124, 77, -113, 10, -116, 73, -104, 10, -118, SignedBytes.MAX_POWER_OF_TWO, -104, 10, -126, SignedBytes.MAX_POWER_OF_TWO, -114, 74, -97, 77, -115, 77, -114, 86, -59, 77, -123, 80, -114, 86, -123, 69, -121, 10, -94, 101, -113, 82, -114, 86, -97, 77, -104, 77, -123, 67, -94, SignedBytes.MAX_POWER_OF_TWO, -72, 65, -103, 82, -126, 71, -114}, new byte[]{36, -21}));
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f74052a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable th2) {
            th = th2;
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
