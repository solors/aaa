package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.g */
/* loaded from: classes2.dex */
public interface ExceptionResult extends IInterface {
    /* renamed from: a */
    String mo102590a() throws RemoteException;

    /* renamed from: b */
    Map mo102589b() throws RemoteException;

    /* compiled from: ExceptionResult.java */
    /* renamed from: com.amazon.d.a.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3629a extends Binder implements ExceptionResult {

        /* renamed from: a */
        static final int f2985a = 1;

        /* renamed from: b */
        static final int f2986b = 2;

        /* renamed from: c */
        private static final String f2987c = "com.amazon.venezia.command.ExceptionResult";

        /* compiled from: ExceptionResult.java */
        /* renamed from: com.amazon.d.a.g$a$a */
        /* loaded from: classes2.dex */
        private static class C3630a implements ExceptionResult {

            /* renamed from: a */
            private IBinder f2988a;

            C3630a(IBinder iBinder) {
                this.f2988a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.ExceptionResult
            /* renamed from: a */
            public String mo102590a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3629a.f2987c);
                    this.f2988a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2988a;
            }

            @Override // com.amazon.p084d.p085a.ExceptionResult
            /* renamed from: b */
            public Map mo102589b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3629a.f2987c);
                    this.f2988a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String m102588c() {
                return AbstractBinderC3629a.f2987c;
            }
        }

        public AbstractBinderC3629a() {
            attachInterface(this, f2987c);
        }

        /* renamed from: a */
        public static ExceptionResult m102591a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2987c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ExceptionResult)) {
                return (ExceptionResult) queryLocalInterface;
            }
            return new C3630a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString(f2987c);
                    return true;
                }
                parcel.enforceInterface(f2987c);
                Map mo102589b = mo102589b();
                parcel2.writeNoException();
                parcel2.writeMap(mo102589b);
                return true;
            }
            parcel.enforceInterface(f2987c);
            String mo102590a = mo102590a();
            parcel2.writeNoException();
            parcel2.writeString(mo102590a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
