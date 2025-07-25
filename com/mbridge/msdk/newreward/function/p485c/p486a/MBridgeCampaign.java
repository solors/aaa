package com.mbridge.msdk.newreward.function.p485c.p486a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResourceTemplate;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceDynamicTemplateEndCard;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceDynamicTemplateVideo;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceEndScreenTemplate;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceH5TemplateEndCard;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceH5TemplateVideo;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceMraid;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourcePauseTemplate;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceVideo;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;

/* renamed from: com.mbridge.msdk.newreward.function.c.a.a */
/* loaded from: classes6.dex */
public final class MBridgeCampaign {

    /* renamed from: a */
    private final MBridgeCampaigns f58248a;

    /* renamed from: b */
    private CampaignEx f58249b;

    /* renamed from: c */
    private String f58250c;

    /* renamed from: d */
    private String f58251d;

    /* renamed from: e */
    private String f58252e;

    /* renamed from: f */
    private BaseCampaignResourceTemplate<?> f58253f;

    /* renamed from: g */
    private CampaignResourceVideo f58254g;

    /* renamed from: h */
    private BaseCampaignResourceTemplate<?> f58255h;

    /* renamed from: i */
    private CampaignResourceMraid f58256i;

    /* renamed from: j */
    private CampaignResourceEndScreenTemplate f58257j;

    /* renamed from: k */
    private CampaignResourcePauseTemplate f58258k;

    /* renamed from: l */
    private boolean f58259l = false;

    /* renamed from: m */
    private boolean f58260m = false;

    public MBridgeCampaign(MBridgeCampaigns mBridgeCampaigns) {
        this.f58248a = mBridgeCampaigns;
    }

    /* renamed from: a */
    public final CampaignResourcePauseTemplate m50638a() {
        CampaignEx.C21961c rewardTemplateMode;
        CampaignResourcePauseTemplate campaignResourcePauseTemplate = this.f58258k;
        if (campaignResourcePauseTemplate != null) {
            return campaignResourcePauseTemplate;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String m52525c = rewardTemplateMode.m52525c();
        if (TextUtils.isEmpty(m52525c)) {
            return null;
        }
        if (this.f58258k == null) {
            this.f58258k = new CampaignResourcePauseTemplate(this.f58248a, this, m52525c);
        }
        return this.f58258k;
    }

    /* renamed from: b */
    public final CampaignResourceEndScreenTemplate m50634b() {
        CampaignResourceEndScreenTemplate campaignResourceEndScreenTemplate = this.f58257j;
        if (campaignResourceEndScreenTemplate != null) {
            return campaignResourceEndScreenTemplate;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f58257j == null) {
            this.f58257j = new CampaignResourceEndScreenTemplate(this.f58248a, this);
        }
        return this.f58257j;
    }

    /* renamed from: c */
    public final BaseCampaignResourceTemplate<?> m50631c() {
        BaseCampaignResourceTemplate<?> baseCampaignResourceTemplate = this.f58253f;
        if (baseCampaignResourceTemplate != null) {
            return baseCampaignResourceTemplate;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String m52523e = campaignEx.getRewardTemplateMode().m52523e();
        if (TextUtils.isEmpty(m52523e)) {
            return null;
        }
        if (this.f58253f == null) {
            if (MBridgeCommonUtils.m50255b(m52523e)) {
                this.f58253f = new CampaignResourceDynamicTemplateVideo(this.f58248a, this);
            } else {
                this.f58253f = new CampaignResourceH5TemplateVideo(this.f58248a, this);
            }
        }
        return this.f58253f;
    }

    /* renamed from: d */
    public final CampaignResourceVideo m50629d() {
        CampaignResourceVideo campaignResourceVideo = this.f58254g;
        if (campaignResourceVideo != null) {
            return campaignResourceVideo;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f58254g == null) {
            this.f58254g = new CampaignResourceVideo(this.f58248a, this);
        }
        return this.f58254g;
    }

    /* renamed from: e */
    public final CampaignResourceMraid m50628e() {
        CampaignResourceMraid campaignResourceMraid = this.f58256i;
        if (campaignResourceMraid != null) {
            return campaignResourceMraid;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f58256i == null) {
            this.f58256i = new CampaignResourceMraid(this.f58248a, this);
        }
        return this.f58256i;
    }

    /* renamed from: f */
    public final BaseCampaignResourceTemplate<?> m50627f() {
        BaseCampaignResourceTemplate<?> baseCampaignResourceTemplate = this.f58255h;
        if (baseCampaignResourceTemplate != null) {
            return baseCampaignResourceTemplate;
        }
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f58255h == null) {
            if (MBridgeCommonUtils.m50255b(str)) {
                if (SameTool.m51707l(str)) {
                    this.f58255h = new CampaignResourceH5TemplateEndCard(this.f58248a, this);
                } else {
                    this.f58255h = new CampaignResourceDynamicTemplateEndCard(this.f58248a, this);
                }
            } else {
                this.f58255h = new CampaignResourceH5TemplateEndCard(this.f58248a, this);
            }
        }
        return this.f58255h;
    }

    /* renamed from: g */
    public final String m50626g() {
        return this.f58252e;
    }

    /* renamed from: h */
    public final CampaignEx m50625h() {
        return this.f58249b;
    }

    /* renamed from: i */
    public final MBridgeCampaigns m50624i() {
        return this.f58248a;
    }

    /* renamed from: j */
    public final boolean m50623j() {
        CampaignEx campaignEx = this.f58249b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m50622k() {
        return this.f58259l;
    }

    /* renamed from: l */
    public final boolean m50621l() {
        return this.f58260m;
    }

    /* renamed from: b */
    public final void m50633b(String str) {
        this.f58251d = str;
    }

    /* renamed from: a */
    public final void m50636a(String str) {
        this.f58250c = str;
    }

    /* renamed from: b */
    public final void m50632b(boolean z) {
        this.f58260m = z;
    }

    /* renamed from: a */
    public final void m50637a(CampaignEx campaignEx) {
        this.f58249b = campaignEx;
    }

    /* renamed from: a */
    public final void m50635a(boolean z) {
        this.f58259l = z;
    }

    /* renamed from: c */
    public final void m50630c(String str) {
        this.f58252e = str;
    }
}
