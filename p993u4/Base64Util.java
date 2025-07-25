package p993u4;

import android.util.Base64;

/* renamed from: u4.a */
/* loaded from: classes6.dex */
public class Base64Util {
    /* renamed from: a */
    public static String m3034a(byte[] bArr) {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (AssertionError unused) {
            return "";
        }
    }
}
