package android.support.p013v4.p014os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$b */
    /* loaded from: classes.dex */
    public static class C0110b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105527c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105526d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: a */
    void mo105530a(int i, Bundle bundle) throws RemoteException;

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0108a extends Binder implements IResultReceiver {

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a */
        /* loaded from: classes.dex */
        private static class C0109a implements IResultReceiver {

            /* renamed from: b */
            private IBinder f294b;

            C0109a(IBinder iBinder) {
                this.f294b = iBinder;
            }

            @Override // android.support.p013v4.p014os.IResultReceiver
            /* renamed from: a */
            public void mo105530a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C0110b.m105526d(obtain, bundle, 0);
                    this.f294b.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f294b;
            }
        }

        public AbstractBinderC0108a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: c */
        public static IResultReceiver m105531c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                return (IResultReceiver) queryLocalInterface;
            }
            return new C0109a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo105530a(parcel.readInt(), (Bundle) C0110b.m105527c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
