package p993u4;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: EncryptUtil.java */
/* renamed from: u4.g */
/* loaded from: classes6.dex */
public class C44431g {
    /* renamed from: a */
    public static String m3007a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(StandardCharsets.UTF_8));
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
