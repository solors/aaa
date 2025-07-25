package com.mbridge.msdk.p411c.p412a;

import android.content.Context;
import com.ironsource.C19577ad;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.c.a.d */
/* loaded from: classes6.dex */
public final class SettingRequestDiff {
    /* renamed from: a */
    public static void m53508a(Context context, CommonRequestParams commonRequestParams) {
        if (commonRequestParams == null) {
            return;
        }
        try {
            commonRequestParams.m52175a(C19577ad.f49047D0, BaseSameDiTool.m51654c());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
