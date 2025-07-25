package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: com.pgl.ssdk.s */
/* loaded from: classes7.dex */
public class C26660s {

    /* renamed from: a */
    private static AccessibilityManager f69950a;

    /* renamed from: a */
    private static AccessibilityManager m40780a(Context context) {
        if (f69950a == null) {
            f69950a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f69950a;
    }

    /* renamed from: b */
    public static String m40779b(Context context) {
        AccessibilityManager m40780a;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (m40780a = m40780a(context)) == null || (enabledAccessibilityServiceList = m40780a.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                sb2.append(String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name));
                if (i != enabledAccessibilityServiceList.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }
}
