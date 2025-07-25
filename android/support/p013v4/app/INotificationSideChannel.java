package android.support.p013v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$b */
    /* loaded from: classes.dex */
    public static class C0064b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105684c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105683d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0062a extends Binder implements INotificationSideChannel {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: android.support.v4.app.a$a$a */
        /* loaded from: classes.dex */
        private static class C0063a implements INotificationSideChannel {

            /* renamed from: b */
            private IBinder f184b;

            C0063a(IBinder iBinder) {
                this.f184b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f184b;
            }

            @Override // android.support.p013v4.app.INotificationSideChannel
            public void cancel(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f184b.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.p013v4.app.INotificationSideChannel
            public void cancelAll(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f184b.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.p013v4.app.INotificationSideChannel
            public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C0064b.m105683d(obtain, notification, 0);
                    this.f184b.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0062a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && (queryLocalInterface instanceof INotificationSideChannel)) {
                return (INotificationSideChannel) queryLocalInterface;
            }
            return new C0063a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        cancelAll(parcel.readString());
                    } else {
                        cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                    }
                } else {
                    notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C0064b.m105684c(parcel, Notification.CREATOR));
                }
                return true;
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
