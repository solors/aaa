package com.zeus.gmc.sdk.mobileads.columbus.internal.cccoo22o2;

import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cccoo22o2.coo2iico */
/* loaded from: classes8.dex */
public class C32527coo2iico {
    private static final String c2oc2i = "AES";
    private static final String coi222o222 = "AES/GCM/NoPadding";
    private static final String coo2iico = "AES";

    private C32527coo2iico() {
    }

    public static byte[] coi222o222(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(coi222o222);
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2, 0, 16));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            MLog.m25888e("AES", "encrypt exception:", e);
            return new byte[0];
        }
    }

    public static String coo2iico(String str) {
        try {
            return new String(coo2iico(C32526coi222o222.c2oc2i(str), C32525c2oc2i.coo2iico(C32526coi222o222.coo2iico(), true).getBytes()));
        } catch (Exception e) {
            MLog.m25888e("AES", "decryptRecord() exception:", e);
            return "";
        }
    }

    public static byte[] coo2iico(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(coi222o222);
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr2, 0, 16));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            MLog.m25888e("AES", "decrypt exception:", e);
            MLog.m25889e("AES", "content len=" + bArr.length + ", passwd len=" + bArr2.length);
            return new byte[0];
        }
    }
}
