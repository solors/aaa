package p630d1;

import android.util.Base64;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;

/* renamed from: d1.d */
/* loaded from: classes3.dex */
public final class C32835d {
    /* renamed from: a */
    public static Pair m25796a(SecretKey secretKey, String str) {
        byte[] generateSeed = new SecureRandom().generateSeed(12);
        Cipher m25800b = AbstractC32832a.m25800b(1, generateSeed, secretKey);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, m25800b);
        cipherOutputStream.write(str.getBytes("UTF-8"));
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new Pair(Base64.encodeToString(generateSeed, 0), Base64.encodeToString(byteArray, 0));
    }
}
