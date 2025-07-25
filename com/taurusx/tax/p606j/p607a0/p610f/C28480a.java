package com.taurusx.tax.p606j.p607a0.p610f;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p607a0.C28467a;
import java.util.concurrent.LinkedBlockingQueue;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.a0.f.a */
/* loaded from: classes7.dex */
public class C28480a extends C28467a {

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f73912b;

    /* renamed from: com.taurusx.tax.j.a0.f.a$a */
    /* loaded from: classes7.dex */
    public class ServiceConnectionC28481a implements ServiceConnection {
        public ServiceConnectionC28481a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{6, 53, 7, 38, 7, 39, 10}, new byte[]{114, 84}), stringFogImpl.m23824a(new byte[]{60, 58, 0, 49, 33, 34, 58, 55, 54, 23, 60, 58, 61, 49, 48, 32, 54, 48}, new byte[]{83, 84}));
            try {
                C28480a.this.f73912b.offer(iBinder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{46, -23, 47, -6, 47, -5, 34}, new byte[]{90, -120}), stringFogImpl.m23824a(new byte[]{-98, -6, -94, -15, -125, -30, -104, -9, -108, -48, -104, -25, -110, -5, -97, -6, -108, -9, -123, -15, -107, -82, -47}, new byte[]{-15, -108}));
        }
    }

    public C28480a(Context context) {
        super(context);
        this.f73912b = new LinkedBlockingQueue<>(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x041e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taurusx.tax.p606j.p607a0.C28467a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taurusx.tax.p606j.p607a0.C28469c mo38066a() {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.p607a0.p610f.C28480a.mo38066a():com.taurusx.tax.j.a0.c");
    }
}
