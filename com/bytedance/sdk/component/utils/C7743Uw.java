package com.bytedance.sdk.component.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.sdk.component.utils.Uw */
/* loaded from: classes3.dex */
public class C7743Uw {
    /* renamed from: IL */
    private static boolean m87867IL(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (m87865bg(file.getParentFile())) {
            try {
                return file.createNewFile();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: bg */
    public static List<File> m87861bg(String str, String str2) throws IOException {
        return m87860bg(str, str2, (String) null);
    }

    /* renamed from: bg */
    public static List<File> m87860bg(String str, String str2, String str3) throws IOException {
        return m87864bg(m87862bg(str), m87862bg(str2), str3);
    }

    /* renamed from: bg */
    public static List<File> m87864bg(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        try {
            if (m87866IL(str)) {
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (!name.contains("../") && !m87863bg(file2, arrayList, zipFile, nextElement, name)) {
                        return arrayList;
                    }
                }
            } else {
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement2 = entries.nextElement();
                    String name2 = nextElement2.getName();
                    if (!name2.contains("../") && name2.contains(str) && !m87863bg(file2, arrayList, zipFile, nextElement2, name2)) {
                        return arrayList;
                    }
                }
            }
            return arrayList;
        } finally {
            zipFile.close();
        }
    }

    /* renamed from: IL */
    private static boolean m87866IL(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m87863bg(java.io.File r2, java.util.List<java.io.File> r3, java.util.zip.ZipFile r4, java.util.zip.ZipEntry r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r6)
            r3.add(r0)
            boolean r2 = r5.isDirectory()
            if (r2 == 0) goto L13
            boolean r2 = m87865bg(r0)
            return r2
        L13:
            boolean r2 = m87867IL(r0)
            r3 = 0
            if (r2 != 0) goto L1b
            return r3
        L1b:
            r2 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4e
            java.io.InputStream r4 = r4.getInputStream(r5)     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L4b
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L49
        L33:
            int r5 = r0.read(r2)     // Catch: java.lang.Throwable -> L49
            r1 = -1
            if (r5 == r1) goto L3e
            r4.write(r2, r3, r5)     // Catch: java.lang.Throwable -> L49
            goto L33
        L3e:
            r0.close()
            r4.close()
            r6.close()
            r2 = 1
            return r2
        L49:
            r2 = move-exception
            goto L57
        L4b:
            r3 = move-exception
            r4 = r2
            goto L56
        L4e:
            r3 = move-exception
            r4 = r2
            r0 = r4
            goto L56
        L52:
            r3 = move-exception
            r4 = r2
            r6 = r4
            r0 = r6
        L56:
            r2 = r3
        L57:
            if (r0 == 0) goto L5c
            r0.close()
        L5c:
            if (r4 == 0) goto L61
            r4.close()
        L61:
            if (r6 == 0) goto L66
            r6.close()
        L66:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C7743Uw.m87863bg(java.io.File, java.util.List, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.lang.String):boolean");
    }

    /* renamed from: bg */
    private static boolean m87865bg(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    /* renamed from: bg */
    private static File m87862bg(String str) {
        if (m87866IL(str)) {
            return null;
        }
        return new File(str);
    }
}
