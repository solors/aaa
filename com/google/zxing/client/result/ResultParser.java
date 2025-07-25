package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.ironsource.C21114v8;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class ResultParser {

    /* renamed from: a */
    private static final ResultParser[] f44291a = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};

    /* renamed from: b */
    private static final Pattern f44292b = Pattern.compile("\\d+");

    /* renamed from: c */
    private static final Pattern f44293c = Pattern.compile(C21114v8.C21123i.f54135c);

    /* renamed from: d */
    private static final Pattern f44294d = Pattern.compile("=");

    /* renamed from: a */
    private static void m66063a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f44294d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m66052l(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    private static int m66062b(CharSequence charSequence, int i) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0 && charSequence.charAt(i3) == '\\'; i3--) {
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public static String m66061c(Result result) {
        String text = result.getText();
        if (text.startsWith("\ufeff")) {
            return text.substring(1);
        }
        return text;
    }

    /* renamed from: d */
    public static boolean m66060d(CharSequence charSequence, int i) {
        if (charSequence != null && i > 0 && i == charSequence.length() && f44292b.matcher(charSequence).matches()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m66059e(CharSequence charSequence, int i, int i2) {
        int i3;
        if (charSequence == null || i2 <= 0 || charSequence.length() < (i3 = i2 + i) || !f44292b.matcher(charSequence.subSequence(i, i3)).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String[] m66058f(String str, String str2, char c, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z2 = true;
            ArrayList arrayList2 = arrayList;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (m66062b(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String m66053k = m66053k(str2.substring(length2, indexOf2));
                    if (z) {
                        m66053k = m66053k.trim();
                    }
                    if (!m66053k.isEmpty()) {
                        arrayList2.add(m66053k);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: g */
    public static String m66057g(String str, String str2, char c, boolean z) {
        String[] m66058f = m66058f(str, str2, c, z);
        if (m66058f == null) {
            return null;
        }
        return m66058f[0];
    }

    /* renamed from: h */
    public static String[] m66056h(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: i */
    public static int m66055i(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: j */
    public static Map<String, String> m66054j(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : f44293c.split(str.substring(indexOf + 1))) {
            m66063a(str2, hashMap);
        }
        return hashMap;
    }

    /* renamed from: k */
    protected static String m66053k(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (!z && charAt == '\\') {
                z = true;
            } else {
                sb2.append(charAt);
                z = false;
            }
            indexOf++;
        }
        return sb2.toString();
    }

    /* renamed from: l */
    public static String m66052l(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : f44291a) {
            ParsedResult parse = resultParser.parse(result);
            if (parse != null) {
                return parse;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    public abstract ParsedResult parse(Result result);
}
