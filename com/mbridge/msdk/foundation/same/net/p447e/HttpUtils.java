package com.mbridge.msdk.foundation.same.net.p447e;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams;
import com.mbridge.msdk.foundation.tools.C22047ap;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.UriUtil;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.b */
/* loaded from: classes6.dex */
public class HttpUtils {

    /* renamed from: a */
    private static final String f56606a = "b";

    /* renamed from: a */
    public static void m52200a(CommonRequestParams commonRequestParams, String str, String str2) {
        if (commonRequestParams != null) {
            try {
                if (!C22047ap.m51693a(str) && !C22047ap.m51693a(str2)) {
                    commonRequestParams.m52175a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m52199a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = UriUtil.m51691a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th) {
            SameLogTool.m51824b(f56606a, th.getMessage());
        }
    }
}
