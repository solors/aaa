package com.amazon.p084d.p088c.p089a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.amazon.d.c.a.a */
/* loaded from: classes2.dex */
public interface IApplicationVerificationService extends IInterface {
    /* renamed from: a */
    String mo102567a() throws RemoteException;

    /* renamed from: a */
    String mo102566a(String str) throws RemoteException;

    /* renamed from: a */
    void mo102565a(String str, boolean z, String str2) throws RemoteException;

    /* renamed from: b */
    String mo102564b() throws RemoteException;

    /* compiled from: IApplicationVerificationService.java */
    /* renamed from: com.amazon.d.c.a.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3638a extends Binder implements IApplicationVerificationService {

        /* renamed from: a */
        static final int f3015a = 1;

        /* renamed from: b */
        static final int f3016b = 2;

        /* renamed from: c */
        static final int f3017c = 3;

        /* renamed from: d */
        static final int f3018d = 4;

        /* renamed from: e */
        private static final String f3019e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        public AbstractBinderC3638a() {
            attachInterface(this, f3019e);
        }

        /* renamed from: a */
        public static IApplicationVerificationService m102568a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f3019e);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IApplicationVerificationService)) {
                return (IApplicationVerificationService) queryLocalInterface;
            }
            return new C3639a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 1598968902) {
                                return super.onTransact(i, parcel, parcel2, i2);
                            }
                            parcel2.writeString(f3019e);
                            return true;
                        }
                        parcel.enforceInterface(f3019e);
                        String mo102564b = mo102564b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102564b);
                        return true;
                    }
                    parcel.enforceInterface(f3019e);
                    String mo102567a = mo102567a();
                    parcel2.writeNoException();
                    parcel2.writeString(mo102567a);
                    return true;
                }
                parcel.enforceInterface(f3019e);
                String mo102566a = mo102566a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(mo102566a);
                return true;
            }
            parcel.enforceInterface(f3019e);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            mo102565a(readString, z, parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* compiled from: IApplicationVerificationService.java */
        /* renamed from: com.amazon.d.c.a.a$a$a */
        /* loaded from: classes2.dex */
        private static class C3639a implements IApplicationVerificationService {

            /* renamed from: a */
            private IBinder f3020a;

            C3639a(IBinder iBinder) {
                this.f3020a = iBinder;
            }

            @Override // com.amazon.p084d.p088c.p089a.IApplicationVerificationService
            /* renamed from: a */
            public void mo102565a(String str, boolean z, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3638a.f3019e);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str2);
                    this.f3020a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3020a;
            }

            @Override // com.amazon.p084d.p088c.p089a.IApplicationVerificationService
            /* renamed from: b */
            public String mo102564b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3638a.f3019e);
                    this.f3020a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String m102563c() {
                return AbstractBinderC3638a.f3019e;
            }

            @Override // com.amazon.p084d.p088c.p089a.IApplicationVerificationService
            /* renamed from: a */
            public String mo102566a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3638a.f3019e);
                    obtain.writeString(str);
                    this.f3020a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p088c.p089a.IApplicationVerificationService
            /* renamed from: a */
            public String mo102567a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3638a.f3019e);
                    this.f3020a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
