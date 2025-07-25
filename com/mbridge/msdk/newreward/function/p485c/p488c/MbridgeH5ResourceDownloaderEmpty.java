package com.mbridge.msdk.newreward.function.p485c.p488c;

import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.z */
/* loaded from: classes6.dex */
public final class MbridgeH5ResourceDownloaderEmpty extends MBridgeBaseDownloader {

    /* renamed from: a */
    private final MBridgeCampaigns f58387a;

    /* renamed from: b */
    private final MBridgeCampaign f58388b;

    /* renamed from: c */
    private final BaseCampaignResourceH5Template f58389c;

    public MbridgeH5ResourceDownloaderEmpty(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign, BaseCampaignResourceH5Template baseCampaignResourceH5Template) {
        this.f58387a = mBridgeCampaigns;
        this.f58388b = mBridgeCampaign;
        this.f58389c = baseCampaignResourceH5Template;
        baseCampaignResourceH5Template.m50515b(true);
        baseCampaignResourceH5Template.m50517a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.IMBridgeDownloader
    /* renamed from: a */
    public final void mo50485a(int i, MBridgeResourceDownloadListener mBridgeResourceDownloadListener) {
        if (mBridgeResourceDownloadListener != null) {
            mBridgeResourceDownloadListener.mo50489a(this.f58387a, this.f58388b, this);
            mBridgeResourceDownloadListener.mo50487b(this.f58387a, this.f58388b, this);
        }
    }
}
