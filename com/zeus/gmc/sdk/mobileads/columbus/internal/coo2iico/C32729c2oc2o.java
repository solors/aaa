package com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico.c2oc2o */
/* loaded from: classes8.dex */
class C32729c2oc2o {
    private static final Pattern coo2iico = Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final Pattern coi222o222 = Pattern.compile("<(head)( [^>]*)?/>", 2);
    private static final Pattern c2oc2i = Pattern.compile("<(body)( [^>]*?)?>", 2);
    private static final Pattern cioccoiococ = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    private static final Pattern c2oc2o = Pattern.compile("<(html)( [^>]*?)?>", 2);
    private static final Pattern cco22 = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final Pattern cii2c2 = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String coi222o222(String str, String str2) {
        return coo2iico(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    static String coo2iico(String str, String str2) {
        C32610cii2c2.coo2iico(str, "HTML is null or empty");
        int[][] coo2iico2 = coo2iico(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!coi222o222(str, sb2, coi222o222, str2, coo2iico2) && !coo2iico(str, sb2, coo2iico, str2, coo2iico2) && !coi222o222(str, sb2, cioccoiococ, str2, coo2iico2) && !coo2iico(str, sb2, c2oc2i, str2, coo2iico2) && !coi222o222(str, sb2, cco22, str2, coo2iico2) && !coo2iico(str, sb2, c2oc2o, str2, coo2iico2) && !coo2iico(str, sb2, cii2c2, str2, coo2iico2)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    private static boolean coi222o222(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!coo2iico(start, iArr)) {
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

    private static boolean coo2iico(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean coo2iico(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!coo2iico(start, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    private static int[][] coo2iico(String str) {
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
