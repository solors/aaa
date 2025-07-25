package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IDislikeClosedListener extends IInterface {
    void onItemClickClosed() throws RemoteException;

    /* loaded from: classes3.dex */
    public static class Default implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IDislikeClosedListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.sdk.openadsdk.IDislikeClosedListener$Stub$bg */
        /* loaded from: classes3.dex */
        public static class C7872bg implements IDislikeClosedListener {

            /* renamed from: bg */
            public static IDislikeClosedListener f17191bg;

            /* renamed from: IL */
            private IBinder f17192IL;

            C7872bg(IBinder iBinder) {
                this.f17192IL = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17192IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (!this.f17192IL.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onItemClickClosed();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDislikeClosedListener)) {
                return (IDislikeClosedListener) queryLocalInterface;
            }
            return new C7872bg(iBinder);
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return C7872bg.f17191bg;
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (C7872bg.f17191bg == null && iDislikeClosedListener != null) {
                C7872bg.f17191bg = iDislikeClosedListener;
                return true;
            }
            return false;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
