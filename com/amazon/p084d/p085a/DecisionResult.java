package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.p084d.p085a.Choice;
import com.amazon.p084d.p085a.DecisionExpirationContext;
import java.util.Map;

/* renamed from: com.amazon.d.a.f */
/* loaded from: classes2.dex */
public interface DecisionResult extends IInterface {
    /* renamed from: a */
    String mo102601a() throws RemoteException;

    /* renamed from: a */
    void mo102600a(DecisionExpirationContext decisionExpirationContext) throws RemoteException;

    /* renamed from: b */
    String mo102599b() throws RemoteException;

    /* renamed from: c */
    String mo102598c() throws RemoteException;

    /* renamed from: d */
    long mo102597d() throws RemoteException;

    /* renamed from: e */
    Choice mo102596e() throws RemoteException;

    /* renamed from: f */
    Choice mo102595f() throws RemoteException;

    /* renamed from: g */
    Choice mo102594g() throws RemoteException;

    /* renamed from: h */
    Map mo102593h() throws RemoteException;

    /* compiled from: DecisionResult.java */
    /* renamed from: com.amazon.d.a.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3627a extends Binder implements DecisionResult {

        /* renamed from: a */
        static final int f2974a = 1;

        /* renamed from: b */
        static final int f2975b = 2;

        /* renamed from: c */
        static final int f2976c = 3;

        /* renamed from: d */
        static final int f2977d = 4;

        /* renamed from: e */
        static final int f2978e = 5;

        /* renamed from: f */
        static final int f2979f = 6;

        /* renamed from: g */
        static final int f2980g = 7;

        /* renamed from: h */
        static final int f2981h = 8;

        /* renamed from: i */
        static final int f2982i = 9;

        /* renamed from: j */
        private static final String f2983j = "com.amazon.venezia.command.DecisionResult";

        public AbstractBinderC3627a() {
            attachInterface(this, f2983j);
        }

        /* renamed from: a */
        public static DecisionResult m102602a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2983j);
            if (queryLocalInterface != null && (queryLocalInterface instanceof DecisionResult)) {
                return (DecisionResult) queryLocalInterface;
            }
            return new C3628a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(f2983j);
                        String mo102601a = mo102601a();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102601a);
                        return true;
                    case 2:
                        parcel.enforceInterface(f2983j);
                        String mo102599b = mo102599b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102599b);
                        return true;
                    case 3:
                        parcel.enforceInterface(f2983j);
                        String mo102598c = mo102598c();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102598c);
                        return true;
                    case 4:
                        parcel.enforceInterface(f2983j);
                        long mo102597d = mo102597d();
                        parcel2.writeNoException();
                        parcel2.writeLong(mo102597d);
                        return true;
                    case 5:
                        parcel.enforceInterface(f2983j);
                        mo102600a(DecisionExpirationContext.AbstractBinderC3625a.m102606a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(f2983j);
                        Choice mo102596e = mo102596e();
                        parcel2.writeNoException();
                        if (mo102596e != null) {
                            iBinder = mo102596e.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface(f2983j);
                        Choice mo102595f = mo102595f();
                        parcel2.writeNoException();
                        if (mo102595f != null) {
                            iBinder = mo102595f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(f2983j);
                        Choice mo102594g = mo102594g();
                        parcel2.writeNoException();
                        if (mo102594g != null) {
                            iBinder = mo102594g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface(f2983j);
                        Map mo102593h = mo102593h();
                        parcel2.writeNoException();
                        parcel2.writeMap(mo102593h);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(f2983j);
            return true;
        }

        /* compiled from: DecisionResult.java */
        /* renamed from: com.amazon.d.a.f$a$a */
        /* loaded from: classes2.dex */
        private static class C3628a implements DecisionResult {

            /* renamed from: a */
            private IBinder f2984a;

            C3628a(IBinder iBinder) {
                this.f2984a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: a */
            public String mo102601a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2984a;
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: b */
            public String mo102599b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: c */
            public String mo102598c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: d */
            public long mo102597d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: e */
            public Choice mo102596e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return Choice.AbstractBinderC3617a.m102624a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: f */
            public Choice mo102595f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return Choice.AbstractBinderC3617a.m102624a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: g */
            public Choice mo102594g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return Choice.AbstractBinderC3617a.m102624a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: h */
            public Map mo102593h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    this.f2984a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public String m102592i() {
                return AbstractBinderC3627a.f2983j;
            }

            @Override // com.amazon.p084d.p085a.DecisionResult
            /* renamed from: a */
            public void mo102600a(DecisionExpirationContext decisionExpirationContext) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3627a.f2983j);
                    obtain.writeStrongBinder(decisionExpirationContext != null ? decisionExpirationContext.asBinder() : null);
                    this.f2984a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
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
