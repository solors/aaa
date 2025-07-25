package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IBinderPool extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) throws RemoteException {
            return null;
        }
    }

    IBinder queryBinder(int i) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBinderPool {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bytedance.sdk.openadsdk.IBinderPool$Stub$bg */
        /* loaded from: classes3.dex */
        public static class C7869bg implements IBinderPool {

            /* renamed from: bg */
            public static IBinderPool f17185bg;

            /* renamed from: IL */
            private IBinder f17186IL;

            C7869bg(IBinder iBinder) {
                this.f17186IL = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17186IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IBinderPool
            public IBinder queryBinder(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    obtain.writeInt(i);
                    if (!this.f17186IL.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(i);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBinderPool)) {
                return (IBinderPool) queryLocalInterface;
            }
            return new C7869bg(iBinder);
        }

        public static IBinderPool getDefaultImpl() {
            return C7869bg.f17185bg;
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool) {
            if (C7869bg.f17185bg == null && iBinderPool != null) {
                C7869bg.f17185bg = iBinderPool;
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
                parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            IBinder queryBinder = queryBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(queryBinder);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
