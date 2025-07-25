package com.taurusx.tax.p606j.p607a0.p608d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p607a0.C28467a;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.a0.d.a */
/* loaded from: classes7.dex */
public class C28470a extends C28467a {

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f73905b;

    /* renamed from: com.taurusx.tax.j.a0.d.a$a */
    /* loaded from: classes7.dex */
    public class ServiceConnectionC28471a implements ServiceConnection {
        public ServiceConnectionC28471a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-29, 125, -30, 110, -30, 111, -17}, new byte[]{-105, 28}), stringFogImpl.m23824a(new byte[]{107, -71, 87, -78, 118, -95, 109, -76, 97, -108, 107, -71, 106, -78, 103, -93, 97, -77}, new byte[]{4, -41}));
            try {
                C28470a.this.f73905b.offer(iBinder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-2, 18, -1, 1, -1, 0, -14}, new byte[]{-118, 115}), stringFogImpl.m23824a(new byte[]{109, -85, 81, -96, 112, -77, 107, -90, 103, -127, 107, -74, 97, -86, 108, -85, 103, -90, 118, -96, 102, -1, 34}, new byte[]{2, -59}));
        }
    }

    public C28470a(Context context) {
        super(context);
        this.f73905b = new LinkedBlockingQueue<>(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taurusx.tax.p606j.p607a0.C28467a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taurusx.tax.p606j.p607a0.C28469c mo38066a() {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.p607a0.p608d.C28470a.mo38066a():com.taurusx.tax.j.a0.c");
    }

    /* renamed from: b */
    public boolean m38073b() {
        try {
            PackageManager packageManager = this.f73901a.getPackageManager();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            packageManager.getPackageInfo(stringFogImpl.m23824a(new byte[]{-7, -75, -9, -12, -14, -81, -5, -83, -1, -77, -76, -78, -19, -77, -2}, new byte[]{-102, -38}), 0);
            Intent intent = new Intent(stringFogImpl.m23824a(new byte[]{84, -51, 90, -116, 66, -51, 83, -53, 68, -116, 88, -46, 82, -52, 83, -57, 65, -53, 84, -57, 25, -19, 103, -25, 121, -21, 115, -15, 104, -15, 114, -16, 97, -21, 116, -25}, new byte[]{55, -94}));
            intent.setPackage(stringFogImpl.m23824a(new byte[]{-68, -113, -78, -50, -73, -107, -66, -105, -70, -119, -15, -120, -88, -119, -69}, new byte[]{-33, -32}));
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices == null) {
                return false;
            }
            if (queryIntentServices.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
