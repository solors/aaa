package com.pgl.ssdk;

import java.io.BufferedInputStream;

/* renamed from: com.pgl.ssdk.d0 */
/* loaded from: classes7.dex */
public class C26624d0 {
    /* renamed from: a */
    private static void m40884a(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
    }

    /* renamed from: a */
    private static String m40886a(BufferedInputStream bufferedInputStream) {
        int read;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
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
        } while (read >= 4096);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m40885a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.flush()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r1.waitFor()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            java.lang.String r5 = m40886a(r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r0 = r5
            goto L6b
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            r3 = r0
        L42:
            r0 = r2
            goto L4b
        L44:
            r3 = r0
            goto L5e
        L46:
            r5 = move-exception
            goto L4a
        L48:
            r5 = move-exception
            r1 = r0
        L4a:
            r3 = r0
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            throw r5
        L5b:
            r1 = r0
        L5c:
            r2 = r0
            r3 = r2
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63
        L63:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L68
        L68:
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1.destroy()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.C26624d0.m40885a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
        if (r9.length() == 0) goto L26;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.String m40887a(android.content.Context r9) {
        /*
            java.lang.Class<com.pgl.ssdk.d0> r0 = com.pgl.ssdk.C26624d0.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r1.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld3
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "/dic"
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld3
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Ld3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L4f
            java.lang.String r2 = "chmod 777 "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Ld3
            m40885a(r2)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = m40885a(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r3 = "chmod 600 "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> Ld3
            m40885a(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L4f
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Ld3
            if (r3 <= 0) goto L4f
            monitor-exit(r0)
            return r2
        L4f:
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> Ld3
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "dic"
            java.io.InputStream r9 = r9.open(r2)     // Catch: java.lang.Throwable -> Ld3
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Ld3
            r2.<init>()     // Catch: java.lang.Throwable -> Ld3
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> Ld3
        L66:
            r5 = 0
            int r6 = r9.read(r4, r5, r3)     // Catch: java.lang.Throwable -> Ld3
            r7 = -1
            if (r6 == r7) goto L81
            java.lang.String r7 = "dic"
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.lang.Throwable -> Ld3
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> Ld3
            m40884a(r4, r6, r7)     // Catch: java.lang.Throwable -> Ld3
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> Ld3
            goto L66
        L81:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld3
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Ld3
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> Ld3
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld3
            r9.close()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r9 = "chmod 777 "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r9 = r9.concat(r2)     // Catch: java.lang.Throwable -> Ld3
            m40885a(r9)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r9 = m40885a(r1)     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto La9
            int r2 = r9.length()     // Catch: java.lang.Throwable -> Ld3
            if (r2 != 0) goto Lc5
        La9:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "rw"
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> Ld3
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Ld3
            r3 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> Ld3
            r3 = 16
            r9.seek(r3)     // Catch: java.lang.Throwable -> Ld3
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld3
            r9.close()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r9 = m40885a(r1)     // Catch: java.lang.Throwable -> Ld3
        Lc5:
            java.lang.String r2 = "chmod 600 "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Ld3
            m40885a(r1)     // Catch: java.lang.Throwable -> Ld3
            goto Ld5
        Ld3:
            java.lang.String r9 = "0[<!>]EXCEPTION[<!>]"
        Ld5:
            if (r9 == 0) goto Ldd
            int r1 = r9.length()     // Catch: java.lang.Throwable -> Le1
            if (r1 != 0) goto Ldf
        Ldd:
            java.lang.String r9 = "0[<!>]ERROR[<!>]"
        Ldf:
            monitor-exit(r0)
            return r9
        Le1:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.C26624d0.m40887a(android.content.Context):java.lang.String");
    }
}
