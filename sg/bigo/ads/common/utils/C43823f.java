package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;

/* renamed from: sg.bigo.ads.common.utils.f */
/* loaded from: classes10.dex */
public final class C43823f {
    /* renamed from: a */
    public static long m4900a(long j, int i) {
        char c;
        if (i == 2) {
            c = '\n';
        } else if (i == 3) {
            c = 20;
        } else if (i != 4) {
            return j;
        } else {
            c = 30;
        }
        return j >> c;
    }

    /* renamed from: b */
    public static void m4895b(@NonNull File file) {
        File[] listFiles;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        m4895b(file2);
                    } else {
                        m4899a(file2);
                    }
                }
            }
        }
        m4899a(file);
    }

    /* renamed from: c */
    public static String m4891c(String str) {
        return str + ".tmp";
    }

    /* renamed from: d */
    public static String m4889d(String str) {
        return str + ".tmp";
    }

    /* renamed from: a */
    public static long m4897a(String str, int i) {
        File file = new File(str);
        if (file.exists()) {
            return m4900a(file.length(), i);
        }
        return 0L;
    }

    /* renamed from: b */
    public static boolean m4894b(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: c */
    public static void m4890c(String str, String str2) {
        if (C43836q.m4837a((CharSequence) str) || C43836q.m4837a((CharSequence) str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public static boolean m4899a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m4893b(String str, String str2) {
        if (C43836q.m4837a((CharSequence) str) || C43836q.m4837a((CharSequence) str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    /* renamed from: c */
    public static boolean m4892c(File file) {
        boolean z = false;
        try {
            File parentFile = file.getParentFile();
            boolean mkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            if (file.exists()) {
                return mkdirs;
            }
            if (mkdirs) {
                if (file.createNewFile()) {
                    z = true;
                }
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4898a(java.lang.String r7) {
        /*
            java.lang.String r0 = "FileUtils"
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            r7 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r3.read(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r2 = "ftyp"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r2 == 0) goto L31
            java.lang.String r2 = "moov"
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r2 == 0) goto L31
            java.lang.String r2 = "contains ftyp moov"
            r4 = 3
            sg.bigo.ads.common.p932t.C43782a.m5010a(r7, r4, r0, r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r7 = 1
        L31:
            r3.close()     // Catch: java.io.IOException -> L64
            goto L64
        L35:
            r7 = move-exception
            r2 = r3
            goto L65
        L38:
            r2 = move-exception
            goto L40
        L3a:
            r7 = move-exception
            goto L65
        L3c:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "read file "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L35
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = " failed"
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L35
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L35
            sg.bigo.ads.common.p932t.C43782a.m5009a(r7, r0, r1)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L64
            goto L31
        L64:
            return r7
        L65:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.C43823f.m4898a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m4896a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        boolean z = false;
        try {
            boolean mkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists()) {
                return mkdirs;
            }
            if (mkdirs) {
                if (file2.createNewFile()) {
                    z = true;
                }
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }
}
