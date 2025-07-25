package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.lf */
/* loaded from: classes8.dex */
public final class C30784lf {
    /* renamed from: a */
    public static boolean m32279a(String str) {
        char charAt;
        char charAt2;
        char c;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("rtsp".charAt(i) != str.charAt(i) && ((c = (char) ((charAt | ' ') - 97)) >= 26 || c != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m32278b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static String m32277c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
