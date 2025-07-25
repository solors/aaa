package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p148zx;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.zx.IL */
/* loaded from: classes3.dex */
public class C6488IL {
    /* renamed from: IL */
    public static File m91770IL(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    /* renamed from: bX */
    public static File m91769bX(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    /* renamed from: bg */
    public static long m91767bg(String str, String str2) {
        File m91769bX = m91769bX(str, str2);
        if (m91769bX.exists()) {
            return m91769bX.length();
        }
        File m91770IL = m91770IL(str, str2);
        if (m91770IL.exists()) {
            return m91770IL.length();
        }
        return 0L;
    }

    /* renamed from: bg */
    public static void m91768bg(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
