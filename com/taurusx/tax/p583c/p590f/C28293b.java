package com.taurusx.tax.p583c.p590f;

import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.c.f.b */
/* loaded from: classes7.dex */
public class C28293b {
    static {
        C28162a.f73047a.m23824a(new byte[]{-10, 60, -49, 39, -53, 1, -53, 32, -38, 51, -46, 7, -53, 59, -45}, new byte[]{-65, 82});
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0044: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:31:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m38286a(java.io.InputStream r3, java.nio.charset.Charset r4) {
        /*
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f java.lang.Error -> L31 java.lang.Exception -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Error -> L31 java.lang.Exception -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            r4.<init>(r1)     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
        L14:
            if (r2 == 0) goto L1e
            r3.append(r2)     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            goto L14
        L1e:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Error -> L2b java.lang.Exception -> L2d java.lang.Throwable -> L43
            r1.close()     // Catch: java.io.IOException -> L26
            goto L2a
        L26:
            r4 = move-exception
            r4.printStackTrace()
        L2a:
            return r3
        L2b:
            r3 = move-exception
            goto L35
        L2d:
            r3 = move-exception
            goto L35
        L2f:
            r3 = move-exception
            goto L45
        L31:
            r3 = move-exception
            goto L34
        L33:
            r3 = move-exception
        L34:
            r1 = r0
        L35:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r3.printStackTrace()
        L42:
            return r0
        L43:
            r3 = move-exception
            r0 = r1
        L45:
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.io.IOException -> L4b
            goto L4f
        L4b:
            r4 = move-exception
            r4.printStackTrace()
        L4f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.C28293b.m38286a(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
