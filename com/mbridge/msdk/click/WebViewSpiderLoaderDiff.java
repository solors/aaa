package com.mbridge.msdk.click;

import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameSDKTool;

/* renamed from: com.mbridge.msdk.click.o */
/* loaded from: classes6.dex */
public final class WebViewSpiderLoaderDiff {
    /* renamed from: a */
    public static boolean m53075a(String str, CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult) {
        if (campaignEx != null) {
            campaignEx.getLinkType();
        }
        if (SameSDKTool.C22043a.m51777b(str)) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}
