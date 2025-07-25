package p753k4;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileUtils.java */
/* renamed from: k4.b */
/* loaded from: classes6.dex */
public class C37386b {
    /* renamed from: a */
    public static String m18220a(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (context != null && !TextUtils.isEmpty(str)) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = context.getAssets().open(str);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            sb2.append(new String(bArr, 0, read));
                        }
                        inputStream.close();
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return sb2.toString();
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x005f -> B:71:0x0062). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m18219b(java.io.File r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r7 == 0) goto L7e
            boolean r1 = r7.exists()
            if (r1 != 0) goto Lf
            goto L7e
        Lf:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L67
        L1e:
            int r3 = r7.read(r1)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L67
            if (r3 <= 0) goto L2e
            java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L67
            r5 = 0
            r4.<init>(r1, r5, r3)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L67
            r0.append(r4)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L67
            goto L1e
        L2e:
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r1 = move-exception
            r1.printStackTrace()
        L36:
            r7.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L3a:
            r1 = move-exception
            goto L4b
        L3c:
            r0 = move-exception
            r7 = r1
            goto L68
        L3f:
            r7 = move-exception
            r6 = r1
            r1 = r7
            r7 = r6
            goto L4b
        L44:
            r0 = move-exception
            r7 = r1
            goto L69
        L47:
            r7 = move-exception
            r2 = r1
            r1 = r7
            r7 = r2
        L4b:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r1 = move-exception
            r1.printStackTrace()
        L58:
            if (r7 == 0) goto L62
            r7.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r7 = move-exception
            r7.printStackTrace()
        L62:
            java.lang.String r7 = r0.toString()
            return r7
        L67:
            r0 = move-exception
        L68:
            r1 = r2
        L69:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r1 = move-exception
            r1.printStackTrace()
        L73:
            if (r7 == 0) goto L7d
            r7.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r7 = move-exception
            r7.printStackTrace()
        L7d:
            throw r0
        L7e:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p753k4.C37386b.m18219b(java.io.File):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0046 -> B:52:0x0049). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m18218c(java.io.File r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L29
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r2.write(r3)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r2.flush()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r1.close()     // Catch: java.io.IOException -> L19
            goto L1d
        L19:
            r3 = move-exception
            r3.printStackTrace()
        L1d:
            r2.close()     // Catch: java.io.IOException -> L45
            goto L49
        L21:
            r3 = move-exception
            goto L27
        L23:
            r3 = move-exception
            goto L2b
        L25:
            r3 = move-exception
            r2 = r0
        L27:
            r0 = r1
            goto L4b
        L29:
            r3 = move-exception
            r2 = r0
        L2b:
            r0 = r1
            goto L32
        L2d:
            r3 = move-exception
            r2 = r0
            goto L4b
        L30:
            r3 = move-exception
            r2 = r0
        L32:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L3f
            r0.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L3b:
            r3 = move-exception
            r3.printStackTrace()
        L3f:
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r2 = move-exception
            r2.printStackTrace()
        L49:
            return
        L4a:
            r3 = move-exception
        L4b:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r2 = move-exception
            r2.printStackTrace()
        L5f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p753k4.C37386b.m18218c(java.io.File, java.lang.String):void");
    }
}
