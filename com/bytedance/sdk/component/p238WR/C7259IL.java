package com.bytedance.sdk.component.p238WR;

import com.bytedance.sdk.component.utils.C7741PX;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.WR.IL */
/* loaded from: classes3.dex */
public class C7259IL {
    /* renamed from: bg */
    public static boolean m89442bg(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                try {
                } catch (Throwable th) {
                    C7741PX.m87880IL(th.toString());
                }
                if (Pattern.matches(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
