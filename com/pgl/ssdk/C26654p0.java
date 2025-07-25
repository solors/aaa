package com.pgl.ssdk;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.p0 */
/* loaded from: classes7.dex */
public class C26654p0 {
    /* renamed from: a */
    public static boolean m40796a(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m40795a(String str, int i) {
        C26656q0.m40791a("android.os.FileUtils", str, Integer.valueOf(i), -1, -1);
    }

    /* renamed from: a */
    public static void m40797a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m40794a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
