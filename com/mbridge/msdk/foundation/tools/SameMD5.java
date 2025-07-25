package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.android.exoplayer2.C15633C;
import com.mbridge.msdk.system.NoProGuard;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes6.dex */
public class SameMD5 implements NoProGuard {
    public static final String TAG = "MD5";

    public static String ByteArrayToHexString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    private static String UpHexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb2.append(Integer.toHexString((b & 240) >>> 4));
            sb2.append(Integer.toHexString(b & 15));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static String getMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            SameLogTool.m51827a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return hexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getQftJSMD5(String str) {
        try {
            byte[] qftJSMD5Bytes = getQftJSMD5Bytes(str);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.update(qftJSMD5Bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] getQftJSMD5Bytes(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes(C15633C.UTF16LE_NAME);
        SameLogTool.m51822c("----", "b = " + ByteArrayToHexString(bytes));
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < bytes.length; i2 += 2) {
            byte b = bytes[i2];
            if (b != -1 && b != -2) {
                bArr[i] = b;
                i++;
                if (i == length) {
                    break;
                }
            }
        }
        SameLogTool.m51822c("----", "source = " + ByteArrayToHexString(bArr));
        return bArr;
    }

    public static String getUPMD5(String str) {
        try {
            SameLogTool.m51827a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return UpHexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String hexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb2.append(Integer.toHexString((b & 240) >>> 4));
            sb2.append(Integer.toHexString(b & 15));
        }
        return sb2.toString().toLowerCase(Locale.US);
    }
}
