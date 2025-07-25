package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFb1mSDK {
    public static String AFInAppEventParameterName(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFKeystoreWrapper(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFKeystoreWrapper(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e);
            return null;
        }
    }

    private static String AFKeystoreWrapper(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    @Nullable
    public static byte[] valueOf(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e);
            return null;
        }
    }

    public static boolean valueOf(Map<String, Object> map, String[] strArr, AFd1sSDK aFd1sSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String registerClient = AFd1sSDK.registerClient();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(registerClient);
        return AFInAppEventParameterName(sb2.toString(), AFb1jSDK.AFInAppEventType(aFd1sSDK.valueOf, aFd1sSDK.values)).equals(str2);
    }
}
