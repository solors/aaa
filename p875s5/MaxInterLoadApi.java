package p875s5;

import android.os.Bundle;
import com.meevii.adsdk.common.Adapter;
import com.meevii.adsdk.common.util.AdError;
import p1038x5.AdUnit;
import p683g6.AdapterRepository;
import p843q5.MaxSwitchLoadStrategy;

/* renamed from: s5.c */
/* loaded from: classes6.dex */
public abstract class MaxInterLoadApi extends MaxSwitchLoadStrategy {
    public MaxInterLoadApi(String str) {
        super(str);
    }

    @Override // p843q5.MaxSwitchLoadStrategy
    /* renamed from: n */
    public void mo2678n(String str, AdError adError) {
        super.mo2678n(str, adError);
        m12936o(str, false);
    }

    @Override // p843q5.MaxSwitchLoadStrategy, com.meevii.adsdk.common.Adapter.IAdShowListener
    public void onADClose(String str, String str2, Bundle bundle) {
        super.onADClose(str, str2, bundle);
        m12936o(str, false);
    }

    @Override // p843q5.MaxSwitchLoadStrategy, com.meevii.adsdk.common.Adapter.IAdLoadListener
    public void onLoadError(String str, String str2, AdError adError) {
        super.onLoadError(str, str2, adError);
        m12936o(str, true);
    }

    /* renamed from: q */
    protected abstract AdUnit mo12118q(Adapter adapter, AdUnit adUnit);

    @Override // p843q5.MaxSwitchLoadStrategy, p798n5.LoadApi
    public AdUnit show() {
        AdUnit m12941i = m12941i();
        if (m12941i == null) {
            return null;
        }
        try {
            return mo12118q(AdapterRepository.m24274d().m24273e(m12941i.m1996j()), m12941i);
        } catch (Throwable th) {
            th.printStackTrace();
            mo2678n(m12941i.m2004b(), AdError.AdShowFail.createExtraMsgError(th.getMessage()));
            return null;
        }
    }
}
