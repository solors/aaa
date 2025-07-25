package com.mbridge.msdk.foundation.tools;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* compiled from: Util.java */
/* renamed from: com.mbridge.msdk.foundation.tools.ar */
/* loaded from: classes6.dex */
final class C22048ar {

    /* compiled from: Util.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.ar$a */
    /* loaded from: classes6.dex */
    private static class C22049a {

        /* renamed from: a */
        static final char[] f56948a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* renamed from: b */
        static final SecureRandom f56949b = new SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m51684a(File file) {
        try {
            if (file.exists()) {
                m51678d(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m51680b(File file) throws IOException {
        if (file.isFile()) {
            long length = file.length();
            if ((length >> 32) == 0) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                m51682a(file, bArr, i);
                return bArr;
            }
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m51679c(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && ((parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static void m51678d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m51678d(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m51682a(File file, byte[] bArr, int i) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = randomAccessFile.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                }
                i2 += read;
            } finally {
                m51685a(randomAccessFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m51681b() {
        byte[] bArr = new byte[16];
        C22049a.f56949b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = C22049a.f56948a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m51685a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m51686a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m51683a(File file, byte[] bArr) {
        File file2;
        try {
            String parent = file.getParent();
            file2 = new File(parent, file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (m51679c(file2)) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            m51685a(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        }
        return false;
    }
}
