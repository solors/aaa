package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.e */
/* loaded from: classes2.dex */
public interface DecisionExpirationContext extends IInterface {
    /* renamed from: a */
    String mo102605a() throws RemoteException;

    /* renamed from: b */
    Map mo102604b() throws RemoteException;

    /* compiled from: DecisionExpirationContext.java */
    /* renamed from: com.amazon.d.a.e$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3625a extends Binder implements DecisionExpirationContext {

        /* renamed from: a */
        private static final String f2970a = "com.amazon.venezia.command.DecisionExpirationContext";

        /* renamed from: c */
        static final int f2971c = 1;

        /* renamed from: d */
        static final int f2972d = 2;

        /* compiled from: DecisionExpirationContext.java */
        /* renamed from: com.amazon.d.a.e$a$a */
        /* loaded from: classes2.dex */
        private static class C3626a implements DecisionExpirationContext {

            /* renamed from: a */
            private IBinder f2973a;

            C3626a(IBinder iBinder) {
                this.f2973a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.DecisionExpirationContext
            /* renamed from: a */
            public String mo102605a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3625a.f2970a);
                    this.f2973a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2973a;
            }

            @Override // com.amazon.p084d.p085a.DecisionExpirationContext
            /* renamed from: b */
            public Map mo102604b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3625a.f2970a);
                    this.f2973a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String m102603c() {
                return AbstractBinderC3625a.f2970a;
            }
        }

        public AbstractBinderC3625a() {
            attachInterface(this, f2970a);
        }

        /* renamed from: a */
        public static DecisionExpirationContext m102606a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2970a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof DecisionExpirationContext)) {
                return (DecisionExpirationContext) queryLocalInterface;
            }
            return new C3626a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString(f2970a);
                    return true;
                }
                parcel.enforceInterface(f2970a);
                Map mo102604b = mo102604b();
                parcel2.writeNoException();
                parcel2.writeMap(mo102604b);
                return true;
            }
            parcel.enforceInterface(f2970a);
            String mo102605a = mo102605a();
            parcel2.writeNoException();
            parcel2.writeString(mo102605a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
