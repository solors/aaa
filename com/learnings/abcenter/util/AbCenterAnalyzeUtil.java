package com.learnings.abcenter.util;

import android.os.Bundle;
import p1007v3.AnalyzeManager;
import p1020w3.C44574a;

/* loaded from: classes6.dex */
public class AbCenterAnalyzeUtil {
    public static String getEventLog(String str, Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(str);
            sb2.append("\n");
            for (String str2 : bundle.keySet()) {
                sb2.append("[ ");
                sb2.append(str2);
                sb2.append(" = ");
                sb2.append(bundle.get(str2));
                sb2.append(" ]");
                if (bundle.get(str2) != null) {
                    sb2.append(" --> ");
                    sb2.append(bundle.get(str2).getClass().getSimpleName());
                }
                sb2.append("\n");
            }
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public static void sendEvent(String str, Bundle bundle) {
        try {
            new C44574a.C44575a(str).m2365b(bundle).m2366a().mo2359k();
        } catch (Throwable unused) {
            AbCenterLogUtil.log("sendEvent fail：no analyze library");
        }
    }

    public static void setEventProperty(String str, String str2) {
        try {
            AnalyzeManager.m2717x(str, str2);
        } catch (Throwable unused) {
            AbCenterLogUtil.log("setEventProperty fail：no analyze library");
        }
    }

    public static void setUserProperty(String str, String str2) {
        try {
            AnalyzeManager.m2741B(str, str2);
        } catch (Throwable unused) {
            AbCenterLogUtil.log("setUserProperty fail：no analyze library");
        }
    }
}
