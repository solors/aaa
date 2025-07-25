package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.coo2iico */
/* loaded from: classes8.dex */
public class C32643coo2iico {
    private static final String coo2iico = "FileUtil";

    /* JADX WARN: Removed duplicated region for block: B:57:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String coi222o222(java.io.File r8) {
        /*
            java.lang.String r0 = "close file inputStream had exception"
            java.lang.String r1 = "readStringFromFile"
            java.lang.String r2 = "FileUtil"
            android.util.Log.d(r2, r1)
            r1 = 0
            if (r8 == 0) goto L79
            boolean r3 = r8.exists()
            if (r3 == 0) goto L79
            boolean r3 = r8.isDirectory()
            if (r3 == 0) goto L19
            goto L79
        L19:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            long r4 = r8.length()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L32
            r3.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r8 = move-exception
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r0, r8)
        L31:
            return r1
        L32:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L4e
            int r8 = (int) r4
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            int r4 = r3.read(r8)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r6 = 0
            r5.<init>(r8, r6, r4)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r3.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r8 = move-exception
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r0, r8)
        L4d:
            return r5
        L4e:
            r3.close()     // Catch: java.io.IOException -> L52
            goto L6a
        L52:
            r8 = move-exception
            goto L67
        L54:
            r8 = move-exception
            goto L6e
        L56:
            r8 = move-exception
            goto L5c
        L58:
            r8 = move-exception
            goto L6d
        L5a:
            r8 = move-exception
            r3 = r1
        L5c:
            java.lang.String r4 = "stackError"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r4, r8)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L52
            goto L6a
        L67:
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r0, r8)
        L6a:
            return r1
        L6b:
            r8 = move-exception
            r1 = r3
        L6d:
            r3 = r1
        L6e:
            if (r3 == 0) goto L78
            r3.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r1 = move-exception
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r2, r0, r1)
        L78:
            throw r8
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico.coi222o222(java.io.File):java.lang.String");
    }

    public static void coo2iico(File file, long j) {
        File[] listFiles;
        if (file == null || !file.exists() || file.isFile() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (System.currentTimeMillis() - file2.lastModified() > j) {
                file2.delete();
            }
        }
    }

    public static long coo2iico(File file) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException e) {
            MLog.m25888e(coo2iico, "stackerror:", e);
            return 0L;
        }
    }

    public static boolean coo2iico() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean coo2iico(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && !file.isDirectory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String coo2iico(java.lang.String r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L79
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf
            goto L79
        Lf:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L38
            boolean r2 = r0.delete()
            if (r2 != 0) goto L38
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
        L38:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r5.write(r6)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r5.flush()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r5.close()     // Catch: java.io.IOException -> L4f
            goto L6a
        L4f:
            r5 = move-exception
            r5.printStackTrace()
            goto L6a
        L54:
            r6 = move-exception
            goto L6e
        L56:
            r6 = move-exception
            goto L5d
        L58:
            r5 = move-exception
            r6 = r5
            goto L6d
        L5b:
            r6 = move-exception
            r5 = r1
        L5d:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r5 = move-exception
            r5.printStackTrace()
        L6a:
            return r1
        L6b:
            r6 = move-exception
            r1 = r5
        L6d:
            r5 = r1
        L6e:
            if (r5 == 0) goto L78
            r5.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r5 = move-exception
            r5.printStackTrace()
        L78:
            throw r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico.coo2iico(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:22:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[Catch: IOException -> 0x003a, TRY_LEAVE, TryCatch #0 {IOException -> 0x003a, blocks: (B:24:0x0032, B:26:0x0037), top: B:31:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object coi222o222(java.io.InputStream r6) {
        /*
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.Object r0 = r1.readObject()     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L2c
            r1.close()     // Catch: java.io.IOException -> L12
            if (r6 == 0) goto L12
            r6.close()     // Catch: java.io.IOException -> L12
        L12:
            return r0
        L13:
            r2 = move-exception
            goto L1a
        L15:
            r1 = move-exception
            goto L30
        L17:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L1a:
            java.lang.String r3 = "FileUtil"
            java.lang.String r4 = "stackError"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.io.IOException -> L2b
        L26:
            if (r6 == 0) goto L2b
            r6.close()     // Catch: java.io.IOException -> L2b
        L2b:
            return r0
        L2c:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L30:
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.io.IOException -> L3a
        L35:
            if (r6 == 0) goto L3a
            r6.close()     // Catch: java.io.IOException -> L3a
        L3a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico.coi222o222(java.io.InputStream):java.lang.Object");
    }

    public static void coo2iico(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            coo2iico(inputStream);
                            coo2iico(fileOutputStream);
                            return;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    coo2iico(inputStream);
                    coo2iico(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    coo2iico(inputStream);
                    coo2iico(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static void coo2iico(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void coo2iico(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean coo2iico(java.lang.Object r3, java.io.OutputStream r4) {
        /*
            r0 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.writeObject(r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r1.flush()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            r3 = 1
            r1.close()     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L2d
            goto L2a
        L13:
            r3 = move-exception
            goto L2f
        L15:
            r3 = move-exception
            r0 = r1
            goto L1b
        L18:
            r3 = move-exception
            goto L2e
        L1a:
            r3 = move-exception
        L1b:
            java.lang.String r1 = "FileUtil"
            java.lang.String r2 = "stackError"
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            r3 = 0
            if (r0 == 0) goto L28
            r0.close()     // Catch: java.lang.Exception -> L2d
        L28:
            if (r4 == 0) goto L2d
        L2a:
            r4.close()     // Catch: java.lang.Exception -> L2d
        L2d:
            return r3
        L2e:
            r1 = r0
        L2f:
            if (r1 == 0) goto L34
            r1.close()     // Catch: java.lang.Exception -> L39
        L34:
            if (r4 == 0) goto L39
            r4.close()     // Catch: java.lang.Exception -> L39
        L39:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico.coo2iico(java.lang.Object, java.io.OutputStream):boolean");
    }
}
