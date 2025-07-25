package com.chartboost.sdk.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.chartboost.sdk.impl.ad */
/* loaded from: classes3.dex */
public abstract class AbstractC9686ad {

    /* renamed from: a */
    public static final Pattern f21579a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    public static final Pattern f21580b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    public static final Pattern f21581c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    public static final Pattern f21582d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    public static final Pattern f21583e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    public static final Pattern f21584f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    public static final Pattern f21585g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static String m82090a(String str, String str2) {
        AbstractC10085nd.m80980a(str, "HTML is null or empty");
        int[][] m82091a = m82091a(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!m82087b(str, sb2, f21580b, str2, m82091a) && !m82089a(str, sb2, f21579a, str2, m82091a) && !m82087b(str, sb2, f21582d, str2, m82091a) && !m82089a(str, sb2, f21581c, str2, m82091a) && !m82087b(str, sb2, f21584f, str2, m82091a) && !m82089a(str, sb2, f21583e, str2, m82091a) && !m82089a(str, sb2, f21585g, str2, m82091a)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m82088b(String str, String str2) {
        return m82090a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: a */
    public static boolean m82092a(int i, int[][] iArr) {
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
    public static boolean m82087b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m82092a(start, iArr)) {
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
    public static boolean m82089a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m82092a(start, iArr)) {
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
    public static int[][] m82091a(String str) {
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
