package sg.bigo.ads.common.p924l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.l.c */
/* loaded from: classes10.dex */
final class C43715c {

    /* renamed from: sg.bigo.ads.common.l.c$b */
    /* loaded from: classes10.dex */
    static final class C43717b implements IInterface {

        /* renamed from: a */
        private IBinder f114419a;

        public C43717b(IBinder iBinder) {
            this.f114419a = iBinder;
        }

        /* renamed from: a */
        public final String m5144a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f114419a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f114419a;
        }

        /* renamed from: b */
        public final Boolean m5143b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f114419a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: a */
    public static C43584a m5145a(Context context, long j) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC43716a serviceConnectionC43716a = new ServiceConnectionC43716a(j);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, serviceConnectionC43716a, 1)) {
                        try {
                            if (!serviceConnectionC43716a.f114417b) {
                                serviceConnectionC43716a.f114417b = true;
                                C43717b c43717b = new C43717b(serviceConnectionC43716a.f114418c.poll(serviceConnectionC43716a.f114416a, TimeUnit.MILLISECONDS));
                                String m5144a = c43717b.m5144a();
                                Boolean m5143b = c43717b.m5143b();
                                if (m5144a != null && m5143b != null) {
                                    return new C43584a(m5144a, m5143b.booleanValue());
                                }
                                context.unbindService(serviceConnectionC43716a);
                                return null;
                            }
                            throw new IllegalStateException();
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    throw new IOException("Google Play connection failed");
                } finally {
                    context.unbindService(serviceConnectionC43716a);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
    }

    /* renamed from: sg.bigo.ads.common.l.c$a */
    /* loaded from: classes10.dex */
    static final class ServiceConnectionC43716a implements ServiceConnection {

        /* renamed from: a */
        long f114416a;

        /* renamed from: b */
        boolean f114417b = false;

        /* renamed from: c */
        final LinkedBlockingQueue<IBinder> f114418c = new LinkedBlockingQueue<>(1);

        public ServiceConnectionC43716a(long j) {
            this.f114416a = j;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f114418c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
