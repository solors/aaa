package p875s5;

import android.os.Bundle;
import com.meevii.adsdk.common.Adapter;
import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.common.util.AdError;
import com.meevii.adsdk.common.util.LogUtil;
import java.util.List;
import p1038x5.AdUnit;
import p683g6.AdapterRepository;
import p696h6.BiddingUtils;
import p843q5.InHouseLoadStrategy;

/* renamed from: s5.a */
/* loaded from: classes6.dex */
public abstract class InHouseInterLoadApi extends InHouseLoadStrategy {
    public InHouseInterLoadApi(String str) {
        super(str);
    }

    /* renamed from: s */
    private void m12120s(AdUnit adUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        if (BiddingUtils.m23679a(adUnit)) {
            AdapterRepository.m24274d().m24273e(adUnit.m1996j()).setBiddingResult(adUnit.m2004b(), true, null, adUnit.m2001e());
        }
        List<AdUnit> m1958d = this.f103437c.m1958d();
        int indexOf = m1958d.indexOf(adUnit);
        while (true) {
            indexOf++;
            if (indexOf >= m1958d.size()) {
                break;
            }
            AdUnit adUnit2 = m1958d.get(indexOf);
            if (BiddingUtils.m23679a(adUnit2)) {
                AdapterRepository.m24274d().m24273e(adUnit2.m1996j()).setBiddingResult(adUnit2.m2004b(), false, adUnit.m1996j(), adUnit.m2001e());
            }
        }
        if (LogUtil.isShowLog()) {
            LogUtil.m48060i("ADSDK.InHouseInterLoadApi", "notifyBiddingResult cost : " + Math.abs(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // p843q5.InHouseLoadStrategy
    /* renamed from: c */
    public boolean mo12122c(AdUnit adUnit, double d) {
        if (BiddingUtils.m23679a(adUnit) && d < adUnit.m2002d()) {
            Adapter m24273e = AdapterRepository.m24274d().m24273e(adUnit.m1996j());
            m24273e.setBiddingResult(adUnit.m2004b(), false, Platform.APPLOVINMAX, adUnit.m2002d());
            m24273e.destroyCacheAd(adUnit.m2004b());
            m12964p(adUnit.m2004b(), true);
            return true;
        }
        return false;
    }

    @Override // p843q5.InHouseLoadStrategy
    /* renamed from: o */
    public void mo12121o(String str, AdError adError) {
        super.mo12121o(str, adError);
        m12964p(str, false);
    }

    @Override // p843q5.InHouseLoadStrategy, com.meevii.adsdk.common.Adapter.IAdShowListener
    public void onADClose(String str, String str2, Bundle bundle) {
        super.onADClose(str, str2, bundle);
        m12964p(str, false);
    }

    @Override // p843q5.InHouseLoadStrategy, com.meevii.adsdk.common.Adapter.IAdLoadListener
    public void onLoadError(String str, String str2, AdError adError) {
        super.onLoadError(str, str2, adError);
        m12964p(str, true);
    }

    /* renamed from: r */
    protected abstract AdUnit mo12119r(Adapter adapter, AdUnit adUnit);

    @Override // p843q5.InHouseLoadStrategy, p798n5.LoadApi
    public AdUnit show() {
        AdUnit m12969j = m12969j();
        AdUnit adUnit = null;
        if (m12969j == null) {
            return null;
        }
        try {
            adUnit = mo12119r(AdapterRepository.m24274d().m24273e(m12969j.m1996j()), m12969j);
            m12120s(adUnit);
            return adUnit;
        } catch (Throwable th) {
            th.printStackTrace();
            mo12121o(m12969j.m2004b(), AdError.AdShowFail.createExtraMsgError(th.getMessage()));
            return adUnit;
        }
    }
}
