package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.mbridge.msdk.foundation.tools.b */
/* loaded from: classes6.dex */
public final class AdvertisingIdClient {

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.b$a */
    /* loaded from: classes6.dex */
    public final class C22051a {

        /* renamed from: b */
        private final String f56953b;

        /* renamed from: c */
        private final boolean f56954c;

        C22051a(String str, boolean z) {
            this.f56953b = str;
            this.f56954c = z;
        }

        /* renamed from: a */
        public final String m51669a() {
            return this.f56953b;
        }

        /* renamed from: b */
        public final boolean m51668b() {
            return this.f56954c;
        }
    }

    /* renamed from: a */
    public final C22051a m51670a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC22052b serviceConnectionC22052b = new ServiceConnectionC22052b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, serviceConnectionC22052b, 1)) {
                    try {
                        try {
                            C22053c c22053c = new C22053c(serviceConnectionC22052b.m51667a());
                            return new C22051a(c22053c.m51666a(), c22053c.m51665a(true));
                        } catch (Exception e) {
                            throw e;
                        }
                    } finally {
                        context.unbindService(serviceConnectionC22052b);
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.b$c */
    /* loaded from: classes6.dex */
    private final class C22053c implements IInterface {

        /* renamed from: b */
        private IBinder f56959b;

        public C22053c(IBinder iBinder) {
            this.f56959b = iBinder;
        }

        /* renamed from: a */
        public final String m51666a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f56959b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable th) {
                try {
                    SameLogTool.m51824b("AdvertisingIdClient", th.getMessage());
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f56959b;
        }

        /* renamed from: a */
        public final boolean m51665a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z2 = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.f56959b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
            } finally {
                try {
                    return z2;
                } finally {
                }
            }
            return z2;
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.b$b */
    /* loaded from: classes6.dex */
    private final class ServiceConnectionC22052b implements ServiceConnection {

        /* renamed from: a */
        boolean f56955a;

        /* renamed from: c */
        private final LinkedBlockingQueue<IBinder> f56957c;

        private ServiceConnectionC22052b() {
            this.f56957c = new LinkedBlockingQueue<>(1);
            this.f56955a = false;
        }

        /* renamed from: a */
        public final IBinder m51667a() throws InterruptedException {
            if (!this.f56955a) {
                this.f56955a = true;
                return this.f56957c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f56957c.put(iBinder);
            } catch (InterruptedException e) {
                SameLogTool.m51824b("AdvertisingIdClient", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
