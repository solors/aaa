package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.p411c.Setting;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.report.b */
/* loaded from: classes6.dex */
public class DomainReport {

    /* renamed from: a */
    private static String f56701a = "DomainReport";

    /* renamed from: a */
    public static boolean m52147a(Setting setting, String str) {
        if (setting == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            int m53491Q = setting.m53491Q();
            JSONArray m53493O = setting.m53493O();
            JSONArray m53494N = setting.m53494N();
            if (m53494N != null) {
                for (int i = 0; i < m53494N.length(); i++) {
                    if (str.contains(m53494N.getString(i))) {
                        return false;
                    }
                }
            }
            if (m53491Q != 2) {
                return true;
            }
            if (m53493O != null) {
                for (int i2 = 0; i2 < m53493O.length(); i2++) {
                    if (str.contains(m53493O.getString(i2))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            SameLogTool.m51824b(f56701a, e.getMessage());
            return true;
        }
    }
}
