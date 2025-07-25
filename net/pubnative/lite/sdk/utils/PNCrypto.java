package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class PNCrypto {
    private static final String AES_MODE = "AES/CBC/PKCS5Padding";
    private static final String TAG = "PNCrypto";
    private static final byte[] ivBytes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static String decryptString(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 2);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(decode, 16, decode.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(copyOfRange));
            return new String(cipher.doFinal(copyOfRange2), StandardCharsets.UTF_8);
        } catch (Exception e) {
            HyBid.reportException(e);
            e.printStackTrace();
            return null;
        }
    }

    public static String encryptString(String str, String str2) {
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(bArr));
            return Base64.encodeToString(getCombinedArray(bArr, cipher.doFinal(str.getBytes(StandardCharsets.UTF_8))), 2);
        } catch (Exception e) {
            HyBid.reportException(e);
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] getCombinedArray(byte[] bArr, byte[] bArr2) {
        byte b;
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            if (i < bArr.length) {
                b = bArr[i];
            } else {
                b = bArr2[i - bArr.length];
            }
            bArr3[i] = b;
        }
        return bArr3;
    }

    public static String md5(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b : digest) {
                    StringBuilder sb3 = new StringBuilder(Integer.toHexString(b & 255));
                    while (sb3.length() < 2) {
                        sb3.insert(0, "0");
                    }
                    sb2.append((CharSequence) sb3);
                }
                return sb2.toString();
            } catch (NoSuchAlgorithmException e) {
                HyBid.reportException((Exception) e);
                e.printStackTrace();
            }
        }
        return "";
    }

    public static String sha1(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                byte[] bytes = str.getBytes("UTF-8");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    sb2.append(String.format("%02X", Byte.valueOf(digest[i])));
                }
                return sb2.toString().toLowerCase(Locale.US);
            } catch (Exception e) {
                HyBid.reportException(e);
                e.printStackTrace();
            }
        }
        return "";
    }
}
