package com.bytedance.sdk.component.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: com.bytedance.sdk.component.utils.zx */
/* loaded from: classes3.dex */
public class C7768zx {

    /* renamed from: bg */
    private static final char[] f16944bg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: bg */
    public static String m87787bg(byte[] bArr) {
        if (bArr != null) {
            return m87786bg(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: bg */
    public static String m87786bg(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = bArr[i5 + i] & 255;
                    int i7 = i4 + 1;
                    char[] cArr2 = f16944bg;
                    cArr[i4] = cArr2[i6 >> 4];
                    i4 = i7 + 1;
                    cArr[i7] = cArr2[i6 & 15];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: bg */
    public static String m87789bg(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String m87787bg = m87787bg(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return m87787bg;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    /* renamed from: bg */
    public static String m87788bg(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return m87787bg(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
