package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.pgl.ssdk.g0 */
/* loaded from: classes7.dex */
public class C26634g0 {
    /* renamed from: a */
    public static String m40860a(String str) {
        String[] m40859b = m40859b(str);
        ArrayList arrayList = new ArrayList();
        if (m40859b != null && m40859b.length > 0) {
            for (String str2 : m40859b) {
                try {
                    Class.forName(str2);
                    arrayList.add(str2);
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList.toString();
        }
        return null;
    }

    /* renamed from: b */
    public static String[] m40859b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split("//");
        }
        return null;
    }
}
