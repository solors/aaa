package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbbanner.common.p458b.BannerLoadListener;

/* renamed from: com.mbridge.msdk.mbbanner.common.util.a */
/* loaded from: classes6.dex */
public class BannerDelivery {

    /* renamed from: a */
    private static final String f57342a = "a";

    /* renamed from: b */
    private final Handler f57343b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private boolean f57344c;

    /* renamed from: b */
    public final void m51382b(final BannerLoadListener bannerLoadListener, final MBFailureReason mBFailureReason) {
        String str = f57342a;
        SameLogTool.m51824b(str, "postResourceFail unitId=" + mBFailureReason);
        this.f57343b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (bannerLoadListener != null) {
                    mBFailureReason.m52824a(BannerDelivery.this.f57344c);
                    bannerLoadListener.mo51499b(mBFailureReason);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m51383a(boolean z) {
        this.f57344c = z;
    }

    /* renamed from: a */
    public final void m51386a(final BannerLoadListener bannerLoadListener, final CampaignUnit campaignUnit, final String str) {
        String str2 = f57342a;
        SameLogTool.m51824b(str2, "postCampaignSuccess unitId=" + str);
        this.f57343b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.1
            @Override // java.lang.Runnable
            public final void run() {
                BannerLoadListener bannerLoadListener2 = bannerLoadListener;
                if (bannerLoadListener2 != null) {
                    bannerLoadListener2.mo51500a(str, campaignUnit, BannerDelivery.this.f57344c);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m51387a(final BannerLoadListener bannerLoadListener, final MBFailureReason mBFailureReason) {
        this.f57343b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (bannerLoadListener != null) {
                    mBFailureReason.m52824a(BannerDelivery.this.f57344c);
                    bannerLoadListener.mo51502a(mBFailureReason);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m51385a(final BannerLoadListener bannerLoadListener, final String str, final int i) {
        String str2 = f57342a;
        SameLogTool.m51824b(str2, "postResourceSuccess unitId=" + str);
        this.f57343b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.3
            @Override // java.lang.Runnable
            public final void run() {
                BannerLoadListener bannerLoadListener2 = bannerLoadListener;
                if (bannerLoadListener2 != null) {
                    bannerLoadListener2.mo51501a(str, i, BannerDelivery.this.f57344c);
                }
            }
        });
    }
}
