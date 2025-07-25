package com.mbridge.msdk.mbbanner.common.p457a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p447e.HttpUtils;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams;
import com.mbridge.msdk.foundation.same.p436a.StaticDataPoll;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.c */
/* loaded from: classes6.dex */
public class BannerV3Params extends BaseBannerV3Params {

    /* renamed from: a */
    private static final String f57206a = "c";

    /* renamed from: a */
    public static CommonRequestParams m51503a(boolean z, Context context, String str, String str2, int i, BannerRequestInfo bannerRequestInfo) {
        String m52779k = MBSDKContext.m52746m().m52779k();
        String md5 = SameMD5.getMD5(MBSDKContext.m52746m().m52779k() + MBSDKContext.m52746m().m52796b());
        String m51771a = SameTool.m51771a(context, str);
        String m52301a = StaticDataPoll.m52301a(str, "banner");
        String closeIds = BannerUtils.getCloseIds(str);
        CommonRequestParams commonRequestParams = new CommonRequestParams();
        HttpUtils.m52200a(commonRequestParams, "app_id", m52779k);
        HttpUtils.m52200a(commonRequestParams, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bannerRequestInfo.m51513d())) {
            HttpUtils.m52200a(commonRequestParams, MBridgeConstans.PLACEMENT_ID, bannerRequestInfo.m51513d());
        }
        HttpUtils.m52200a(commonRequestParams, "sign", md5);
        HttpUtils.m52200a(commonRequestParams, "only_impression", "1");
        HttpUtils.m52200a(commonRequestParams, "ping_mode", "1");
        HttpUtils.m52200a(commonRequestParams, CommonRequestParams.f56679e, m51771a);
        HttpUtils.m52200a(commonRequestParams, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        HttpUtils.m52200a(commonRequestParams, CommonRequestParams.f56680f, str2);
        HttpUtils.m52200a(commonRequestParams, "ad_type", "296");
        HttpUtils.m52200a(commonRequestParams, "offset", i + "");
        HttpUtils.m52200a(commonRequestParams, CommonRequestParams.f56678d, m52301a);
        HttpUtils.m52200a(commonRequestParams, "close_id", closeIds);
        HttpUtils.m52200a(commonRequestParams, BaseCampaignUnit.JSON_KEY_UNIT_SIZE, bannerRequestInfo.m51520a() + "");
        HttpUtils.m52200a(commonRequestParams, "refresh_time", bannerRequestInfo.m51517b() + "");
        if (!TextUtils.isEmpty(bannerRequestInfo.m51515c())) {
            HttpUtils.m52200a(commonRequestParams, "token", bannerRequestInfo.m51515c() + "");
        }
        if (!TextUtils.isEmpty(bannerRequestInfo.m51512e())) {
            HttpUtils.m52200a(commonRequestParams, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, bannerRequestInfo.m51512e());
        }
        return commonRequestParams;
    }
}
