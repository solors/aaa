package com.meevii.adsdk.common.util;

import android.util.Base64;
import androidx.core.view.InputDeviceCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import net.pubnative.lite.sdk.models.Protocol;

/* loaded from: classes6.dex */
public class Md5Util {

    /* renamed from: a */
    private static final String[] f61513a = {"0", "1", "2", "3", Protocol.VAST_1_0_WRAPPER, "5", "6", "7", "8", "9", "a", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "e", InneractiveMediationDefs.GENDER_FEMALE};

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : bArr) {
            if (i < 0) {
                i += 256;
            }
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = f61513a;
            sb2.append(strArr[i / 16]);
            sb2.append(strArr[i % 16]);
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    public static String encode(String str) {
        String str2 = null;
        try {
            String str3 = new String(str);
            try {
                return byteArrayToHexString(MessageDigest.getInstance(SameMD5.TAG).digest(str3.getBytes("UTF-8")));
            } catch (Exception unused) {
                str2 = str3;
                return str2;
            }
        } catch (Exception unused2) {
        }
    }

    public static String encodeBase64String(String str) {
        try {
            return byteArrayToHexString(MessageDigest.getInstance(SameMD5.TAG).digest(Base64.decode(str, 0)));
        } catch (Exception e) {
            LogUtil.m48061e("Md5Util", "Exception while md5 base64String", e);
            return null;
        }
    }

    public static byte[] hexStringtoByteArray(String str) {
        if (str.length() % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() - 1; i += 2) {
            char charAt = str.charAt(i);
            char charAt2 = str.charAt(i + 1);
            char lowerCase = Character.toLowerCase(charAt);
            char lowerCase2 = Character.toLowerCase(charAt2);
            int i2 = ((lowerCase <= '9' ? lowerCase - '0' : (lowerCase - 'a') + 10) << 4) + (lowerCase2 <= '9' ? lowerCase2 - '0' : (lowerCase2 - 'a') + 10);
            if (i2 > 127) {
                i2 += InputDeviceCompat.SOURCE_ANY;
            }
            bArr[i / 2] = (byte) i2;
        }
        return bArr;
    }

    public static String encode(File file) {
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        if (file == null) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String byteArrayToHexString = byteArrayToHexString(messageDigest.digest());
            try {
                fileInputStream.close();
            } catch (Exception unused2) {
            }
            return byteArrayToHexString;
        } catch (Exception unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused4) {
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }
}
