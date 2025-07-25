package com.p552ot.pubsub.util;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ot.pubsub.util.s */
/* loaded from: classes7.dex */
public class C26598s {

    /* renamed from: a */
    public static final String f69812a = "\\.";

    /* renamed from: b */
    public static final String f69813b = ",";

    /* renamed from: c */
    private static final String f69814c = "com.ot.pubsub.util.s";

    /* renamed from: a */
    public static boolean m41004a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m41001b(CharSequence charSequence) {
        return !m41005a(charSequence);
    }

    /* renamed from: a */
    public static boolean m41005a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: a */
    public static List<String> m41003a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(str2);
            if (split == null || split.length <= 0) {
                return null;
            }
            return Arrays.asList(split);
        } catch (Exception e) {
            String str3 = f69814c;
            C26586j.m41074b(str3, "StringToList error: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Set<String> m41002a(String str, String str2, String str3) {
        HashSet hashSet = new HashSet();
        try {
            String[] strArr = null;
            String[] split = TextUtils.isEmpty(str) ? null : str.split(str3);
            if (split != null && split.length > 0) {
                hashSet.addAll(Arrays.asList(split));
            }
            if (!TextUtils.isEmpty(str2)) {
                strArr = str2.split(str3);
            }
            if (strArr != null && strArr.length > 0) {
                hashSet.addAll(Arrays.asList(strArr));
            }
        } catch (Exception e) {
            String str4 = f69814c;
            C26586j.m41074b(str4, "mergeParams error: " + e.getMessage());
        }
        return hashSet;
    }
}
