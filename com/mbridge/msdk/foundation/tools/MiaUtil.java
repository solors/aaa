package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.foundation.tools.u */
/* loaded from: classes6.dex */
public class MiaUtil {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object invoke = context.getClass().getMethod(SameBase64Tool.m51603a("HF5TNFK/J75/JczQhFKsJr5B"), new Class[0]).invoke(context, new Object[0]);
            if (invoke != null) {
                Method method = invoke.getClass().getMethod(SameBase64Tool.m51603a("HF5T5dQMHN=="), Uri.class);
                Object[] objArr = new Object[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(SameBase64Tool.m51603a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = SameBase64Tool.m51603a("n+xg");
                }
                sb2.append(str);
                objArr[0] = Uri.parse(sb2.toString());
                str2 = (String) method.invoke(invoke, objArr);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("MiaUtil", th.getMessage());
            }
        }
        ReportUtil.m51950b(str2);
    }
}
