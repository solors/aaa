package com.mbridge.msdk.video.module.p530a.p531a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.SDKController;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.VideoReportDataDao;
import com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.video.module.a.a.e */
/* loaded from: classes6.dex */
public class DefaultImageLoaderListener implements CommonImageLoaderListener {

    /* renamed from: a */
    private CampaignEx f60804a;

    /* renamed from: b */
    protected ImageView f60805b;

    /* renamed from: c */
    private String f60806c;

    public DefaultImageLoaderListener(ImageView imageView) {
        this.f60805b = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    VideoReportDataDao m52545a = VideoReportDataDao.m52545a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
                    if (DefaultImageLoaderListener.this.f60804a == null) {
                        SameLogTool.m51827a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    VideoReportData videoReportData = new VideoReportData();
                    videoReportData.m52360a("2000044");
                    videoReportData.m52361a(SameDiTool.m51876m(MBSDKContext.m52746m().m52792c()));
                    videoReportData.m52346e(DefaultImageLoaderListener.this.f60804a.getId());
                    videoReportData.m52324p(DefaultImageLoaderListener.this.f60804a.getImageUrl());
                    videoReportData.m52344f(DefaultImageLoaderListener.this.f60804a.getRequestId());
                    videoReportData.m52342g(DefaultImageLoaderListener.this.f60804a.getRequestIdNotice());
                    videoReportData.m52352c(DefaultImageLoaderListener.this.f60806c);
                    videoReportData.m52340h(str);
                    m52545a.m52544a(videoReportData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        SDKController.m52745a();
        ThreadPoolUtils.m52227b().execute(runnable);
        SameLogTool.m51824b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.p438c.CommonImageLoaderListener
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                SameLogTool.m51824b("ImageLoaderListener", "bitmap=null");
            } else if (this.f60805b != null && !bitmap.isRecycled()) {
                this.f60805b.setImageBitmap(bitmap);
                this.f60805b.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public DefaultImageLoaderListener(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f60805b = imageView;
        this.f60804a = campaignEx;
        this.f60806c = str;
    }
}
