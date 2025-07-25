package com.mbridge.msdk.mbbid.common.p465c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;

/* renamed from: com.mbridge.msdk.mbbid.common.c.a */
/* loaded from: classes6.dex */
public class BidReport {

    /* renamed from: a */
    private static final String f57384a = "com.mbridge.msdk.mbbid.common.c.a";

    /* renamed from: a */
    public static void m51356a(Context context, String str, String str2, String str3, String str4) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("result", 1);
            parameterWrapper.m52024a("bidid", str2);
            parameterWrapper.m52024a("bid_tk", str4);
            parameterWrapper.m52024a("lrid", str3);
            parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            C22011d.m52050a().m52032b("2000064", parameterWrapper);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m51357a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("result", 2);
            parameterWrapper.m52024a("lrid", str3);
            parameterWrapper.m52024a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            parameterWrapper.m52024a("reason", str2);
            C22011d.m52050a().m52032b("2000064", parameterWrapper);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
