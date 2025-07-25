package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.m7 */
/* loaded from: classes3.dex */
public final class C10048m7 {

    /* renamed from: a */
    public boolean f22612a;

    /* renamed from: b */
    public final ConnectivityManager f22613b;

    /* renamed from: c */
    public final C10049a f22614c;

    /* renamed from: com.chartboost.sdk.impl.m7$a */
    /* loaded from: classes3.dex */
    public static final class C10049a extends ConnectivityManager.NetworkCallback {
        public C10049a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            if (r3.hasCapability(12) == true) goto L5;
         */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAvailable(android.net.Network r3) {
            /*
                r2 = this;
                java.lang.String r0 = "network"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                com.chartboost.sdk.impl.m7 r0 = com.chartboost.sdk.impl.C10048m7.this
                android.net.ConnectivityManager r0 = com.chartboost.sdk.impl.C10048m7.m81099a(r0)
                android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r3)
                com.chartboost.sdk.impl.m7 r0 = com.chartboost.sdk.impl.C10048m7.this
                if (r3 == 0) goto L1d
                r1 = 12
                boolean r3 = r3.hasCapability(r1)
                r1 = 1
                if (r3 != r1) goto L1d
                goto L1e
            L1d:
                r1 = 0
            L1e:
                com.chartboost.sdk.impl.C10048m7.m81098a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C10048m7.C10049a.onAvailable(android.net.Network):void");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C10048m7.this.f22612a = false;
        }
    }

    public C10048m7(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f22613b = (ConnectivityManager) systemService;
        this.f22614c = new C10049a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r0.hasCapability(12) == true) goto L5;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m81097b() {
        /*
            r4 = this;
            android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
            r0.<init>()
            r1 = 12
            android.net.NetworkRequest$Builder r0 = r0.addCapability(r1)
            android.net.NetworkRequest r0 = r0.build()
            android.net.ConnectivityManager r2 = r4.f22613b
            com.chartboost.sdk.impl.m7$a r3 = r4.f22614c
            r2.registerNetworkCallback(r0, r3)
            android.net.ConnectivityManager r0 = r4.f22613b
            android.net.Network r0 = r0.getActiveNetwork()
            android.net.ConnectivityManager r2 = r4.f22613b
            android.net.NetworkCapabilities r0 = r2.getNetworkCapabilities(r0)
            if (r0 == 0) goto L2c
            boolean r0 = r0.hasCapability(r1)
            r1 = 1
            if (r0 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r4.f22612a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C10048m7.m81097b():void");
    }

    /* renamed from: c */
    public final void m81096c() {
        this.f22613b.unregisterNetworkCallback(this.f22614c);
    }

    /* renamed from: a */
    public final boolean m81100a() {
        return this.f22612a;
    }
}
