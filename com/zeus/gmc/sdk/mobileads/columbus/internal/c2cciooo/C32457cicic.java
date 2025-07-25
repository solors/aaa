package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cicic */
/* loaded from: classes8.dex */
public final class C32457cicic {
    private C32457cicic() {
    }

    public static String coo2iico(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String coo2iico(String str) {
        if (str == null) {
            str = "";
        }
        return coo2iico(str.getBytes());
    }
}
