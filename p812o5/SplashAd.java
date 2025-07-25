package p812o5;

import p029b6.MediationManager;
import p1038x5.AdUnit;
import p798n5.LoadApi;
import p798n5.LoadStrategyFactory;

/* renamed from: o5.f */
/* loaded from: classes6.dex */
public class SplashAd extends AbstractC39104b {
    public SplashAd(String str) {
        super(str);
    }

    @Override // p812o5.AbstractC39104b
    /* renamed from: b */
    public LoadApi mo13929b(String str) {
        LoadStrategyFactory m103903c = MediationManager.m103905a().m103903c();
        if (m103903c != null) {
            return m103903c.mo13287d(str);
        }
        return null;
    }

    @Override // p812o5.AbstractC39104b, p798n5.LoadApi
    public AdUnit show() {
        LoadApi m13930c = m13930c();
        if (m13930c != null) {
            return m13930c.show();
        }
        return super.show();
    }
}
