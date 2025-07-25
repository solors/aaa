package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.customtabs.c */
/* loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {

    /* renamed from: R7 */
    public static final String f176R7 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* compiled from: IEngagementSignalsCallback.java */
    /* renamed from: android.support.customtabs.c$b */
    /* loaded from: classes.dex */
    public static class C0052b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105700c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105699d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException;

    /* compiled from: IEngagementSignalsCallback.java */
    /* renamed from: android.support.customtabs.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0050a extends Binder implements IEngagementSignalsCallback {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        /* compiled from: IEngagementSignalsCallback.java */
        /* renamed from: android.support.customtabs.c$a$a */
        /* loaded from: classes.dex */
        private static class C0051a implements IEngagementSignalsCallback {

            /* renamed from: b */
            private IBinder f177b;

            C0051a(IBinder iBinder) {
                this.f177b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f177b;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f176R7);
                    obtain.writeInt(i);
                    C0052b.m105699d(obtain, bundle, 0);
                    this.f177b.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean z, Bundle bundle) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f176R7);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    C0052b.m105699d(obtain, bundle, 0);
                    this.f177b.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f176R7);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    C0052b.m105699d(obtain, bundle, 0);
                    this.f177b.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0050a() {
            attachInterface(this, IEngagementSignalsCallback.f176R7);
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.f176R7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IEngagementSignalsCallback)) {
                return (IEngagementSignalsCallback) queryLocalInterface;
            }
            return new C0051a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IEngagementSignalsCallback.f176R7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onSessionEnded(z, (Bundle) C0052b.m105700c(parcel, Bundle.CREATOR));
                } else {
                    onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) C0052b.m105700c(parcel, Bundle.CREATOR));
                }
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onVerticalScrollEvent(z, (Bundle) C0052b.m105700c(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
