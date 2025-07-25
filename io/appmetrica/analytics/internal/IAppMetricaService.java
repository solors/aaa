package io.appmetrica.analytics.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public interface IAppMetricaService extends IInterface {
    public static final String DESCRIPTOR = "io.appmetrica.analytics.internal.IAppMetricaService";

    /* loaded from: classes9.dex */
    public static class _Parcel {
    }

    void pauseUserSession(Bundle bundle) throws RemoteException;

    void reportData(int i, Bundle bundle) throws RemoteException;

    void resumeUserSession(Bundle bundle) throws RemoteException;

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IAppMetricaService {
        public Stub() {
            attachInterface(this, IAppMetricaService.DESCRIPTOR);
        }

        public static IAppMetricaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppMetricaService.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppMetricaService)) {
                return (IAppMetricaService) queryLocalInterface;
            }
            return new C35079c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAppMetricaService.DESCRIPTOR);
            }
            if (i != 1598968902) {
                Object obj = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        int readInt = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = creator.createFromParcel(parcel);
                        }
                        reportData(readInt, (Bundle) obj);
                    } else {
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = creator2.createFromParcel(parcel);
                        }
                        pauseUserSession((Bundle) obj);
                    }
                } else {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator3.createFromParcel(parcel);
                    }
                    resumeUserSession((Bundle) obj);
                }
                return true;
            }
            parcel2.writeString(IAppMetricaService.DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* loaded from: classes9.dex */
    public static class Default implements IAppMetricaService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void pauseUserSession(Bundle bundle) throws RemoteException {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void resumeUserSession(Bundle bundle) throws RemoteException {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void reportData(int i, Bundle bundle) throws RemoteException {
        }
    }
}
