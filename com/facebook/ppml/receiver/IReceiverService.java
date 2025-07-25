package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IReceiverService extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements IReceiverService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.facebook.ppml.receiver.IReceiverService
        public int sendEvents(Bundle bundle) throws RemoteException {
            return 0;
        }
    }

    int sendEvents(Bundle bundle) throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IReceiverService {
        private static final String DESCRIPTOR = "com.facebook.ppml.receiver.IReceiverService";
        static final int TRANSACTION_sendEvents = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.ppml.receiver.IReceiverService$Stub$a */
        /* loaded from: classes4.dex */
        public static class C13533a implements IReceiverService {

            /* renamed from: c */
            public static IReceiverService f24857c;

            /* renamed from: b */
            private IBinder f24858b;

            C13533a(IBinder iBinder) {
                this.f24858b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24858b;
            }

            @Override // com.facebook.ppml.receiver.IReceiverService
            public int sendEvents(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f24858b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendEvents(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IReceiverService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IReceiverService)) {
                return (IReceiverService) queryLocalInterface;
            }
            return new C13533a(iBinder);
        }

        public static IReceiverService getDefaultImpl() {
            return C13533a.f24857c;
        }

        public static boolean setDefaultImpl(IReceiverService iReceiverService) {
            if (C13533a.f24857c == null) {
                if (iReceiverService != null) {
                    C13533a.f24857c = iReceiverService;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            int sendEvents = sendEvents(bundle);
            parcel2.writeNoException();
            parcel2.writeInt(sendEvents);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
