package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.utils.ldr */
/* loaded from: classes3.dex */
public class C7756ldr {

    /* renamed from: com.bytedance.sdk.component.utils.ldr$1 */
    /* loaded from: classes3.dex */
    static class C77571 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.ldr$bg */
    /* loaded from: classes3.dex */
    private static final class C7758bg implements Comparator<File> {
        private C7758bg() {
        }

        /* synthetic */ C7758bg(C77571 c77571) {
            this();
        }

        /* renamed from: bg */
        private int m87819bg(long j, long j2) {
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* renamed from: bg */
        public int compare(File file, File file2) {
            return m87819bg(file.lastModified(), file2.lastModified());
        }
    }

    /* renamed from: IL */
    private static String m87827IL(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    /* renamed from: bX */
    public static void m87825bX(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                try {
                    file.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m87825bX(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            try {
                file.delete();
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: bg */
    public static File m87822bg(Context context, boolean z, String str, String str2) {
        String m87827IL = m87827IL(context);
        if (z) {
            str = m87824bg(context) + "-" + str;
        }
        if (m87827IL != null) {
            String str3 = File.separator;
            if (!m87827IL.endsWith(str3)) {
                m87827IL = m87827IL + str3;
            }
        }
        String str4 = m87827IL + str;
        File file = new File(str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str4, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] eqN(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L4b
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L4b
            boolean r1 = r7.exists()
            if (r1 == 0) goto L4b
            boolean r1 = r7.canRead()
            if (r1 == 0) goto L4b
            long r1 = r7.length()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4b
            long r1 = r7.length()     // Catch: java.lang.Throwable -> L47
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L47
            int r7 = r1.intValue()     // Catch: java.lang.Throwable -> L48
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L48
            int r3 = r2.read(r7)     // Catch: java.lang.Throwable -> L48
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L48
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L48
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            r2.close()     // Catch: java.lang.Throwable -> L42
        L42:
            return r7
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L47:
            r2 = r0
        L48:
            if (r2 == 0) goto L4b
            goto L43
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C7756ldr.eqN(java.io.File):byte[]");
    }

    private static void ldr(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
    }

    /* renamed from: zx */
    private static void m87820zx(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            ldr(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte readByte = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(readByte);
                randomAccessFile.close();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    /* renamed from: IL */
    public static void m87826IL(File file) throws IOException {
        if (file.exists()) {
            C7741PX.m87873bg("splashLoadAd", "update file modify time");
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            m87820zx(file);
            if (file.lastModified() < currentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    /* renamed from: bg */
    public static File m87823bg(Context context, boolean z, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = m87824bg(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = absolutePath + str2;
            }
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: bg */
    public static List<File> m87821bg(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new C7758bg(null));
            return asList;
        }
        return linkedList;
    }

    /* renamed from: bg */
    public static String m87824bg(Context context) {
        String m87802bg = C7764tuV.m87802bg(context);
        return (TextUtils.isEmpty(m87802bg) || !m87802bg.contains(":")) ? m87802bg : m87802bg.replace(":", "-");
    }
}
