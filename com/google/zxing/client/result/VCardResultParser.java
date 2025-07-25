package com.google.zxing.client.result;

import com.facebook.share.internal.ShareConstants;
import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class VCardResultParser extends ResultParser {

    /* renamed from: e */
    private static final Pattern f44309e = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: f */
    private static final Pattern f44310f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: g */
    private static final Pattern f44311g = Pattern.compile("\r\n[ \t]");

    /* renamed from: h */
    private static final Pattern f44312h = Pattern.compile("\\\\[nN]");

    /* renamed from: i */
    private static final Pattern f44313i = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: j */
    private static final Pattern f44314j = Pattern.compile("=");

    /* renamed from: k */
    private static final Pattern f44315k = Pattern.compile(";");

    /* renamed from: l */
    private static final Pattern f44316l = Pattern.compile("(?<!\\\\);+");

    /* renamed from: m */
    private static final Pattern f44317m = Pattern.compile(",");

    /* renamed from: n */
    private static final Pattern f44318n = Pattern.compile("[;,]");

    /* renamed from: m */
    private static String m66047m(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    m66041s(byteArrayOutputStream, str, sb2);
                    sb2.append(charAt2);
                } else if (i < length - 2 && (charAt = charSequence.charAt(i + 1)) != '\r' && charAt != '\n') {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int m66055i = ResultParser.m66055i(charAt);
                    int m66055i2 = ResultParser.m66055i(charAt3);
                    if (m66055i >= 0 && m66055i2 >= 0) {
                        byteArrayOutputStream.write((m66055i << 4) + m66055i2);
                    }
                }
            }
            i++;
        }
        m66041s(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    /* renamed from: n */
    private static void m66046n(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb2 = new StringBuilder(100);
                m66042r(strArr, 3, sb2);
                m66042r(strArr, 1, sb2);
                m66042r(strArr, 2, sb2);
                m66042r(strArr, 0, sb2);
                m66042r(strArr, 4, sb2);
                list.set(0, sb2.toString().trim());
            }
        }
    }

    /* renamed from: o */
    private static boolean m66045o(CharSequence charSequence) {
        if (charSequence != null && !f44310f.matcher(charSequence).matches()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static List<String> m66044p(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> m66043q = m66043q(charSequence, str, z, z2);
        if (m66043q != null && !m66043q.isEmpty()) {
            return m66043q.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static List<List<String>> m66043q(CharSequence charSequence, String str, boolean z, boolean z2) {
        ArrayList arrayList;
        int i;
        String str2;
        String str3;
        int indexOf;
        int i2;
        String replaceAll;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < length) {
            int i5 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i4 > 0) {
                i4--;
            }
            if (!matcher.find(i4)) {
                break;
            }
            int end = matcher.end(i3);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f44315k.split(group);
                int length2 = split.length;
                int i6 = i3;
                i = i6;
                arrayList = null;
                str2 = null;
                str3 = null;
                while (i6 < length2) {
                    String str4 = split[i6];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str4);
                    String[] split2 = f44314j.split(str4, i5);
                    if (split2.length > 1) {
                        String str5 = split2[0];
                        String str6 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            i = 1;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if ("VALUE".equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    }
                    i6++;
                    i5 = 2;
                }
            } else {
                arrayList = null;
                i = 0;
                str2 = null;
                str3 = null;
            }
            int i7 = end;
            while (true) {
                indexOf = str.indexOf(10, i7);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i8 = indexOf + 1;
                    if (str.charAt(i8) == ' ' || str.charAt(i8) == '\t') {
                        i7 = indexOf + 2;
                    }
                }
                if (i == 0) {
                    break;
                }
                if (indexOf > 0) {
                    if (str.charAt(indexOf - 1) == '=') {
                        i7 = indexOf + 1;
                    }
                }
                if (indexOf < 2) {
                    break;
                }
                if (str.charAt(indexOf - 2) != '=') {
                    break;
                }
                i7 = indexOf + 1;
            }
            if (indexOf < 0) {
                i4 = length;
                i3 = 0;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf > 0 && str.charAt(indexOf - 1) == '\r') {
                        indexOf--;
                    }
                    String substring = str.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (i != 0) {
                        replaceAll = m66047m(substring, str2);
                        if (z2) {
                            replaceAll = f44316l.matcher(replaceAll).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            substring = f44316l.matcher(substring).replaceAll("\n").trim();
                        }
                        replaceAll = f44313i.matcher(f44312h.matcher(f44311g.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str3)) {
                        try {
                            replaceAll = URI.create(replaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(replaceAll);
                        arrayList2.add(arrayList3);
                    } else {
                        i2 = 0;
                        arrayList.add(0, replaceAll);
                        arrayList2.add(arrayList);
                        i3 = i2;
                        i4 = indexOf + 1;
                    }
                }
                i2 = 0;
                i3 = i2;
                i4 = indexOf + 1;
            }
        }
        return arrayList2;
    }

    /* renamed from: r */
    private static void m66042r(String[] strArr, int i, StringBuilder sb2) {
        String str = strArr[i];
        if (str != null && !str.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(strArr[i]);
        }
    }

    /* renamed from: s */
    private static void m66041s(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    /* renamed from: t */
    private static String m66040t(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: u */
    private static String[] m66039u(Collection<List<String>> collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (List<String> list : collection) {
                String str = list.get(0);
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    /* renamed from: v */
    private static String[] m66038v(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str2 = list.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i = 1;
                while (true) {
                    if (i < list.size()) {
                        str = list.get(i);
                        int indexOf = str.indexOf(61);
                        if (indexOf < 0) {
                            break;
                        } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                            str = str.substring(indexOf + 1);
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String m66061c = ResultParser.m66061c(result);
        Matcher matcher = f44309e.matcher(m66061c);
        if (matcher.find() && matcher.start() == 0) {
            List<List<String>> m66043q = m66043q("FN", m66061c, true, false);
            if (m66043q == null) {
                m66043q = m66043q("N", m66061c, true, false);
                m66046n(m66043q);
            }
            List<String> m66044p = m66044p("NICKNAME", m66061c, true, false);
            String[] split = m66044p == null ? null : f44317m.split(m66044p.get(0));
            List<List<String>> m66043q2 = m66043q("TEL", m66061c, true, false);
            List<List<String>> m66043q3 = m66043q("EMAIL", m66061c, true, false);
            List<String> m66044p2 = m66044p("NOTE", m66061c, false, false);
            List<List<String>> m66043q4 = m66043q("ADR", m66061c, true, true);
            List<String> m66044p3 = m66044p("ORG", m66061c, true, true);
            List<String> m66044p4 = m66044p("BDAY", m66061c, true, false);
            List<String> list = (m66044p4 == null || m66045o(m66044p4.get(0))) ? m66044p4 : null;
            List<String> m66044p5 = m66044p(ShareConstants.TITLE, m66061c, true, false);
            List<List<String>> m66043q5 = m66043q("URL", m66061c, true, false);
            List<String> m66044p6 = m66044p("IMPP", m66061c, true, false);
            List<String> m66044p7 = m66044p("GEO", m66061c, true, false);
            String[] split2 = m66044p7 == null ? null : f44318n.split(m66044p7.get(0));
            return new AddressBookParsedResult(m66039u(m66043q), split, null, m66039u(m66043q2), m66038v(m66043q2), m66039u(m66043q3), m66038v(m66043q3), m66040t(m66044p6), m66040t(m66044p2), m66039u(m66043q4), m66038v(m66043q4), m66040t(m66044p3), m66040t(list), m66040t(m66044p5), m66039u(m66043q5), (split2 == null || split2.length == 2) ? split2 : null);
        }
        return null;
    }
}
