package com.bykv.p135vk.openvk.preload.geckox.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.d */
/* loaded from: classes3.dex */
public final class MD5Utils {

    /* renamed from: a */
    private static char[] f14128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m91217a(InputStream inputStream, String str) throws Exception {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                try {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 4096);
                            if (read == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        }
                        try {
                            byte[] digest = messageDigest.digest();
                            String m91216a = m91216a(digest, digest.length);
                            if (str.equals(m91216a)) {
                                return;
                            }
                            throw new RuntimeException("md5 check failed file: local md5:" + m91216a + " expect md5:" + str);
                        } catch (Exception e) {
                            throw new RuntimeException("md5 check failed:" + e.getMessage(), e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                    }
                } finally {
                    CloseableUtils.close(inputStream);
                }
            } catch (Exception e3) {
                throw new RuntimeException("md5 check failed:" + e3.getMessage(), e3);
            }
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    /* renamed from: a */
    private static String m91216a(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i2 = i << 1;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = bArr[i4] & 255;
                    int i6 = i3 + 1;
                    char[] cArr2 = f14128a;
                    cArr[i3] = cArr2[i5 >> 4];
                    i3 = i6 + 1;
                    cArr[i6] = cArr2[i5 & 15];
                }
                return new String(cArr, 0, i2);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
