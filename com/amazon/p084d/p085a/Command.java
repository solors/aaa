package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.c */
/* loaded from: classes2.dex */
public interface Command extends IInterface {
    /* renamed from: a */
    String mo102614a() throws RemoteException;

    /* renamed from: b */
    String mo102613b() throws RemoteException;

    /* renamed from: c */
    Map mo102612c() throws RemoteException;

    /* renamed from: d */
    String mo102611d() throws RemoteException;

    /* compiled from: Command.java */
    /* renamed from: com.amazon.d.a.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3621a extends Binder implements Command {

        /* renamed from: a */
        private static final String f2961a = "com.amazon.venezia.command.Command";

        /* renamed from: b */
        static final int f2962b = 1;

        /* renamed from: c */
        static final int f2963c = 2;

        /* renamed from: d */
        static final int f2964d = 3;

        /* renamed from: e */
        static final int f2965e = 4;

        /* compiled from: Command.java */
        /* renamed from: com.amazon.d.a.c$a$a */
        /* loaded from: classes2.dex */
        private static class C3622a implements Command {

            /* renamed from: a */
            private IBinder f2966a;

            C3622a(IBinder iBinder) {
                this.f2966a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: a */
            public String mo102614a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3621a.f2961a);
                    this.f2966a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2966a;
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: b */
            public String mo102613b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3621a.f2961a);
                    this.f2966a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: c */
            public Map mo102612c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3621a.f2961a);
                    this.f2966a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: d */
            public String mo102611d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3621a.f2961a);
                    this.f2966a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public String m102610e() {
                return AbstractBinderC3621a.f2961a;
            }
        }

        public AbstractBinderC3621a() {
            attachInterface(this, f2961a);
        }

        /* renamed from: a */
        public static Command m102615a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2961a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof Command)) {
                return (Command) queryLocalInterface;
            }
            return new C3622a(iBinder);
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
                            parcel2.writeString(f2961a);
                            return true;
                        }
                        parcel.enforceInterface(f2961a);
                        Map mo102612c = mo102612c();
                        parcel2.writeNoException();
                        parcel2.writeMap(mo102612c);
                        return true;
                    }
                    parcel.enforceInterface(f2961a);
                    String mo102611d = mo102611d();
                    parcel2.writeNoException();
                    parcel2.writeString(mo102611d);
                    return true;
                }
                parcel.enforceInterface(f2961a);
                String mo102614a = mo102614a();
                parcel2.writeNoException();
                parcel2.writeString(mo102614a);
                return true;
            }
            parcel.enforceInterface(f2961a);
            String mo102613b = mo102613b();
            parcel2.writeNoException();
            parcel2.writeString(mo102613b);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
