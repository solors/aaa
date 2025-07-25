package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.p084d.p085a.DecisionResult;
import com.amazon.p084d.p085a.ExceptionResult;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;

/* renamed from: com.amazon.d.a.i */
/* loaded from: classes2.dex */
public interface ResultCallback extends IInterface {
    /* renamed from: a */
    void mo102576a(DecisionResult decisionResult) throws RemoteException;

    /* renamed from: a */
    void mo102575a(ExceptionResult exceptionResult) throws RemoteException;

    /* renamed from: a */
    void mo102574a(FailureResult failureResult) throws RemoteException;

    /* renamed from: a */
    void mo102573a(SuccessResult successResult) throws RemoteException;

    /* compiled from: ResultCallback.java */
    /* renamed from: com.amazon.d.a.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3633a extends Binder implements ResultCallback {

        /* renamed from: a */
        private static final String f2998a = "com.amazon.venezia.command.ResultCallback";

        /* renamed from: b */
        static final int f2999b = 1;

        /* renamed from: c */
        static final int f3000c = 2;

        /* renamed from: d */
        static final int f3001d = 3;

        /* renamed from: e */
        static final int f3002e = 4;

        /* compiled from: ResultCallback.java */
        /* renamed from: com.amazon.d.a.i$a$a */
        /* loaded from: classes2.dex */
        private static class C3634a implements ResultCallback {

            /* renamed from: a */
            private IBinder f3003a;

            C3634a(IBinder iBinder) {
                this.f3003a = iBinder;
            }

            /* renamed from: a */
            public String m102577a() {
                return AbstractBinderC3633a.f2998a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3003a;
            }

            @Override // com.amazon.p084d.p085a.ResultCallback
            /* renamed from: a */
            public void mo102573a(SuccessResult successResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3633a.f2998a);
                    obtain.writeStrongBinder(successResult != null ? successResult.asBinder() : null);
                    this.f3003a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.ResultCallback
            /* renamed from: a */
            public void mo102574a(FailureResult failureResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3633a.f2998a);
                    obtain.writeStrongBinder(failureResult != null ? failureResult.asBinder() : null);
                    this.f3003a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.ResultCallback
            /* renamed from: a */
            public void mo102576a(DecisionResult decisionResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3633a.f2998a);
                    obtain.writeStrongBinder(decisionResult != null ? decisionResult.asBinder() : null);
                    this.f3003a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.ResultCallback
            /* renamed from: a */
            public void mo102575a(ExceptionResult exceptionResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3633a.f2998a);
                    obtain.writeStrongBinder(exceptionResult != null ? exceptionResult.asBinder() : null);
                    this.f3003a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3633a() {
            attachInterface(this, f2998a);
        }

        /* renamed from: a */
        public static ResultCallback m102578a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2998a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ResultCallback)) {
                return (ResultCallback) queryLocalInterface;
            }
            return new C3634a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 1598968902) {
                                return super.onTransact(i, parcel, parcel2, i2);
                            }
                            parcel2.writeString(f2998a);
                            return true;
                        }
                        parcel.enforceInterface(f2998a);
                        mo102575a(ExceptionResult.AbstractBinderC3629a.m102591a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface(f2998a);
                    mo102576a(DecisionResult.AbstractBinderC3627a.m102602a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(f2998a);
                mo102574a(FailureResult.AbstractBinderC3631a.m102587a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(f2998a);
            mo102573a(SuccessResult.AbstractBinderC3635a.m102572a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
