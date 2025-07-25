package sg.bigo.ads.common.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.m */
/* loaded from: classes10.dex */
public final class C43830m {
    /* renamed from: a */
    public static String m4866a(String str) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append(random.nextInt(99999999));
        sb2.append(random.nextInt(99999999));
        while (sb2.length() < 16) {
            sb2.append('0');
        }
        if (sb2.length() > 16) {
            sb2.delete(16, sb2.length());
        }
        String m4865b = m4865b(str + ((Object) sb2));
        if (C43836q.m4837a((CharSequence) m4865b)) {
            C43782a.m5009a(0, SameMD5.TAG, "md5WithSalt is empty!");
            return m4865b;
        }
        char[] cArr = new char[48];
        for (int i = 0; i < 48; i++) {
            int i2 = i / 3;
            int i3 = i % 3;
            if (i3 != 0) {
                if (i3 != 1) {
                    cArr[i] = m4865b.charAt((i2 * 2) + 1);
                } else {
                    cArr[i] = sb2.charAt(i2);
                }
            } else {
                cArr[i] = m4865b.charAt(i2 * 2);
            }
        }
        String str2 = new String(cArr);
        C43782a.m5010a(0, 3, SameMD5.TAG, "getMD5MixSalt, val=" + str + ", salt=" + ((Object) sb2) + ", md5WithSalt=" + m4865b + ", md5MixSalt=" + str2);
        return str2;
    }

    /* renamed from: b */
    private static String m4865b(String str) {
        byte[] bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str.getBytes("UTF-8"));
            bArr = messageDigest.digest();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArr = null;
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                sb2.append(0);
            }
            sb2.append(Integer.toHexString(i));
        }
        return sb2.toString().toLowerCase();
    }
}
