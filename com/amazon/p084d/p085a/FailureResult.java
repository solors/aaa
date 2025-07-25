package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.h */
/* loaded from: classes2.dex */
public interface FailureResult extends IInterface {
    /* renamed from: a */
    String mo102586a() throws RemoteException;

    /* renamed from: b */
    String mo102585b() throws RemoteException;

    /* renamed from: c */
    String mo102584c() throws RemoteException;

    /* renamed from: d */
    String mo102583d() throws RemoteException;

    /* renamed from: e */
    boolean mo102582e() throws RemoteException;

    /* renamed from: f */
    Map mo102581f() throws RemoteException;

    /* renamed from: g */
    String mo102580g() throws RemoteException;

    /* compiled from: FailureResult.java */
    /* renamed from: com.amazon.d.a.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3631a extends Binder implements FailureResult {

        /* renamed from: a */
        static final int f2989a = 1;

        /* renamed from: b */
        static final int f2990b = 2;

        /* renamed from: c */
        static final int f2991c = 3;

        /* renamed from: d */
        static final int f2992d = 4;

        /* renamed from: e */
        static final int f2993e = 5;

        /* renamed from: f */
        static final int f2994f = 6;

        /* renamed from: g */
        static final int f2995g = 7;

        /* renamed from: h */
        private static final String f2996h = "com.amazon.venezia.command.FailureResult";

        /* compiled from: FailureResult.java */
        /* renamed from: com.amazon.d.a.h$a$a */
        /* loaded from: classes2.dex */
        private static class C3632a implements FailureResult {

            /* renamed from: a */
            private IBinder f2997a;

            C3632a(IBinder iBinder) {
                this.f2997a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: a */
            public String mo102586a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2997a;
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: b */
            public String mo102585b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: c */
            public String mo102584c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: d */
            public String mo102583d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: e */
            public boolean mo102582e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    boolean z = false;
                    this.f2997a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: f */
            public Map mo102581f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.FailureResult
            /* renamed from: g */
            public String mo102580g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3631a.f2996h);
                    this.f2997a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public String m102579h() {
                return AbstractBinderC3631a.f2996h;
            }
        }

        public AbstractBinderC3631a() {
            attachInterface(this, f2996h);
        }

        /* renamed from: a */
        public static FailureResult m102587a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2996h);
            if (queryLocalInterface != null && (queryLocalInterface instanceof FailureResult)) {
                return (FailureResult) queryLocalInterface;
            }
            return new C3632a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(f2996h);
                        String mo102586a = mo102586a();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102586a);
                        return true;
                    case 2:
                        parcel.enforceInterface(f2996h);
                        String mo102585b = mo102585b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102585b);
                        return true;
                    case 3:
                        parcel.enforceInterface(f2996h);
                        String mo102584c = mo102584c();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102584c);
                        return true;
                    case 4:
                        parcel.enforceInterface(f2996h);
                        String mo102583d = mo102583d();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102583d);
                        return true;
                    case 5:
                        parcel.enforceInterface(f2996h);
                        boolean mo102582e = mo102582e();
                        parcel2.writeNoException();
                        parcel2.writeInt(mo102582e ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(f2996h);
                        Map mo102581f = mo102581f();
                        parcel2.writeNoException();
                        parcel2.writeMap(mo102581f);
                        return true;
                    case 7:
                        parcel.enforceInterface(f2996h);
                        String mo102580g = mo102580g();
                        parcel2.writeNoException();
                        parcel2.writeString(mo102580g);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(f2996h);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
