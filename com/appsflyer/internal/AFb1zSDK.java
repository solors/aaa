package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes2.dex */
public final class AFb1zSDK {

    /* loaded from: classes2.dex */
    public static final class AFa1uSDK {
        private final boolean AFInAppEventParameterName;
        public final String valueOf;

        AFa1uSDK(String str, boolean z) {
            this.valueOf = str;
            this.AFInAppEventParameterName = z;
        }

        public final boolean AFInAppEventParameterName() {
            return this.AFInAppEventParameterName;
        }
    }

    /* loaded from: classes2.dex */
    static final class AFa1vSDK implements IInterface {
        private final IBinder valueOf;

        AFa1vSDK(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.valueOf.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.valueOf;
        }

        public final String values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static AFa1uSDK valueOf(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1zSDK, 1)) {
                    if (!aFa1zSDK.valueOf) {
                        aFa1zSDK.valueOf = true;
                        IBinder poll = aFa1zSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            AFa1vSDK aFa1vSDK = new AFa1vSDK(poll);
                            return new AFa1uSDK(aFa1vSDK.values(), aFa1vSDK.AFKeystoreWrapper());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aFa1zSDK);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes2.dex */
    static final class AFa1zSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean valueOf;

        private AFa1zSDK() {
            this.AFInAppEventType = new LinkedBlockingQueue<>(1);
            this.valueOf = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        /* synthetic */ AFa1zSDK(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
