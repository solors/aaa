package com.mbridge.msdk.mbbanner.common.p458b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.p411c.UnitSetting;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.e */
/* loaded from: classes6.dex */
public class ProxyBannerShowListener implements BannerShowListener {

    /* renamed from: a */
    private static final String f57208a = "e";

    /* renamed from: b */
    private BannerShowListener f57209b;

    /* renamed from: c */
    private UnitSetting f57210c;

    public ProxyBannerShowListener(BannerShowListener bannerShowListener, UnitSetting unitSetting) {
        this.f57210c = unitSetting;
        this.f57209b = bannerShowListener;
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: a */
    public final void mo51495a(List<CampaignEx> list) {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51495a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: b */
    public final void mo51494b() {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51494b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: c */
    public final void mo51493c() {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51493c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: d */
    public final void mo51492d() {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51492d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: e */
    public final void mo51491e() {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51491e();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: a */
    public final void mo51497a(MBFailureReason mBFailureReason) {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51497a(mBFailureReason);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: a */
    public final void mo51498a() {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51498a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.p458b.BannerShowListener
    /* renamed from: a */
    public final void mo51496a(CampaignEx campaignEx) {
        BannerShowListener bannerShowListener = this.f57209b;
        if (bannerShowListener != null) {
            bannerShowListener.mo51496a(campaignEx);
        }
    }
}
