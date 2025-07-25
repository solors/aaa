package com.mbridge.msdk.splash.p508f;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C22909h;
import java.util.List;

/* renamed from: com.mbridge.msdk.splash.f.b */
/* loaded from: classes6.dex */
public abstract class SplashLoadResponseHandler extends SplashResponseHandler {

    /* renamed from: a */
    private int f59451a;

    public SplashLoadResponseHandler(int i) {
        this.f59451a = i;
    }

    /* renamed from: a */
    public abstract void mo49735a(int i, String str);

    /* renamed from: a */
    public abstract void mo49734a(CampaignUnit campaignUnit, int i);

    @Override // com.mbridge.msdk.splash.p508f.SplashResponseHandler
    /* renamed from: a */
    public final void mo49731a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.splash.p508f.SplashResponseHandler
    /* renamed from: b */
    public final void mo49729b(int i, String str) {
        mo49735a(i, str);
    }

    @Override // com.mbridge.msdk.splash.p508f.SplashResponseHandler
    /* renamed from: a */
    public final void mo49730a(List<C22909h> list, CampaignUnit campaignUnit) {
        mo49734a(campaignUnit, this.f59451a);
    }
}
