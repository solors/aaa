package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: io.appmetrica.analytics.identifiers.impl.n */
/* loaded from: classes9.dex */
public abstract class AbstractBinderC33747n extends Binder implements InterfaceC33748o {
    public AbstractBinderC33747n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    /* renamed from: a */
    public static InterfaceC33748o m22790a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC33748o)) {
            return (InterfaceC33748o) queryLocalInterface;
        }
        return new C33746m(iBinder);
    }

    /* renamed from: a */
    public abstract /* synthetic */ String m22791a() throws RemoteException;

    /* renamed from: b */
    public abstract /* synthetic */ boolean m22789b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return true;
            }
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean m22789b = m22789b();
            parcel2.writeNoException();
            parcel2.writeInt(m22789b ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        String m22791a = m22791a();
        parcel2.writeNoException();
        parcel2.writeString(m22791a);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
