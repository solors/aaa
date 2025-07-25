package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import com.ironsource.C20517nb;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text._Strings;

/* renamed from: com.inmobi.media.u3 */
/* loaded from: classes6.dex */
public abstract class AbstractC19478u3 {

    /* renamed from: a */
    public static final /* synthetic */ int f48712a = 0;

    /* renamed from: a */
    public static byte[] m59878a(String str) {
        int i;
        String str2;
        CharSequence m16533m1;
        if (str != null) {
            int length = str.length() % 4;
            i = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i = 0;
        }
        if (str != null) {
            m16533m1 = _Strings.m16533m1(str);
            str2 = m16533m1.toString();
        } else {
            str2 = null;
        }
        String valueOf = String.valueOf(str2);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf + C20517nb.f52173T;
        }
        byte[] bytes = valueOf.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.decode(bytes, 2);
    }

    /* renamed from: a */
    public static String m59877a(String data, byte[] bArr) {
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullExpressionValue("u3", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr2 = cipher.doFinal(bytes);
        } catch (Throwable th) {
            Log.d("u3", "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArr2 = null;
        }
        byte[] encode = Base64.encode(bArr2, 2);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        String str = new String(encode, Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue("u3", "TAG");
        return str;
    }
}
