package net.pubnative.lite.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class PNAdvertisingIdClient {
    private static final String TAG = "PNAdvertisingIdClient";
    protected Handler mHadler;
    protected Listener mListener;

    /* loaded from: classes10.dex */
    public static class AdInfo {
        private final String mAdvertisingId;
        private final boolean mLimitAdTrackingEnabled;

        AdInfo(String str, boolean z) {
            this.mAdvertisingId = str;
            this.mLimitAdTrackingEnabled = z;
        }

        public String getId() {
            return this.mAdvertisingId;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.mLimitAdTrackingEnabled;
        }
    }

    /* loaded from: classes10.dex */
    protected static class AdvertisingInterface implements IInterface {
        private final IBinder binder;

        public AdvertisingInterface(IBinder iBinder) {
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
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.binder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    HyBid.reportException(e);
                    Log.e(PNAdvertisingIdClient.TAG, "Error: Can't read AdvertisingId from the service", e);
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean isLimitAdTrackingEnabled(boolean z) throws RemoteException {
            int i;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z2 = false;
            try {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.binder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                } catch (Exception e) {
                    HyBid.reportException(e);
                    Log.e(PNAdvertisingIdClient.TAG, "Error: Can't get is limit Ad tracking enabled", e);
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes10.dex */
    public interface Listener {
        void onPNAdvertisingIdFinish(String str, Boolean bool);
    }

    protected void getAdvertisingId(final Context context) {
        new Thread(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.1
            /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r7 = this;
                    java.lang.String r0 = "getAdvertisingIdInfo - Error: "
                    r1 = 0
                    android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L66
                    java.lang.String r3 = "com.google.android.gms.ads.identifier.service.START"
                    r2.<init>(r3)     // Catch: java.lang.Exception -> L66
                    java.lang.String r3 = "com.google.android.gms"
                    r2.setPackage(r3)     // Catch: java.lang.Exception -> L66
                    net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdvertisingConnection r3 = new net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdvertisingConnection     // Catch: java.lang.Exception -> L66
                    r3.<init>()     // Catch: java.lang.Exception -> L66
                    android.content.Context r4 = r2     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    r5 = 1
                    boolean r2 = r4.bindService(r2, r3, r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    if (r2 == 0) goto L34
                    net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdvertisingInterface r2 = new net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdvertisingInterface     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    android.os.IBinder r4 = r3.getBinder()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    r2.<init>(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdInfo r4 = new net.pubnative.lite.sdk.utils.PNAdvertisingIdClient$AdInfo     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    java.lang.String r6 = r2.getId()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    boolean r2 = r2.isLimitAdTrackingEnabled(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    r4.<init>(r6, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
                    goto L35
                L34:
                    r4 = r1
                L35:
                    android.content.Context r2 = r2     // Catch: java.lang.Exception -> L3b
                    r2.unbindService(r3)     // Catch: java.lang.Exception -> L3b
                    goto L81
                L3b:
                    r2 = move-exception
                    goto L68
                L3d:
                    r2 = move-exception
                    goto L60
                L3f:
                    r2 = move-exception
                    net.pubnative.lite.sdk.HyBid.reportException(r2)     // Catch: java.lang.Throwable -> L3d
                    java.lang.String r4 = net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.m14223a()     // Catch: java.lang.Throwable -> L3d
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
                    r5.<init>()     // Catch: java.lang.Throwable -> L3d
                    r5.append(r0)     // Catch: java.lang.Throwable -> L3d
                    r5.append(r2)     // Catch: java.lang.Throwable -> L3d
                    java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L3d
                    android.util.Log.e(r4, r2)     // Catch: java.lang.Throwable -> L3d
                    android.content.Context r2 = r2     // Catch: java.lang.Exception -> L66
                    r2.unbindService(r3)     // Catch: java.lang.Exception -> L66
                    r4 = r1
                    goto L81
                L60:
                    android.content.Context r4 = r2     // Catch: java.lang.Exception -> L66
                    r4.unbindService(r3)     // Catch: java.lang.Exception -> L66
                    throw r2     // Catch: java.lang.Exception -> L66
                L66:
                    r2 = move-exception
                    r4 = r1
                L68:
                    net.pubnative.lite.sdk.HyBid.reportException(r2)
                    java.lang.String r3 = net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.m14223a()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r0)
                    r5.append(r2)
                    java.lang.String r0 = r5.toString()
                    android.util.Log.e(r3, r0)
                L81:
                    if (r4 == 0) goto L98
                    boolean r0 = r4.isLimitAdTrackingEnabled()
                    if (r0 == 0) goto L93
                    java.lang.String r2 = net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.m14223a()
                    java.lang.String r3 = "Error: cannot get advertising id, limit ad tracking is enabled"
                    android.util.Log.i(r2, r3)
                    goto L99
                L93:
                    java.lang.String r1 = r4.getId()
                    goto L99
                L98:
                    r0 = 0
                L99:
                    net.pubnative.lite.sdk.utils.PNAdvertisingIdClient r2 = net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.this
                    r2.invokeOnFinish(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.RunnableC386741.run():void");
            }
        }).start();
    }

    protected void invokeOnFinish(final String str, final boolean z) {
        this.mHadler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNAdvertisingIdClient.2
            @Override // java.lang.Runnable
            public void run() {
                Listener listener = PNAdvertisingIdClient.this.mListener;
                if (listener != null) {
                    listener.onPNAdvertisingIdFinish(str, Boolean.valueOf(z));
                }
            }
        });
    }

    public void request(Context context, Listener listener) {
        this.mListener = listener;
        this.mHadler = new Handler(Looper.getMainLooper());
        getAdvertisingId(context);
    }

    /* loaded from: classes10.dex */
    protected static class AdvertisingConnection implements ServiceConnection {
        boolean retrieved = false;
        private final LinkedBlockingQueue<IBinder> queue = new LinkedBlockingQueue<>(1);

        protected AdvertisingConnection() {
        }

        public IBinder getBinder() throws InterruptedException {
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
            } catch (InterruptedException e) {
                HyBid.reportException((Exception) e);
                Log.e(PNAdvertisingIdClient.TAG, "Error: can't connect to AdvertisingId service", e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
