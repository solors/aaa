package com.mbridge.msdk.newreward.function.p485c.p488c;

import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.s */
/* loaded from: classes6.dex */
public final class MBridgeDynamicViewBigTemplateDownloader extends MBridgeBaseDynamicViewDownloader {
    /* JADX INFO: Access modifiers changed from: protected */
    public MBridgeDynamicViewBigTemplateDownloader(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign, BaseCampaignResourceDynamicTemplate baseCampaignResourceDynamicTemplate) {
        super(mBridgeCampaigns, mBridgeCampaign, baseCampaignResourceDynamicTemplate);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.newreward.function.p485c.p488c.IMBridgeDownloader
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50485a(int i, MBridgeResourceDownloadListener mBridgeResourceDownloadListener) {
        super.mo50485a(i, mBridgeResourceDownloadListener);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader
    /* renamed from: b */
    protected final String mo50493b() {
        return "template_" + super.mo50491d().m50618C() + "_" + super.mo50491d().m50617D();
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ MBridgeCampaign mo50492c() {
        return super.mo50492c();
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ MBridgeCampaigns mo50491d() {
        return super.mo50491d();
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ BaseCampaignResource mo50490e() {
        return super.mo50490e();
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onCancelDownload(DownloadMessage<MBridgeCampaigns> downloadMessage) {
        super.onCancelDownload(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadComplete(DownloadMessage<MBridgeCampaigns> downloadMessage) {
        super.onDownloadComplete(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadError(DownloadMessage<MBridgeCampaigns> downloadMessage, DownloadError downloadError) {
        super.onDownloadError(downloadMessage, downloadError);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadStart(DownloadMessage<MBridgeCampaigns> downloadMessage) {
        super.onDownloadStart(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader, com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final /* bridge */ /* synthetic */ void onProgress(DownloadMessage<MBridgeCampaigns> downloadMessage, DownloadProgress downloadProgress) {
        super.onProgress(downloadMessage, downloadProgress);
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.MBridgeBaseDynamicViewDownloader
    /* renamed from: a */
    protected final boolean mo50494a() {
        MBridgeCampaigns mo50491d = super.mo50491d();
        if (mo50491d == null) {
            return true;
        }
        return mo50491d.m50610K();
    }
}
