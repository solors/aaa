package com.taurusx.tax.p606j;

import com.taurusx.tax.C28162a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* renamed from: com.taurusx.tax.j.g */
/* loaded from: classes7.dex */
public final class C28520g {
    static {
        C28162a.f73047a.m23824a(new byte[]{-83, 124, -121, 112, -66, 97, -126, 121}, new byte[]{-21, 21});
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:9:0x000a, B:11:0x0010, B:18:0x0023, B:15:0x001a), top: B:26:0x000a }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.io.File m38008a(java.io.File r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Class<com.taurusx.tax.j.g> r0 = com.taurusx.tax.p606j.C28520g.class
            monitor-enter(r0)
            r1 = 0
            if (r4 != 0) goto L8
            monitor-exit(r0)
            return r1
        L8:
            if (r3 == 0) goto L18
            boolean r2 = r3.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r3 = move-exception
            goto L2b
        L18:
            if (r3 != 0) goto L20
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L20:
            r2 = r1
        L21:
            if (r5 == 0) goto L2d
            boolean r3 = m38009a(r2)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L2d
            monitor-exit(r0)
            return r1
        L2b:
            monitor-exit(r0)
            throw r3
        L2d:
            monitor-exit(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.C28520g.m38008a(java.io.File, java.lang.String, boolean):java.io.File");
    }

    /* renamed from: b */
    public static String m38006b(File file) {
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (Error | Exception unused) {
                        try {
                            fileInputStream.close();
                        } catch (Error | Exception unused2) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Error | Exception unused3) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        try {
                            fileInputStream2.close();
                        } catch (Error | Exception unused4) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Error | Exception unused5) {
                        }
                        throw th;
                    }
                }
                String sb3 = sb2.toString();
                try {
                    fileInputStream.close();
                } catch (Error | Exception unused6) {
                }
                try {
                    bufferedReader.close();
                } catch (Error | Exception unused7) {
                }
                return sb3;
            } catch (Error | Exception unused8) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Error | Exception unused9) {
            bufferedReader = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    /* renamed from: a */
    public static boolean m38009a(File file) {
        if (!file.exists()) {
            if (!file.createNewFile()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m38007a(String str, File file, String str2, boolean z) {
        byte[] bytes = str.getBytes();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(m38008a(file, str2, true), z);
                try {
                    fileOutputStream2.write(bytes);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Error | Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        fileOutputStream.close();
                    } catch (Error | Exception unused2) {
                    }
                    throw th;
                }
            } catch (Error | Exception unused3) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error | Exception unused4) {
        }
    }
}
