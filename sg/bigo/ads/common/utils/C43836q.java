package sg.bigo.ads.common.utils;

import android.graphics.Color;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.q */
/* loaded from: classes10.dex */
public final class C43836q {

    /* renamed from: a */
    public static final SecureRandom f114679a = new SecureRandom();

    /* renamed from: b */
    public static final Pattern f114680b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: a */
    public static float m4838a() {
        try {
            return Float.parseFloat(null);
        } catch (Throwable unused) {
            return 5.0f;
        }
    }

    /* renamed from: b */
    public static int m4825b(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: c */
    public static byte[] m4824c(String str) {
        if (m4837a((CharSequence) str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i2 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i2])) << 4));
        }
        return bArr;
    }

    /* renamed from: d */
    public static String m4823d(String str) {
        if (m4837a((CharSequence) str)) {
            return str;
        }
        return str.toLowerCase();
    }

    /* renamed from: e */
    public static String m4822e(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            C43782a.m5009a(0, "StringUtils", "Error encoding url, error message is : " + e.toString());
            return str;
        }
    }

    /* renamed from: f */
    public static String m4821f(String str) {
        try {
            return URLDecoder.decode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            C43782a.m5009a(0, "StringUtils", "Error decoding url, error message is : " + e.toString());
            return str;
        }
    }

    /* renamed from: g */
    public static boolean m4820g(String str) {
        if (m4837a((CharSequence) str)) {
            return false;
        }
        return f114680b.matcher(str).matches();
    }

    /* renamed from: a */
    public static int m4834a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: b */
    public static boolean m4827b(CharSequence charSequence) {
        return !m4837a(charSequence);
    }

    /* renamed from: a */
    public static long m4833a(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: b */
    public static boolean m4826b(String str) {
        if (m4837a((CharSequence) str)) {
            return true;
        }
        return m4837a((CharSequence) str.replaceAll("\\s*", ""));
    }

    /* renamed from: a */
    public static String m4835a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m4832a(String str, String str2) {
        if (m4837a((CharSequence) str) || m4837a((CharSequence) str2)) {
            return !m4837a((CharSequence) str) ? str : !m4837a((CharSequence) str2) ? str2 : "";
        }
        return str + "," + str2;
    }

    /* renamed from: a */
    public static String m4831a(String str, String str2, String str3, boolean z) {
        if (m4837a((CharSequence) str) || m4837a((CharSequence) str2) || m4837a((CharSequence) str3)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length() - 1;
        while (true) {
            int indexOf = (m4837a((CharSequence) str) || m4837a((CharSequence) str2)) ? -1 : z ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
            if (indexOf == -1) {
                sb2.append(str);
                return sb2.toString();
            }
            sb2.append(str.substring(0, indexOf));
            sb2.append(str3);
            str = indexOf < length ? str.substring(indexOf + str2.length()) : "";
        }
    }

    /* renamed from: a */
    public static String m4830a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: a */
    public static String m4829a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb2.append(0);
            }
            sb2.append(upperCase);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static boolean m4837a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: a */
    public static boolean m4836a(Object obj) {
        return ((CharSequence) obj).length() == 0;
    }

    /* renamed from: a */
    public static boolean m4828a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        return Arrays.asList(strArr).contains(str);
    }
}
