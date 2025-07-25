package com.p552ot.pubsub.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.Method;

/* renamed from: com.ot.pubsub.util.DeviceUtil */
/* loaded from: classes7.dex */
public class DeviceUtil {

    /* renamed from: a */
    private static final String f69698a = "DeviceUtil";

    /* renamed from: b */
    private static final String f69699b = "";

    /* renamed from: c */
    private static Method f69700c;

    /* renamed from: d */
    private static String f69701d;

    static {
        try {
            f69700c = Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class);
        } catch (Throwable th) {
            C26586j.m41074b(f69698a, "sGetProp init failed ex: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static String m41131a(Context context) {
        if (!TextUtils.isEmpty(f69701d)) {
            return f69701d;
        }
        if (GAIDClient.m41126b(context)) {
            return "";
        }
        String m41127a = GAIDClient.m41127a(context);
        if (TextUtils.isEmpty(m41127a)) {
            return "";
        }
        f69701d = m41127a;
        return m41127a;
    }

    /* renamed from: b */
    public static String m41129b() {
        return m41130a("ro.product.marketname");
    }

    /* renamed from: c */
    public static String m41128c() {
        return Build.MANUFACTURER;
    }

    /* renamed from: a */
    private static String m41130a(String str) {
        try {
            Method method = f69700c;
            if (method != null) {
                return String.valueOf(method.invoke(null, str));
            }
        } catch (Exception e) {
            C26586j.m41080a(f69698a, "getProp failed ex: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: a */
    public static String m41132a() {
        return Build.MODEL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.util.DeviceUtil$GAIDClient */
    /* loaded from: classes7.dex */
    public static class GAIDClient {

        /* renamed from: a */
        private static final String f69702a = "GAIDClient";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ot.pubsub.util.DeviceUtil$GAIDClient$AdvertisingConnection */
        /* loaded from: classes7.dex */
        public static final class AdvertisingConnection implements ServiceConnection {

            /* renamed from: a */
            private static final int f69703a = 30000;

            /* renamed from: b */
            private boolean f69704b;

            /* renamed from: c */
            private IBinder f69705c;

            private AdvertisingConnection() {
                this.f69704b = false;
            }

            /* renamed from: a */
            public IBinder m41124a() throws InterruptedException {
                IBinder iBinder = this.f69705c;
                if (iBinder != null) {
                    return iBinder;
                }
                if (iBinder == null && !this.f69704b) {
                    synchronized (this) {
                        wait(30000L);
                        if (this.f69705c == null) {
                            throw new InterruptedException("Not connect or connect timeout to google play service");
                        }
                    }
                }
                return this.f69705c;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this) {
                    this.f69705c = iBinder;
                    notifyAll();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.f69704b = true;
                this.f69705c = null;
            }
        }

        private GAIDClient() {
        }

        /* renamed from: a */
        static String m41127a(Context context) {
            Intent intent;
            if (!m41125c(context)) {
                C26586j.m41080a(f69702a, "Google play service is not available");
                return "";
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection();
            try {
                intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
            } catch (Exception e) {
                C26586j.m41078a(f69702a, "Query Google ADID failed ", e);
            } finally {
                context.unbindService(advertisingConnection);
            }
            if (!context.bindService(intent, advertisingConnection, 1)) {
                return "";
            }
            return new C26575a(advertisingConnection.m41124a()).m41123a();
        }

        /* renamed from: b */
        static boolean m41126b(Context context) {
            Intent intent;
            if (!m41125c(context)) {
                C26586j.m41080a(f69702a, "Google play service is not available");
                return false;
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection();
            try {
                intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
            } catch (Exception e) {
                C26586j.m41078a(f69702a, "Query Google isLimitAdTrackingEnabled failed ", e);
            } finally {
                context.unbindService(advertisingConnection);
            }
            if (!context.bindService(intent, advertisingConnection, 1)) {
                return false;
            }
            return new C26575a(advertisingConnection.m41124a()).m41122a(true);
        }

        /* renamed from: c */
        private static boolean m41125c(Context context) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 16384);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ot.pubsub.util.DeviceUtil$GAIDClient$a */
        /* loaded from: classes7.dex */
        public static final class C26575a implements IInterface {

            /* renamed from: a */
            private IBinder f69706a;

            public C26575a(IBinder iBinder) {
                this.f69706a = iBinder;
            }

            /* renamed from: a */
            public String m41123a() throws RemoteException {
                if (this.f69706a == null) {
                    return "";
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f69706a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f69706a;
            }

            /* renamed from: a */
            public boolean m41122a(boolean z) throws RemoteException {
                if (this.f69706a == null) {
                    return false;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f69706a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
