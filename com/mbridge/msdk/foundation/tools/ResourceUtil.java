package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.foundation.controller.MBSDKContext;

/* renamed from: com.mbridge.msdk.foundation.tools.x */
/* loaded from: classes6.dex */
public final class ResourceUtil {
    /* renamed from: a */
    public static int m51605a(Context context, String str, String str2) {
        String str3;
        try {
            try {
                str3 = MBSDKContext.m52746m().m52783g();
            } catch (Exception unused) {
                SameLogTool.m51824b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (C22047ap.m51693a(str3) && context != null) {
                str3 = context.getPackageName();
            }
            if (C22047ap.m51693a(str3) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            SameLogTool.m51824b("ResourceUtil", "Resource not found resName:" + str);
            return -1;
        }
    }

    /* renamed from: a */
    public static Resources m51606a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                SameLogTool.m51824b("ResourceUtil", "Resource error:" + e.getMessage());
            }
        }
        return null;
    }
}
