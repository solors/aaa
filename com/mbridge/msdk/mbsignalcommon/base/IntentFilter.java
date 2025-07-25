package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.CommonClickUtil;
import com.mbridge.msdk.foundation.controller.MBSDKContext;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.c */
/* loaded from: classes6.dex */
public final class IntentFilter implements BaseFilter {
    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseFilter
    /* renamed from: a */
    public final boolean mo48799a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String scheme = Uri.parse(str).getScheme();
            if (!TextUtils.isEmpty(scheme) && scheme.equals(SDKConstants.PARAM_INTENT)) {
                return CommonClickUtil.m53163e(MBSDKContext.m52746m().m52792c(), str);
            }
            return false;
        }
        return false;
    }
}
