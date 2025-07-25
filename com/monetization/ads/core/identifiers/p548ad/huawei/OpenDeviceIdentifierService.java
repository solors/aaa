package com.monetization.ads.core.identifiers.p548ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService */
/* loaded from: classes7.dex */
public interface OpenDeviceIdentifierService extends IInterface {
    @Nullable
    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;

    @Metadata
    /* renamed from: com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService$Stub */
    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* renamed from: a */
        public static final /* synthetic */ int f66081a = 0;

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata
        /* renamed from: com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService$Stub$Proxy */
        /* loaded from: classes7.dex */
        public static final class Proxy implements OpenDeviceIdentifierService {
            @NotNull

            /* renamed from: a */
            private final IBinder f66082a;

            public Proxy(@NotNull IBinder remote) {
                Intrinsics.checkNotNullParameter(remote, "remote");
                this.f66082a = remote;
            }

            @Override // android.os.IInterface
            @NotNull
            public IBinder asBinder() {
                return this.f66082a;
            }

            @Override // com.monetization.ads.core.identifiers.p548ad.huawei.OpenDeviceIdentifierService
            @Nullable
            public String getOaid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f66082a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.p548ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z = false;
                    this.f66082a.transact(2, obtain, obtain2, 0);
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

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        @Override // android.os.Binder
        protected final boolean onTransact(int i, @NotNull Parcel data, @Nullable Parcel parcel, int i2) throws RemoteException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, data, parcel, i2);
                    }
                    if (parcel == null) {
                        return true;
                    }
                    parcel.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    return true;
                }
                data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel == null) {
                    return true;
                }
                parcel.writeInt(oaidTrackLimited ? 1 : 0);
                return true;
            }
            data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String oaid = getOaid();
            if (parcel != null) {
                parcel.writeNoException();
            }
            if (parcel == null) {
                return true;
            }
            parcel.writeString(oaid);
            return true;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this;
        }
    }
}
