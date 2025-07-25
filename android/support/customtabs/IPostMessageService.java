package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.customtabs.d */
/* loaded from: classes.dex */
public interface IPostMessageService extends IInterface {

    /* renamed from: S7 */
    public static final String f178S7 = "android$support$customtabs$IPostMessageService".replace('$', '.');

    /* compiled from: IPostMessageService.java */
    /* renamed from: android.support.customtabs.d$b */
    /* loaded from: classes.dex */
    public static class C0055b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105696c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105695d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;

    /* compiled from: IPostMessageService.java */
    /* renamed from: android.support.customtabs.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0053a extends Binder implements IPostMessageService {
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        /* compiled from: IPostMessageService.java */
        /* renamed from: android.support.customtabs.d$a$a */
        /* loaded from: classes.dex */
        private static class C0054a implements IPostMessageService {

            /* renamed from: b */
            private IBinder f179b;

            C0054a(IBinder iBinder) {
                this.f179b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f179b;
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPostMessageService.f178S7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    C0055b.m105695d(obtain, bundle, 0);
                    this.f179b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPostMessageService.f178S7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeString(str);
                    C0055b.m105695d(obtain, bundle, 0);
                    this.f179b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0053a() {
            attachInterface(this, IPostMessageService.f178S7);
        }

        public static IPostMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.f178S7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPostMessageService)) {
                return (IPostMessageService) queryLocalInterface;
            }
            return new C0054a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IPostMessageService.f178S7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onPostMessage(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0055b.m105696c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                onMessageChannelReady(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Bundle) C0055b.m105696c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
