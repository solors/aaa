package com.taurusx.tax.p583c.p590f.p591d;

import java.io.BufferedInputStream;

/* renamed from: com.taurusx.tax.c.f.d.c */
/* loaded from: classes7.dex */
public class C28297c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m38273a(java.lang.String r7) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            r2 = 2
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            r4 = 27
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            r4 = -128(0xffffffffffffff80, float:NaN)
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            r4 = 104(0x68, float:1.46E-43)
            r2[r5] = r4     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            r4 = -24
            r2[r6] = r4     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            h2.a r4 = com.taurusx.tax.C28162a.f73047a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L69
            java.lang.String r2 = r4.m23824a(r3, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L69
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7f
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L80
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L80
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L80
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r2.write(r7)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r7 = 10
            r2.write(r7)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r2.flush()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r2.close()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r1.waitFor()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            java.lang.String r7 = m38274a(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L82
            r2.close()     // Catch: java.io.IOException -> L54
        L54:
            r3.close()     // Catch: java.io.IOException -> L57
        L57:
            r1.destroy()
            return r7
        L5b:
            r7 = move-exception
            goto L5f
        L5d:
            r7 = move-exception
            r3 = r0
        L5f:
            r0 = r2
            goto L6f
        L61:
            r3 = r0
            goto L82
        L63:
            r7 = move-exception
            goto L6e
        L65:
            r7 = move-exception
            r1 = r0
            r3 = r1
            goto L6f
        L69:
            r1 = r0
            r2 = r1
            goto L81
        L6c:
            r7 = move-exception
            r1 = r0
        L6e:
            r3 = r0
        L6f:
            if (r0 == 0) goto L74
            r0.close()     // Catch: java.io.IOException -> L74
        L74:
            if (r3 == 0) goto L79
            r3.close()     // Catch: java.io.IOException -> L79
        L79:
            if (r1 == 0) goto L7e
            r1.destroy()
        L7e:
            throw r7
        L7f:
            r1 = r0
        L80:
            r2 = r0
        L81:
            r3 = r2
        L82:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L87
        L87:
            if (r3 == 0) goto L8c
            r3.close()     // Catch: java.io.IOException -> L8c
        L8c:
            if (r1 == 0) goto L91
            r1.destroy()
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28297c.m38273a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m38274a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[512];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb2.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
            }
        } while (read >= 512);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: Exception -> 0x00c6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c6, blocks: (B:13:0x005a, B:15:0x0062, B:19:0x006a, B:21:0x0070, B:24:0x007b, B:28:0x0083), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m38275a() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28297c.m38275a():boolean");
    }
}
