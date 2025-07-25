package p875s5;

import com.meevii.adsdk.common.AdType;
import com.meevii.adsdk.common.Adapter;
import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.common.RequestAd;
import p1038x5.AdUnit;
import p1038x5.RequestAttachNetworkInfo;
import p1038x5.StatsIdStore;

/* renamed from: s5.b */
/* loaded from: classes6.dex */
public class InHouseInterLoadImpl extends InHouseInterLoadApi {
    public InHouseInterLoadImpl(String str) {
        super(str);
    }

    @Override // p843q5.InHouseLoadStrategy
    /* renamed from: e */
    protected void mo2984e(Adapter adapter, AdUnit adUnit) {
        AdType m2005a = adUnit.m2005a();
        String m2004b = adUnit.m2004b();
        RequestAd requestAd = new RequestAd(m2004b, StatsIdStore.m1916a().m1914c(m2004b), m2005a);
        requestAd.putExtra("retryType", Integer.valueOf(adUnit.m1994l()));
        if (adUnit.m2005a() == AdType.APPOPEN) {
            adapter.loadAppOpenAd(requestAd, this);
            return;
        }
        RequestAttachNetworkInfo m1995k = adUnit.m1995k(Platform.APS);
        if (m1995k != null) {
            requestAd.putExtra("apsInterId", m1995k.m1945a());
        }
        adapter.loadInterstitialAd(requestAd, this);
    }

    @Override // p875s5.InHouseInterLoadApi
    /* renamed from: r */
    protected AdUnit mo12119r(Adapter adapter, AdUnit adUnit) {
        if (adUnit.m2005a() == AdType.APPOPEN) {
            adapter.showAppOpenAd(adUnit.m2004b(), this);
        } else {
            adapter.showInterstitialAd(adUnit.m2004b(), this);
        }
        return adUnit;
    }
}
