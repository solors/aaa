package com.taurusx.tax.p606j.p607a0.p609e;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p607a0.C28467a;
import java.util.concurrent.LinkedBlockingQueue;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.a0.e.a */
/* loaded from: classes7.dex */
public class C28475a extends C28467a {

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f73909b;

    /* renamed from: com.taurusx.tax.j.a0.e.a$a */
    /* loaded from: classes7.dex */
    public class ServiceConnectionC28476a implements ServiceConnection {
        public ServiceConnectionC28476a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-47, -59, -48, -42, -48, -41, -35}, new byte[]{-91, -92}), stringFogImpl.m23824a(new byte[]{-93, -101, -97, -112, -66, -125, -91, -106, -87, -74, -93, -101, -94, -112, -81, -127, -87, -111, -10, -43}, new byte[]{-52, -11}));
            try {
                C28475a.this.f73909b.offer(iBinder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{70, 21, 71, 6, 71, 7, 74}, new byte[]{50, 116}), stringFogImpl.m23824a(new byte[]{-79, 39, -115, 44, -84, 63, -73, 42, -69, 13, -73, 58, -67, 38, -80, 39, -69, 42, -86, 44, -70, 115, -2}, new byte[]{-34, 73}));
        }
    }

    public C28475a(Context context) {
        super(context);
        this.f73909b = new LinkedBlockingQueue<>(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0389 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taurusx.tax.p606j.p607a0.C28467a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taurusx.tax.p606j.p607a0.C28469c mo38066a() {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.p607a0.p609e.C28475a.mo38066a():com.taurusx.tax.j.a0.c");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|4|(4:8|9|10|(9:12|(1:14)|15|16|17|18|19|20|21))|34|17|18|19|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013d, code lost:
        r0.printStackTrace();
        r12.recycle();
        r13.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014d, code lost:
        r12.recycle();
        r13.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0153, code lost:
        throw r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m38069a(com.taurusx.tax.p606j.p607a0.p609e.InterfaceC28477b r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.p607a0.p609e.C28475a.m38069a(com.taurusx.tax.j.a0.e.b, java.lang.String):java.lang.String");
    }
}
