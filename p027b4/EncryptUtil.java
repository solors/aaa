package p027b4;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b4.c */
/* loaded from: classes6.dex */
public class EncryptUtil {
    /* renamed from: a */
    public static String m103939a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        try {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, m103938b(str2, 32), gCMParameterSpec);
            byte[] doFinal = cipher.doFinal(str.getBytes(StandardCharsets.ISO_8859_1));
            byte[] bArr2 = new byte[doFinal.length + 12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
            return Base64.encodeToString(bArr2, 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "unset";
        }
    }

    /* renamed from: b */
    private static SecretKeySpec m103938b(String str, int i) {
        int length = str.length();
        if (length < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            for (int i2 = 0; i2 < i - length; i2++) {
                sb2.append("0");
            }
            str = sb2.toString();
        }
        return new SecretKeySpec(str.getBytes(StandardCharsets.ISO_8859_1), "AES");
    }

    /* renamed from: c */
    public static String m103937c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
