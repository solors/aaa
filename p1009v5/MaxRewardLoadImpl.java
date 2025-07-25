package p1009v5;

import com.meevii.adsdk.common.AdType;
import com.meevii.adsdk.common.Adapter;
import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.common.RequestAd;
import p1038x5.AdUnit;
import p1038x5.RequestAttachNetworkInfo;
import p1038x5.StatsIdStore;

/* renamed from: v5.b */
/* loaded from: classes6.dex */
public class MaxRewardLoadImpl extends MaxRewardLoadApi {
    public MaxRewardLoadImpl(String str) {
        super(str);
    }

    @Override // p843q5.MaxSwitchLoadStrategy
    /* renamed from: d */
    protected void mo2677d(Adapter adapter, AdUnit adUnit) {
        String m2004b = adUnit.m2004b();
        RequestAd requestAd = new RequestAd(m2004b, StatsIdStore.m1916a().m1914c(m2004b), AdType.REWARDED);
        requestAd.putExtra("retryType", Integer.valueOf(adUnit.m1994l()));
        RequestAttachNetworkInfo m1995k = adUnit.m1995k(Platform.APS);
        if (m1995k != null) {
            requestAd.putExtra("apsRewardId", m1995k.m1945a());
        }
        adapter.loadRewardedVideoAd(requestAd, this);
    }

    @Override // p1009v5.MaxRewardLoadApi
    /* renamed from: q */
    protected AdUnit mo2676q(Adapter adapter, AdUnit adUnit) {
        adapter.showRewardedVideoAd(adUnit.m2004b(), this);
        return adUnit;
    }
}
