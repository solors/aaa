package com.mbridge.msdk.foundation.same.p442g;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.mbridge.msdk.foundation.same.g.a */
/* loaded from: classes6.dex */
public final class MBDownloadListener implements DownloadListener {

    /* renamed from: a */
    private String f56572a;

    /* renamed from: b */
    private CampaignEx f56573b;

    public MBDownloadListener(CampaignEx campaignEx) {
        this.f56573b = campaignEx;
    }

    /* renamed from: a */
    public final void m52222a(String str) {
        this.f56572a = str;
    }

    public MBDownloadListener() {
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
    }
}
