package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.customtabs.a */
/* loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    /* renamed from: P7 */
    public static final String f172P7 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: android.support.customtabs.a$b */
    /* loaded from: classes.dex */
    public static class C0046b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105710c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105709d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void extraCallback(String str, Bundle bundle) throws RemoteException;

    Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException;

    void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException;

    void onMessageChannelReady(Bundle bundle) throws RemoteException;

    void onMinimized(Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

    void onPostMessage(String str, Bundle bundle) throws RemoteException;

    void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    void onUnminimized(Bundle bundle) throws RemoteException;

    void onWarmupCompleted(Bundle bundle) throws RemoteException;

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: android.support.customtabs.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0044a extends Binder implements ICustomTabsCallback {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        /* compiled from: ICustomTabsCallback.java */
        /* renamed from: android.support.customtabs.a$a$a */
        /* loaded from: classes.dex */
        private static class C0045a implements ICustomTabsCallback {

            /* renamed from: b */
            private IBinder f173b;

            C0045a(IBinder iBinder) {
                this.f173b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f173b;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeString(str);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeString(str);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0046b.m105710c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeInt(i);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeString(str);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    obtain.writeInt(i);
                    C0046b.m105709d(obtain, uri, 0);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f172P7);
                    C0046b.m105709d(obtain, bundle, 0);
                    this.f173b.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0044a() {
            attachInterface(this, ICustomTabsCallback.f172P7);
        }

        public static ICustomTabsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.f172P7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICustomTabsCallback)) {
                return (ICustomTabsCallback) queryLocalInterface;
            }
            return new C0045a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = ICustomTabsCallback.f172P7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    extraCallback(parcel.readString(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    onMessageChannelReady((Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    onPostMessage(parcel.readString(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    int readInt = parcel.readInt();
                    Uri uri = (Uri) C0046b.m105710c(parcel, Uri.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    onRelationshipValidationResult(readInt, uri, z, (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle extraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0046b.m105709d(parcel2, extraCallbackWithResult, 1);
                    break;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    onWarmupCompleted((Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    onMinimized((Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    onUnminimized((Bundle) C0046b.m105710c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
