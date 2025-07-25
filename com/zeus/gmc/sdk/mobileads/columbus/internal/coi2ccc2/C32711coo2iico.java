package com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.C32571coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.util.gaid.AdvertisingIdInterface;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2.coo2iico */
/* loaded from: classes8.dex */
public class C32711coo2iico {
    private static final String c2oc2o = "AdvertisingIdHelper";
    private static final String cco22 = "00000000-0000-0000-0000-000000000000";
    private static C32711coo2iico cii2c2;
    private static final long ciii2coi2 = TimeUtils.ONE_HOUR_IN_MS;
    private boolean coo2iico = false;
    private String coi222o222 = "";
    private boolean c2oc2i = true;
    private long cioccoiococ = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    public static class C32712c2oc2i implements AdvertisingIdInterface {
        private IBinder coo2iico;

        C32712c2oc2i(IBinder iBinder) {
            this.coo2iico = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.coo2iico;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.util.gaid.AdvertisingIdInterface
        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.coo2iico.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.util.gaid.AdvertisingIdInterface
        public boolean isLimitAdTrackingEnabled(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z2 = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.coo2iico.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
            } catch (SecurityException e) {
                MLog.m25888e("stacktrace_tag", "stackerror:", e);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
            return z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public class RunnableC32713coi222o222 implements Runnable {
        RunnableC32713coi222o222() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = GlobalHolder.getApplicationContext();
            if (applicationContext != null) {
                ServiceConnectionC32709c2oc2i coi222o222 = C32711coo2iico.coi222o222(applicationContext);
                if (coi222o222 == null) {
                    C32711coo2iico.this.coi222o222();
                    return;
                }
                boolean z = false;
                String str = null;
                try {
                } catch (IllegalArgumentException unused) {
                } catch (Exception e) {
                    MLog.m25888e("stacktrace_tag", "stackerror:", e);
                }
                try {
                    try {
                        AdvertisingIdInterface advertisingIdInterface = (AdvertisingIdInterface) C32711coo2iico.coo2iico(coi222o222.coo2iico());
                        str = advertisingIdInterface.getId();
                        z = advertisingIdInterface.isLimitAdTrackingEnabled(false);
                        applicationContext.unbindService(coi222o222);
                    } catch (Exception e2) {
                        MLog.m25888e("stacktrace_tag", "stackerror:", e2);
                        applicationContext.unbindService(coi222o222);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C32711coo2iico.this.coi222o222 = str;
                        C32711coo2iico.this.c2oc2i = z;
                        C32710coi222o222.coo2iico(str);
                        C32710coi222o222.coo2iico(z);
                    }
                    C32711coo2iico.this.coi222o222();
                } catch (Throwable th) {
                    try {
                        applicationContext.unbindService(coi222o222);
                    } catch (IllegalArgumentException unused2) {
                    } catch (Exception e3) {
                        MLog.m25888e("stacktrace_tag", "stackerror:", e3);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi2ccc2.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    public class C32714coo2iico extends AbstractRunnableC32566c2oc2o {
        C32714coo2iico(String str, String str2) {
            super(str, str2);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() {
            C32711coo2iico.this.coi222o222();
        }
    }

    private C32711coo2iico() {
    }

    private static boolean c2oc2i(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (Exception e) {
            MLog.m25888e("stacktrace_tag", "stackerror:", e);
            return false;
        }
    }

    private void ciii2coi2() {
        GlobalHolder.getUIHandler().postDelayed(new C32714coo2iico(c2oc2o, "startTimer"), 500L);
    }

    public static C32711coo2iico cioccoiococ() {
        if (cii2c2 == null) {
            cii2c2 = new C32711coo2iico();
        }
        return cii2c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ServiceConnectionC32709c2oc2i coi222o222(Context context) {
        ServiceConnectionC32709c2oc2i serviceConnectionC32709c2oc2i;
        Intent intent;
        if (c2oc2i(context)) {
            try {
                serviceConnectionC32709c2oc2i = new ServiceConnectionC32709c2oc2i();
                intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
            } catch (SecurityException e) {
                MLog.m25888e("stacktrace_tag", "stackerror:", e);
                return null;
            } catch (Exception e2) {
                MLog.m25888e("stacktrace_tag", "stackerror:", e2);
            }
            if (context.bindService(intent, serviceConnectionC32709c2oc2i, 1)) {
                return serviceConnectionC32709c2oc2i;
            }
            return null;
        }
        return null;
    }

    public void c2oc2o() {
        this.coi222o222 = C32710coi222o222.coo2iico();
        this.c2oc2i = C32710coi222o222.coi222o222();
        if (!this.coo2iico) {
            coo2iico();
        }
    }

    public boolean cco22() {
        if (!TextUtils.isEmpty(c2oc2i()) && !"00000000-0000-0000-0000-000000000000".equals(c2oc2i())) {
            return true;
        }
        return false;
    }

    public boolean cii2c2() {
        if (System.currentTimeMillis() - this.cioccoiococ > ciii2coi2) {
            this.cioccoiococ = System.currentTimeMillis();
            coo2iico();
        }
        if (C32571coo2iico.c2oc2o() != 0) {
            return false;
        }
        if (!this.coo2iico && !AndroidUtils.isMainThread()) {
            synchronized (c2oc2o) {
                if (!this.coo2iico) {
                    try {
                        ciii2coi2();
                        c2oc2o.wait();
                    } catch (Exception e) {
                        MLog.m25888e("stacktrace_tag", "stack error:", e);
                    }
                }
            }
        }
        return this.c2oc2i;
    }

    public String c2oc2i() {
        if (TextUtils.isEmpty(this.coi222o222)) {
            this.coi222o222 = C32710coi222o222.coo2iico();
        }
        if (C32571coo2iico.c2oc2o() == 2) {
            return this.coi222o222;
        }
        return this.c2oc2i ? "" : this.coi222o222;
    }

    public static IInterface coo2iico(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof AdvertisingIdInterface)) ? new C32712c2oc2i(iBinder) : queryLocalInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void coi222o222() {
        try {
            synchronized (c2oc2o) {
                this.coo2iico = true;
                c2oc2o.notifyAll();
            }
        } catch (Exception e) {
            MLog.m25888e("stacktrace_tag", "stackerror:", e);
        }
    }

    private void coo2iico() {
        C32465cioc2.cioccoiococ.execute(new RunnableC32713coi222o222());
    }
}
