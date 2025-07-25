package com.zeus.gmc.sdk.mobileads.columbus.adjumper.common;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.msa.adjump.AdJumpHandlerUtils;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.AdInfoBean;

/* loaded from: classes8.dex */
public class AdJumper {
    public static void handleJumpAction(Context context, AdJumpInfoBean adJumpInfoBean) {
        AdJumpHandlerUtils.handleJumpAction(context, new AdInfoBean.Builder().setLandingPageUrl(adJumpInfoBean.getLandingPageUrl()).setDownloadPackageName(adJumpInfoBean.getDownloadPackageName()).setDeeplink(adJumpInfoBean.getDeeplink()).setDspName(adJumpInfoBean.getDspName()).setAdId(adJumpInfoBean.getAdId()).setTargetType(adJumpInfoBean.getTargetType()).setTagID(adJumpInfoBean.getTagID()).setEx(adJumpInfoBean.getEx()).setBrowserType(adJumpInfoBean.getBrowserType()).setCosdkVersion(adJumpInfoBean.getCosdkVersion()).setCreativeType(adJumpInfoBean.getCreativeType()).setCustomMap(adJumpInfoBean.getCustomMap()).build(), adJumpInfoBean.getAdJumpControl());
    }
}
