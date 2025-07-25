package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: android.support.customtabs.b */
/* loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    /* renamed from: Q7 */
    public static final String f174Q7 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: ICustomTabsService.java */
    /* renamed from: android.support.customtabs.b$b */
    /* loaded from: classes.dex */
    public static class C0049b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T> T m105705d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static <T extends Parcelable> void m105704e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                m105703f(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static <T extends Parcelable> void m105703f(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException;

    boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;

    boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException;

    boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j) throws RemoteException;

    /* compiled from: ICustomTabsService.java */
    /* renamed from: android.support.customtabs.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0047a extends Binder implements ICustomTabsService {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        /* compiled from: ICustomTabsService.java */
        /* renamed from: android.support.customtabs.b$a$a */
        /* loaded from: classes.dex */
        private static class C0048a implements ICustomTabsService {

            /* renamed from: b */
            private IBinder f175b;

            C0048a(IBinder iBinder) {
                this.f175b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f175b;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeString(str);
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0049b.m105705d(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, uri, 0);
                    C0049b.m105703f(obtain, bundle, 0);
                    C0049b.m105704e(obtain, list, 0);
                    this.f175b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    this.f175b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeString(str);
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, uri, 0);
                    obtain.writeInt(i);
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, uri, 0);
                    this.f175b.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, uri, 0);
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    boolean z = false;
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeInt(i);
                    boolean z = false;
                    C0049b.m105703f(obtain, uri, 0);
                    C0049b.m105703f(obtain, bundle, 0);
                    this.f175b.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f174Q7);
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f175b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0047a() {
            attachInterface(this, ICustomTabsService.f174Q7);
        }

        public static ICustomTabsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.f174Q7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICustomTabsService)) {
                return (ICustomTabsService) queryLocalInterface;
            }
            return new C0048a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ICustomTabsService.f174Q7;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean warmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(warmup ? 1 : 0);
                    break;
                case 3:
                    boolean newSession = newSession(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSession ? 1 : 0);
                    break;
                case 4:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean mayLaunchUrl = mayLaunchUrl(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Uri) C0049b.m105705d(parcel, Uri.CREATOR), (Bundle) C0049b.m105705d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                    break;
                case 5:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0049b.m105703f(parcel2, extraCommand, 1);
                    break;
                case 6:
                    boolean updateVisuals = updateVisuals(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(updateVisuals ? 1 : 0);
                    break;
                case 7:
                    boolean requestPostMessageChannel = requestPostMessageChannel(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Uri) C0049b.m105705d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                    break;
                case 8:
                    int postMessage = postMessage(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(postMessage);
                    break;
                case 9:
                    boolean validateRelationship = validateRelationship(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) C0049b.m105705d(parcel, Uri.CREATOR), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(validateRelationship ? 1 : 0);
                    break;
                case 10:
                    boolean newSessionWithExtras = newSessionWithExtras(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                    break;
                case 11:
                    boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Uri) C0049b.m105705d(parcel, Uri.CREATOR), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                    break;
                case 12:
                    boolean receiveFile = receiveFile(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Uri) C0049b.m105705d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(receiveFile ? 1 : 0);
                    break;
                case 13:
                    boolean isEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(isEngagementSignalsApiAvailable ? 1 : 0);
                    break;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(ICustomTabsCallback.AbstractBinderC0044a.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0049b.m105705d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
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
