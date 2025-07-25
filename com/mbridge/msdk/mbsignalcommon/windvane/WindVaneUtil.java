package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.j */
/* loaded from: classes6.dex */
public final class WindVaneUtil {

    /* renamed from: a */
    private static final String[] f57772a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b */
    private static final Pattern f57773b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c */
    private static final Pattern f57774c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d */
    private static final Pattern f57775d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e */
    private static final Pattern f57776e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f */
    private static Map<String, String> f57777f = new HashMap();

    static {
        MimeTypeEnum[] values;
        for (MimeTypeEnum mimeTypeEnum : MimeTypeEnum.values()) {
            f57777f.put(mimeTypeEnum.m51070a(), mimeTypeEnum.m51069b());
        }
    }

    /* renamed from: a */
    public static boolean m51054a(String str) {
        for (String str2 : f57772a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Pattern m51053b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f57776e;
        }
        if ("mraid:".equals(str)) {
            return f57774c;
        }
        if ("ssp:".equals(str)) {
            return f57775d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f57776e;
        }
        return null;
    }

    /* renamed from: c */
    public static String m51052c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < 2) {
                        if (cArr[i2] == charAt) {
                            stringBuffer.append("\\" + charAt);
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    /* renamed from: d */
    public static boolean m51051d(String str) {
        return m51050e(str).startsWith("image");
    }

    /* renamed from: e */
    public static String m51050e(String str) {
        String str2 = f57777f.get(m51049f(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: f */
    private static String m51049f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
