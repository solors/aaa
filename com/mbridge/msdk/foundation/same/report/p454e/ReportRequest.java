package com.mbridge.msdk.foundation.same.report.p454e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest;
import com.mbridge.msdk.foundation.same.net.p448f.CommonRequestParams;

/* renamed from: com.mbridge.msdk.foundation.same.report.e.a */
/* loaded from: classes6.dex */
public final class ReportRequest extends CommonAsyncHttpRequest {
    public ReportRequest(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest
    public final void addExtraParams(String str, CommonRequestParams commonRequestParams) {
        super.addExtraParams(str, commonRequestParams);
    }

    @Override // com.mbridge.msdk.foundation.same.net.p448f.CommonAsyncHttpRequest
    protected final boolean canTrack() {
        return false;
    }
}
