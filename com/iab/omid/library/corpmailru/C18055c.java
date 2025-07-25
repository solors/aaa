package com.iab.omid.library.corpmailru;

import com.iab.omid.library.corpmailru.p395d.C18066e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.corpmailru.c */
/* loaded from: classes6.dex */
class C18055c {

    /* renamed from: a */
    private static final Pattern f45458a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f45459b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f45460c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f45461d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f45462e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f45463f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f45464g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static String m64157a(String str, String str2) {
        return m64155b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: b */
    public static String m64155b(String str, String str2) {
        C18066e.m64118a(str, "HTML is null or empty");
        int[][] m64158a = m64158a(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!m64154b(str, sb2, f45459b, str2, m64158a) && !m64156a(str, sb2, f45458a, str2, m64158a) && !m64154b(str, sb2, f45461d, str2, m64158a) && !m64156a(str, sb2, f45460c, str2, m64158a) && !m64154b(str, sb2, f45463f, str2, m64158a) && !m64156a(str, sb2, f45462e, str2, m64158a) && !m64156a(str, sb2, f45464g, str2, m64158a)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static boolean m64159a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m64154b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m64159a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m64156a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m64159a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static int[][] m64158a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(Integer.TYPE, 0, 2));
    }
}
