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
/* renamed from: android.support.customtabs.trusted.a */
/* loaded from: classes.dex */
public interface ITrustedWebActivityCallback extends IInterface {

    /* renamed from: T7 */
    public static final String f180T7 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    /* compiled from: ITrustedWebActivityCallback.java */
    /* renamed from: android.support.customtabs.trusted.a$b */
    /* loaded from: classes.dex */
    public static class C0058b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m105692c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m105691d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    /* compiled from: ITrustedWebActivityCallback.java */
    /* renamed from: android.support.customtabs.trusted.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0056a extends Binder implements ITrustedWebActivityCallback {
        static final int TRANSACTION_onExtraCallback = 2;

        /* compiled from: ITrustedWebActivityCallback.java */
        /* renamed from: android.support.customtabs.trusted.a$a$a */
        /* loaded from: classes.dex */
        private static class C0057a implements ITrustedWebActivityCallback {

            /* renamed from: b */
            private IBinder f181b;

            C0057a(IBinder iBinder) {
                this.f181b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f181b;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityCallback.f180T7);
                    obtain.writeString(str);
                    C0058b.m105691d(obtain, bundle, 0);
                    this.f181b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0056a() {
            attachInterface(this, ITrustedWebActivityCallback.f180T7);
        }

        public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.f180T7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITrustedWebActivityCallback)) {
                return (ITrustedWebActivityCallback) queryLocalInterface;
            }
            return new C0057a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ITrustedWebActivityCallback.f180T7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                onExtraCallback(parcel.readString(), (Bundle) C0058b.m105692c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
