package com.maticoo.sdk.utils.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.WorkerThread;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.prefs.Preference;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
public class AdvertisingIdClient {

    /* loaded from: classes6.dex */
    public static final class AdInfo {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        AdInfo(String str, boolean z) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z;
        }

        public String getId() {
            return this.advertisingId;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class AdvertisingInterface implements IInterface {
        private final IBinder binder;

        AdvertisingInterface(IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        boolean isLimitAdTrackingEnabled(boolean z) throws RemoteException {
            int i;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                obtain.writeInt(i);
                this.binder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface OnGetGaidListener {
        void onGetGaid(String str);
    }

    private AdvertisingIdClient() {
    }

    @WorkerThread
    public static AdInfo getAdvertisingIdInfo(Context context) {
        AdvertisingConnection advertisingConnection;
        ServiceConnection serviceConnection = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            DeveloperLog.LogD("getAdvertisingIdInfo Cannot be called from the main thread");
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            advertisingConnection = new AdvertisingConnection();
        } catch (Exception unused) {
            advertisingConnection = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, advertisingConnection, 1)) {
                AdvertisingInterface advertisingInterface = new AdvertisingInterface(advertisingConnection.getBinder());
                DeveloperLog.LogD("Gaid:" + advertisingInterface.getId());
                AdInfo adInfo = new AdInfo(advertisingInterface.getId(), advertisingInterface.isLimitAdTrackingEnabled(true));
                context.unbindService(advertisingConnection);
                return adInfo;
            }
            context.unbindService(advertisingConnection);
            return null;
        } catch (Exception unused2) {
            if (advertisingConnection != null) {
                context.unbindService(advertisingConnection);
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            serviceConnection = advertisingConnection;
            if (serviceConnection != null) {
                context.unbindService(serviceConnection);
            }
            throw th;
        }
    }

    public static void getGaid(Context context, OnGetGaidListener onGetGaidListener) {
        String str = "";
        if (!Preference.PRIVACY_GDPR_CONSENT.getValue().booleanValue()) {
            onGetGaidListener.onGetGaid("");
            return;
        }
        AdInfo advertisingIdInfo = getAdvertisingIdInfo(context);
        if (onGetGaidListener != null) {
            if (advertisingIdInfo != null) {
                str = advertisingIdInfo.advertisingId;
            }
            onGetGaidListener.onGetGaid(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class AdvertisingConnection implements ServiceConnection {
        private final LinkedBlockingQueue<IBinder> queue;
        boolean retrieved;

        private AdvertisingConnection() {
            this.retrieved = false;
            this.queue = new LinkedBlockingQueue<>(1);
        }

        IBinder getBinder() throws InterruptedException {
            if (!this.retrieved) {
                this.retrieved = true;
                return this.queue.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.queue.put(iBinder);
            } catch (Throwable th) {
                DeveloperLog.LogD("AdvertisingIdClient", th);
                CrashUtil.getSingleton().reportSDKException(th);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
