package com.bytedance.sdk.component.eqN;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.utils.C7741PX;
import com.ironsource.C20517nb;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.sdk.component.eqN.bg */
/* loaded from: classes3.dex */
public class C7607bg {

    /* renamed from: bg */
    private static String f16578bg;

    /* renamed from: IL */
    public static String m88419IL(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(decode));
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
            return null;
        }
    }

    @Deprecated
    /* renamed from: bg */
    public static String m88417bg(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(f16578bg)) {
                f16578bg = m88418bg(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(f16578bg);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(C20517nb.f52167N)), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @Deprecated
    /* renamed from: IL */
    public static String m88420IL(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(f16578bg)) {
                f16578bg = m88418bg(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(f16578bg);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(decode));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static String m88416bg(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(C20517nb.f52167N)), 0);
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
            return null;
        }
    }

    /* renamed from: bg */
    public static String m88418bg(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(m88415bg(str.getBytes(), iArr));
    }

    /* renamed from: bg */
    public static byte[] m88415bg(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ iArr[i % iArr.length]);
        }
        return bArr2;
    }
}
