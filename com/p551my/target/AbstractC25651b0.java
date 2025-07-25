package com.p551my.target;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.my.target.b0 */
/* loaded from: classes7.dex */
public abstract class AbstractC25651b0 {
    /* renamed from: a */
    public static boolean m44193a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int[] m44195a(int... iArr) {
        Arrays.sort(iArr);
        return iArr;
    }

    /* renamed from: a */
    public static String m44196a(List list) {
        return TextUtils.join(",", list);
    }

    /* renamed from: a */
    public static String m44194a(String[] strArr) {
        return strArr == null ? "" : TextUtils.join(",", strArr);
    }
}
