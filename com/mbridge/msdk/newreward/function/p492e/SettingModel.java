package com.mbridge.msdk.newreward.function.p492e;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.videocommon.p538d.RewardSetting;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;

/* renamed from: com.mbridge.msdk.newreward.function.e.f */
/* loaded from: classes6.dex */
public final class SettingModel {

    /* renamed from: a */
    private String f58686a = MBSDKContext.m52746m().m52779k();

    /* renamed from: b */
    private String f58687b;

    /* renamed from: c */
    private int f58688c;

    /* renamed from: d */
    private Setting f58689d;

    /* renamed from: e */
    private RewardSetting f58690e;

    /* renamed from: f */
    private RewardUnitSetting f58691f;

    /* renamed from: b */
    public final RewardUnitSetting m50306b() {
        return this.f58691f;
    }

    /* renamed from: a */
    public final RewardSetting m50313a() {
        return this.f58690e;
    }

    /* renamed from: a */
    public void m50312a(CommandType commandType, int i, String str) {
        int i2;
        try {
            MetricsData metricsData = new MetricsData();
            ParameterWrapper parameterWrapper = new ParameterWrapper();
            parameterWrapper.m52024a("key", "2000112");
            parameterWrapper.m52024a("st_net", Integer.valueOf(RequestUrlUtil.m52180f().f56665s));
            if (commandType == CommandType.REPORT_SETTING_REQUEST_START) {
                i2 = 3;
            } else if (commandType == CommandType.REPORT_SETTING_REQUEST_SUCCESS) {
                i2 = 1;
            } else {
                i2 = commandType == CommandType.REPORT_SETTING_REQUEST_FAIL ? 2 : 0;
            }
            parameterWrapper.m52024a("result", Integer.valueOf(i2));
            parameterWrapper.m52024a("type", Integer.valueOf(i));
            parameterWrapper.m52024a("url", RequestUrlUtil.m52180f().f56664r ? RequestUrlUtil.m52180f().f56624J : RequestUrlUtil.m52180f().f56623I);
            parameterWrapper.m52024a("reason", str);
            metricsData.m52096a("2000112", parameterWrapper);
            C22011d.m52050a().m52043a("2000112", metricsData);
        } catch (Throwable th) {
            SameLogTool.m51824b("SettingModel", th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m50307a(java.lang.Object r11, com.mbridge.msdk.newreward.p477a.p479b.IReqCallBack r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.p492e.SettingModel.m50307a(java.lang.Object, com.mbridge.msdk.newreward.a.b.b):void");
    }
}
