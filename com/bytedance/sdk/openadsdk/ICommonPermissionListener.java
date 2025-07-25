package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface ICommonPermissionListener extends IInterface {
    void onDenied(String str) throws RemoteException;

    void onGranted() throws RemoteException;

    /* loaded from: classes3.dex */
    public static class Default implements ICommonPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onGranted() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onDenied(String str) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements ICommonPermissionListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.sdk.openadsdk.ICommonPermissionListener$Stub$bg */
        /* loaded from: classes3.dex */
        public static class C7871bg implements ICommonPermissionListener {

            /* renamed from: bg */
            public static ICommonPermissionListener f17189bg;

            /* renamed from: IL */
            private IBinder f17190IL;

            C7871bg(IBinder iBinder) {
                this.f17190IL = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17190IL;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onDenied(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    obtain.writeString(str);
                    if (!this.f17190IL.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDenied(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onGranted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if (!this.f17190IL.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onGranted();
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
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        public static ICommonPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICommonPermissionListener)) {
                return (ICommonPermissionListener) queryLocalInterface;
            }
            return new C7871bg(iBinder);
        }

        public static ICommonPermissionListener getDefaultImpl() {
            return C7871bg.f17189bg;
        }

        public static boolean setDefaultImpl(ICommonPermissionListener iCommonPermissionListener) {
            if (C7871bg.f17189bg == null && iCommonPermissionListener != null) {
                C7871bg.f17189bg = iCommonPermissionListener;
                return true;
            }
            return false;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onDenied(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            onGranted();
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
