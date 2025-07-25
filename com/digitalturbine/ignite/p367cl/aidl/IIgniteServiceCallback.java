package com.digitalturbine.ignite.p367cl.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback */
/* loaded from: classes3.dex */
public interface IIgniteServiceCallback extends IInterface {
    void onError(String str) throws RemoteException;

    void onProgress(String str) throws RemoteException;

    void onScheduled(String str) throws RemoteException;

    void onStart(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* renamed from: com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IIgniteServiceCallback {
        public Stub() {
            attachInterface(this, "com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                onError(parcel.readString());
                                parcel2.writeNoException();
                            } else {
                                onSuccess(parcel.readString());
                                parcel2.writeNoException();
                            }
                        } else {
                            onProgress(parcel.readString());
                            parcel2.writeNoException();
                        }
                    } else {
                        onStart(parcel.readString());
                        parcel2.writeNoException();
                    }
                } else {
                    onScheduled(parcel.readString());
                    parcel2.writeNoException();
                }
                return true;
            }
            parcel2.writeString("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
