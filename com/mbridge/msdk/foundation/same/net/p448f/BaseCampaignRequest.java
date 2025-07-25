package com.mbridge.msdk.foundation.same.net.p448f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.a */
/* loaded from: classes6.dex */
public class BaseCampaignRequest extends CommonAsyncHttpRequest {
    public BaseCampaignRequest(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest
    public void addExtraParams(String str, CommonRequestParams commonRequestParams) {
        try {
            try {
                int m51775a = SameTool.m51775a();
                String m51739c = SameTool.m51739c();
                if (commonRequestParams != null) {
                    commonRequestParams.m52175a("misk_spt", String.valueOf(m51775a));
                    if (!TextUtils.isEmpty(m51739c)) {
                        commonRequestParams.m52175a("misk_spt_det", m51739c);
                    }
                }
            } catch (Exception e) {
                SameLogTool.m51827a("CampaignRequest", e.getMessage());
            }
        } finally {
            super.addExtraParams(str, commonRequestParams);
        }
    }
}
