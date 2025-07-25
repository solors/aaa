package com.p552ot.pubsub.p555c;

import android.os.Build;
import com.p552ot.pubsub.util.C26586j;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: com.ot.pubsub.c.e */
/* loaded from: classes7.dex */
public class C26525e {

    /* renamed from: a */
    public static final String f69409a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiH0r18h2G+lOzZz0mSZT9liZY\r6ibWUv/biAioduf0zuRbWUYGb3pHobyCOaw2LpVnlf8CeCYtbRJhxL9skOyoU1Qa\rwGtoJzvVR4GbCo1MBTmZ8XThMprr0unRfzsu9GNV4+twciOdS2cNJB7INcwAYBFQ\r9vKpgXFoEjWRhIgwMwIDAQAB\r";

    /* renamed from: b */
    private static final String f69410b = "RsaUtils";

    /* renamed from: c */
    private static final String f69411c = "RSA/ECB/PKCS1Padding";

    /* renamed from: d */
    private static final String f69412d = "BC";

    /* renamed from: e */
    private static final String f69413e = "RSA";

    /* renamed from: a */
    public static byte[] m41327a(byte[] bArr) throws Exception {
        try {
            RSAPublicKey m41328a = m41328a(f69409a);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", f69412d);
            cipher.init(1, m41328a);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C26586j.m41073b(f69410b, "RsaUtils encrypt exception:", e);
            return null;
        }
    }

    /* renamed from: b */
    private static RSAPublicKey m41325b(byte[] bArr) throws Exception {
        return (RSAPublicKey) KeyFactory.getInstance(f69413e).generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* renamed from: a */
    public static byte[] m41326a(byte[] bArr, byte[] bArr2) {
        try {
            RSAPublicKey m41325b = m41325b(bArr);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, m41325b);
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            C26586j.m41073b(f69410b, "RsaUtil encrypt exception:", e);
            return null;
        }
    }

    /* renamed from: a */
    private static RSAPublicKey m41328a(String str) throws Exception {
        KeyFactory keyFactory;
        if (Build.VERSION.SDK_INT >= 28) {
            keyFactory = KeyFactory.getInstance(f69413e);
        } else {
            keyFactory = KeyFactory.getInstance(f69413e, f69412d);
        }
        return (RSAPublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(C26523c.m41353a(str)));
    }
}
