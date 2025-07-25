package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sn0 extends qd1 {

    /* renamed from: d */
    private static final boolean f85314d;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0017, code lost:
        if (r0.intValue() >= 9) goto L11;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = kotlin.text.C37686h.m16673m(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L24
            goto L23
        L1a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L24
            r0.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L24
        L23:
            r1 = 1
        L24:
            com.yandex.mobile.ads.impl.sn0.f85314d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sn0.<clinit>():void");
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    /* renamed from: a */
    public final void mo27988a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<hi1> protocols) {
        int m17154x;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((hi1) obj) != hi1.f80077d) {
                arrayList.add(obj);
            }
        }
        m17154x = C37566w.m17154x(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m17154x);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hi1) it.next()).toString());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    @Nullable
    /* renamed from: b */
    public final String mo27986b(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (Intrinsics.m17075f(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
