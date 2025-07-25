package com.amazon.p084d.p085a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.p084d.p085a.Command;
import com.amazon.p084d.p085a.ResultCallback;

/* renamed from: com.amazon.d.a.d */
/* loaded from: classes2.dex */
public interface CommandService extends IInterface {
    /* renamed from: a */
    void mo102607a(Command command, ResultCallback resultCallback) throws RemoteException;

    /* compiled from: CommandService.java */
    /* renamed from: com.amazon.d.a.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC3623a extends Binder implements CommandService {

        /* renamed from: a */
        static final int f2967a = 1;

        /* renamed from: b */
        private static final String f2968b = "com.amazon.venezia.command.CommandService";

        /* compiled from: CommandService.java */
        /* renamed from: com.amazon.d.a.d$a$a */
        /* loaded from: classes2.dex */
        private static class C3624a implements CommandService {

            /* renamed from: a */
            private IBinder f2969a;

            C3624a(IBinder iBinder) {
                this.f2969a = iBinder;
            }

            /* renamed from: a */
            public String m102608a() {
                return AbstractBinderC3623a.f2968b;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2969a;
            }

            @Override // com.amazon.p084d.p085a.CommandService
            /* renamed from: a */
            public void mo102607a(Command command, ResultCallback resultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC3623a.f2968b);
                    obtain.writeStrongBinder(command != null ? command.asBinder() : null);
                    obtain.writeStrongBinder(resultCallback != null ? resultCallback.asBinder() : null);
                    this.f2969a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC3623a() {
            attachInterface(this, f2968b);
        }

        /* renamed from: a */
        public static CommandService m102609a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2968b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof CommandService)) {
                return (CommandService) queryLocalInterface;
            }
            return new C3624a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(f2968b);
                return true;
            }
            parcel.enforceInterface(f2968b);
            mo102607a(Command.AbstractBinderC3621a.m102615a(parcel.readStrongBinder()), ResultCallback.AbstractBinderC3633a.m102578a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
