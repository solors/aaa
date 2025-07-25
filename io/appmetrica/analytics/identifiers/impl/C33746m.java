package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.identifiers.impl.m */
/* loaded from: classes9.dex */
public final class C33746m implements InterfaceC33748o {

    /* renamed from: a */
    public final IBinder f92534a;

    public C33746m(IBinder iBinder) {
        this.f92534a = iBinder;
    }

    /* renamed from: a */
    public final String m22793a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f92534a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f92534a;
    }

    /* renamed from: b */
    public final boolean m22792b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean z = false;
            this.f92534a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
