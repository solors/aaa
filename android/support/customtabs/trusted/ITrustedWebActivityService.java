package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.customtabs.trusted.b */
/* loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {

    /* renamed from: U7 */
    public static final String f182U7 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* compiled from: ITrustedWebActivityService.java */
    /* renamed from: android.support.customtabs.trusted.b$b */
    /* loaded from: classes.dex */
    public static class C0061b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105688c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105687d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

    void cancelNotification(Bundle bundle) throws RemoteException;

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle getActiveNotifications() throws RemoteException;

    Bundle getSmallIconBitmap() throws RemoteException;

    int getSmallIconId() throws RemoteException;

    Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;

    /* compiled from: ITrustedWebActivityService.java */
    /* renamed from: android.support.customtabs.trusted.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0059a extends Binder implements ITrustedWebActivityService {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        /* compiled from: ITrustedWebActivityService.java */
        /* renamed from: android.support.customtabs.trusted.b$a$a */
        /* loaded from: classes.dex */
        private static class C0060a implements ITrustedWebActivityService {

            /* renamed from: b */
            private IBinder f183b;

            C0060a(IBinder iBinder) {
                this.f183b = iBinder;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    C0061b.m105687d(obtain, bundle, 0);
                    this.f183b.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0061b.m105688c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f183b;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public void cancelNotification(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    C0061b.m105687d(obtain, bundle, 0);
                    this.f183b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    obtain.writeString(str);
                    C0061b.m105687d(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.f183b.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0061b.m105688c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle getActiveNotifications() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    this.f183b.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0061b.m105688c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle getSmallIconBitmap() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    this.f183b.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0061b.m105688c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public int getSmallIconId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    this.f183b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.f182U7);
                    C0061b.m105687d(obtain, bundle, 0);
                    this.f183b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0061b.m105688c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0059a() {
            attachInterface(this, ITrustedWebActivityService.f182U7);
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.f182U7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITrustedWebActivityService)) {
                return (ITrustedWebActivityService) queryLocalInterface;
            }
            return new C0060a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ITrustedWebActivityService.f182U7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) C0061b.m105688c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0061b.m105687d(parcel2, notifyNotificationWithChannel, 1);
                    break;
                case 3:
                    cancelNotification((Bundle) C0061b.m105688c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    break;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    C0061b.m105687d(parcel2, activeNotifications, 1);
                    break;
                case 6:
                    Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) C0061b.m105688c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0061b.m105687d(parcel2, areNotificationsEnabled, 1);
                    break;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    C0061b.m105687d(parcel2, smallIconBitmap, 1);
                    break;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) C0061b.m105688c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    C0061b.m105687d(parcel2, extraCommand, 1);
                    break;
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
