package com.amazon.p084d.p085a;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.p084d.p085a.ChoiceContext;
import java.util.Map;

/* renamed from: com.amazon.d.a.a */
/* loaded from: classes2.dex */
public interface Choice extends IInterface {
    /* renamed from: a */
    String mo102623a() throws RemoteException;

    /* renamed from: a */
    void mo102622a(ChoiceContext choiceContext) throws RemoteException;

    /* renamed from: b */
    Intent mo102621b() throws RemoteException;

    /* renamed from: c */
    Map mo102620c() throws RemoteException;

    /* compiled from: Choice.java */
    /* renamed from: com.amazon.d.a.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3617a extends Binder implements Choice {

        /* renamed from: a */
        static final int f2952a = 1;

        /* renamed from: b */
        static final int f2953b = 2;

        /* renamed from: c */
        static final int f2954c = 3;

        /* renamed from: d */
        static final int f2955d = 4;

        /* renamed from: e */
        private static final String f2956e = "com.amazon.venezia.command.Choice";

        public AbstractBinderC3617a() {
            attachInterface(this, f2956e);
        }

        /* renamed from: a */
        public static Choice m102624a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2956e);
            if (queryLocalInterface != null && (queryLocalInterface instanceof Choice)) {
                return (Choice) queryLocalInterface;
            }
            return new C3618a(iBinder);
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
                            parcel2.writeString(f2956e);
                            return true;
                        }
                        parcel.enforceInterface(f2956e);
                        Map mo102620c = mo102620c();
                        parcel2.writeNoException();
                        parcel2.writeMap(mo102620c);
                        return true;
                    }
                    parcel.enforceInterface(f2956e);
                    mo102622a(ChoiceContext.AbstractBinderC3619a.m102618a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(f2956e);
                Intent mo102621b = mo102621b();
                parcel2.writeNoException();
                if (mo102621b != null) {
                    parcel2.writeInt(1);
                    mo102621b.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            parcel.enforceInterface(f2956e);
            String mo102623a = mo102623a();
            parcel2.writeNoException();
            parcel2.writeString(mo102623a);
            return true;
        }

        /* compiled from: Choice.java */
        /* renamed from: com.amazon.d.a.a$a$a */
        /* loaded from: classes2.dex */
        private static class C3618a implements Choice {

            /* renamed from: a */
            private IBinder f2957a;

            C3618a(IBinder iBinder) {
                this.f2957a = iBinder;
            }

            @Override // com.amazon.p084d.p085a.Choice
            /* renamed from: a */
            public String mo102623a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3617a.f2956e);
                    this.f2957a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2957a;
            }

            @Override // com.amazon.p084d.p085a.Choice
            /* renamed from: b */
            public Intent mo102621b() throws RemoteException {
                Intent intent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3617a.f2956e);
                    this.f2957a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(obtain2);
                    } else {
                        intent = null;
                    }
                    return intent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.p084d.p085a.Choice
            /* renamed from: c */
            public Map mo102620c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3617a.f2956e);
                    this.f2957a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public String m102619d() {
                return AbstractBinderC3617a.f2956e;
            }

            @Override // com.amazon.p084d.p085a.Choice
            /* renamed from: a */
            public void mo102622a(ChoiceContext choiceContext) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3617a.f2956e);
                    obtain.writeStrongBinder(choiceContext != null ? choiceContext.asBinder() : null);
                    this.f2957a.transact(3, obtain, obtain2, 0);
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
