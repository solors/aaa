package com.bytedance.sdk.component.p275zx.p277bX.p279bX;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: com.bytedance.sdk.component.zx.bX.bX.bX */
/* loaded from: classes3.dex */
public class C7796bX {

    /* renamed from: bg */
    private static final char[] f17011bg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: bg */
    public static String m87719bg(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return m87718bg(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static String m87718bg(byte[] bArr) {
        if (bArr != null) {
            return m87717bg(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: bg */
    public static String m87717bg(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = bArr[i5 + i] & 255;
                    int i7 = i4 + 1;
                    char[] cArr2 = f17011bg;
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
}
