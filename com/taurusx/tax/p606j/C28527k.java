package com.taurusx.tax.p606j;

import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.k */
/* loaded from: classes7.dex */
public class C28527k {

    /* renamed from: a */
    public static final String f73972a = C28162a.f73047a.m23824a(new byte[]{-36, -116, -27, -105, -31, -79, -31, -112, -16, -125, -8, -73, -31, -117, -7}, new byte[]{-107, -30});

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002c: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:14:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m38000a(java.io.InputStream r3, java.nio.charset.Charset r4) {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
        L14:
            if (r2 == 0) goto L1e
            r3.append(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            goto L14
        L1e:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Error -> L2e java.lang.Exception -> L30
            r1.close()     // Catch: java.io.IOException -> L26
            goto L2a
        L26:
            r4 = move-exception
            r4.printStackTrace()
        L2a:
            return r3
        L2b:
            r3 = move-exception
            r0 = r1
            goto L4f
        L2e:
            r3 = move-exception
            goto L38
        L30:
            r3 = move-exception
            goto L38
        L32:
            r3 = move-exception
            goto L4f
        L34:
            r3 = move-exception
            goto L37
        L36:
            r3 = move-exception
        L37:
            r1 = r0
        L38:
            java.lang.String r4 = com.taurusx.tax.p606j.C28527k.f73972a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            com.taurusx.tax.log.LogUtil.m37904e(r4, r2)     // Catch: java.lang.Throwable -> L2b
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r3.printStackTrace()
        L4e:
            return r0
        L4f:
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r4 = move-exception
            r4.printStackTrace()
        L59:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.C28527k.m38000a(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
