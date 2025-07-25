package com.pubmatic.sdk.monitor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public interface IPOBMonitorService extends IInterface {
    String getMonitorData() throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IPOBMonitorService {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.pubmatic.sdk.monitor.IPOBMonitorService$Stub$a */
        /* loaded from: classes7.dex */
        public static class C26742a implements IPOBMonitorService {

            /* renamed from: a */
            public static IPOBMonitorService f70357a;

            /* renamed from: b */
            private IBinder f70358b;

            C26742a(IBinder iBinder) {
                this.f70358b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f70358b;
            }

            @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
            public String getMonitorData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.pubmatic.sdk.monitor.IPOBMonitorService");
                    if (!this.f70358b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMonitorData();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.pubmatic.sdk.monitor.IPOBMonitorService");
        }

        public static IPOBMonitorService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.pubmatic.sdk.monitor.IPOBMonitorService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPOBMonitorService)) {
                return (IPOBMonitorService) queryLocalInterface;
            }
            return new C26742a(iBinder);
        }

        public static IPOBMonitorService getDefaultImpl() {
            return C26742a.f70357a;
        }

        public static boolean setDefaultImpl(IPOBMonitorService iPOBMonitorService) {
            if (C26742a.f70357a == null) {
                if (iPOBMonitorService != null) {
                    C26742a.f70357a = iPOBMonitorService;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
        public abstract /* synthetic */ String getMonitorData() throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.pubmatic.sdk.monitor.IPOBMonitorService");
                return true;
            }
            parcel.enforceInterface("com.pubmatic.sdk.monitor.IPOBMonitorService");
            String monitorData = getMonitorData();
            parcel2.writeNoException();
            parcel2.writeString(monitorData);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
