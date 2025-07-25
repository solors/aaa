package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.d.a.b */
/* loaded from: classes2.dex */
public interface ChoiceContext extends IInterface {
    /* renamed from: a */
    Map mo102617a() throws RemoteException;

    /* compiled from: ChoiceContext.java */
    /* renamed from: com.amazon.d.a.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3619a extends Binder implements ChoiceContext {

        /* renamed from: a */
        static final int f2958a = 1;

        /* renamed from: b */
        private static final String f2959b = "com.amazon.venezia.command.ChoiceContext";

        /* compiled from: ChoiceContext.java */
        /* renamed from: com.amazon.d.a.b$a$a */
        /* loaded from: classes2.dex */
        private static class C3620a implements ChoiceContext {

            /* renamed from: a */
            private IBinder f2960a;

            C3620a(IBinder iBinder) {
                this.f2960a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.ChoiceContext
            /* renamed from: a */
            public Map mo102617a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3619a.f2959b);
                    this.f2960a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2960a;
            }

            /* renamed from: b */
            public String m102616b() {
                return AbstractBinderC3619a.f2959b;
            }
        }

        public AbstractBinderC3619a() {
            attachInterface(this, f2959b);
        }

        /* renamed from: a */
        public static ChoiceContext m102618a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2959b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ChoiceContext)) {
                return (ChoiceContext) queryLocalInterface;
            }
            return new C3620a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(f2959b);
                return true;
            }
            parcel.enforceInterface(f2959b);
            Map mo102617a = mo102617a();
            parcel2.writeNoException();
            parcel2.writeMap(mo102617a);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
