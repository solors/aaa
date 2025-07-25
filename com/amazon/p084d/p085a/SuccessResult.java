package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.j */
/* loaded from: classes2.dex */
public interface SuccessResult extends IInterface {
    /* renamed from: a */
    String mo102571a() throws RemoteException;

    /* renamed from: b */
    Map mo102570b() throws RemoteException;

    /* compiled from: SuccessResult.java */
    /* renamed from: com.amazon.d.a.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3635a extends Binder implements SuccessResult {

        /* renamed from: a */
        static final int f3004a = 1;

        /* renamed from: b */
        static final int f3005b = 2;

        /* renamed from: c */
        private static final String f3006c = "com.amazon.venezia.command.SuccessResult";

        /* compiled from: SuccessResult.java */
        /* renamed from: com.amazon.d.a.j$a$a */
        /* loaded from: classes2.dex */
        private static class C3636a implements SuccessResult {

            /* renamed from: a */
            private IBinder f3007a;

            C3636a(IBinder iBinder) {
                this.f3007a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.SuccessResult
            /* renamed from: a */
            public String mo102571a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3635a.f3006c);
                    this.f3007a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3007a;
            }

            @Override // com.amazon.p084d.p085a.SuccessResult
            /* renamed from: b */
            public Map mo102570b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3635a.f3006c);
                    this.f3007a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String m102569c() {
                return AbstractBinderC3635a.f3006c;
            }
        }

        public AbstractBinderC3635a() {
            attachInterface(this, f3006c);
        }

        /* renamed from: a */
        public static SuccessResult m102572a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f3006c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof SuccessResult)) {
                return (SuccessResult) queryLocalInterface;
            }
            return new C3636a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString(f3006c);
                    return true;
                }
                parcel.enforceInterface(f3006c);
                Map mo102570b = mo102570b();
                parcel2.writeNoException();
                parcel2.writeMap(mo102570b);
                return true;
            }
            parcel.enforceInterface(f3006c);
            String mo102571a = mo102571a();
            parcel2.writeNoException();
            parcel2.writeString(mo102571a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
