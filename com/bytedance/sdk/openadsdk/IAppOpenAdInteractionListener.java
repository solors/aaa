package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IAppOpenAdInteractionListener extends IInterface {
    void onAdClicked() throws RemoteException;

    void onAdShow() throws RemoteException;

    void onAdSkip() throws RemoteException;

    void onAdTimeOver() throws RemoteException;

    void onDestroy() throws RemoteException;

    /* loaded from: classes3.dex */
    public static class Default implements IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdClicked() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdShow() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdSkip() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdTimeOver() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onDestroy() throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAppOpenAdInteractionListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener$Stub$bg */
        /* loaded from: classes3.dex */
        public static class C7868bg implements IAppOpenAdInteractionListener {

            /* renamed from: bg */
            public static IAppOpenAdInteractionListener f17183bg;

            /* renamed from: IL */
            private IBinder f17184IL;

            C7868bg(IBinder iBinder) {
                this.f17184IL = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17184IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdClicked() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f17184IL.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdClicked();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdShow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f17184IL.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdShow();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdSkip() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f17184IL.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdSkip();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdTimeOver() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f17184IL.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdTimeOver();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onDestroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f17184IL.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDestroy();
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
            attachInterface(this, "com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
        }

        public static IAppOpenAdInteractionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppOpenAdInteractionListener)) {
                return (IAppOpenAdInteractionListener) queryLocalInterface;
            }
            return new C7868bg(iBinder);
        }

        public static IAppOpenAdInteractionListener getDefaultImpl() {
            return C7868bg.f17183bg;
        }

        public static boolean setDefaultImpl(IAppOpenAdInteractionListener iAppOpenAdInteractionListener) {
            if (C7868bg.f17183bg == null && iAppOpenAdInteractionListener != null) {
                C7868bg.f17183bg = iAppOpenAdInteractionListener;
                return true;
            }
            return false;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 1598968902) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                parcel2.writeString("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                            onAdTimeOver();
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                        onAdSkip();
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    onAdClicked();
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            onDestroy();
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
