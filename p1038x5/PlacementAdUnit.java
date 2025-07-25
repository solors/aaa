package p1038x5;

import com.meevii.adsdk.common.AdType;
import com.meevii.adsdk.common.util.LogUtil;
import com.meevii.adsdk.core.config.model.AdConfigResult;
import com.meevii.adsdk.core.config.model.Plan;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p696h6.SampleUtils;

/* renamed from: x5.d */
/* loaded from: classes6.dex */
public class PlacementAdUnit {

    /* renamed from: a */
    private List<AdUnit> f117456a;

    /* renamed from: b */
    private List<AdUnit> f117457b;

    /* renamed from: c */
    protected String f117458c;

    /* renamed from: d */
    protected AdType f117459d;

    /* renamed from: e */
    public int f117460e;

    /* renamed from: f */
    public int f117461f;

    /* renamed from: g */
    public int f117462g;

    /* renamed from: h */
    private boolean f117463h;

    /* renamed from: i */
    private String f117464i;

    /* renamed from: j */
    private String f117465j;

    public PlacementAdUnit(AdConfigResult.StrategyResult strategyResult, List<AdUnit> list) {
        boolean z;
        this.f117456a = list;
        Plan plan = strategyResult.getPlan();
        this.f117464i = strategyResult.getStrategyId();
        this.f117465j = strategyResult.getPlanId();
        this.f117458c = plan.getPlacementName();
        this.f117459d = AdType.fromStr(plan.getPlacementType());
        this.f117460e = plan.getBannerRefreshSeconds();
        this.f117461f = plan.getAutoLoadSeconds();
        this.f117462g = plan.getSampleSize();
        if (SampleUtils.m23665a() < this.f117462g) {
            z = true;
        } else {
            z = false;
        }
        this.f117463h = z;
        m1946p(this.f117456a);
    }

    /* renamed from: m */
    public static /* synthetic */ int m1949m(AdUnit adUnit, AdUnit adUnit2) {
        if (adUnit.m2001e() == adUnit2.m2001e()) {
            return 0;
        }
        if (adUnit.m2001e() < adUnit2.m2001e()) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public boolean m1960b(AdType adType) {
        for (AdUnit adUnit : this.f117456a) {
            if (adUnit.m2005a() == adType) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public AdType m1959c() {
        return this.f117459d;
    }

    /* renamed from: d */
    public List<AdUnit> m1958d() {
        return this.f117456a;
    }

    /* renamed from: e */
    public int m1957e() {
        return this.f117460e;
    }

    /* renamed from: f */
    public String m1956f() {
        return this.f117458c;
    }

    /* renamed from: g */
    public String m1955g() {
        return this.f117465j;
    }

    /* renamed from: h */
    public List<AdUnit> m1954h() {
        return this.f117457b;
    }

    /* renamed from: i */
    public String m1953i() {
        return this.f117464i;
    }

    /* renamed from: j */
    public boolean m1952j() {
        return this.f117463h;
    }

    /* renamed from: k */
    public boolean m1951k() {
        List<AdUnit> list = this.f117457b;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m1950l(AdType adType) {
        Iterator<AdUnit> it = this.f117456a.iterator();
        while (it.hasNext()) {
            if (it.next().m2005a() != adType) {
                it.remove();
            }
        }
    }

    /* renamed from: n */
    public void m1948n(List<AdUnit> list) {
        this.f117457b = list;
        m1946p(list);
    }

    /* renamed from: o */
    public void m1947o() {
        m1946p(this.f117456a);
        m1946p(this.f117457b);
    }

    /* renamed from: p */
    public void m1946p(List<AdUnit> list) {
        if (list == null) {
            return;
        }
        if (list.size() <= 1) {
            LogUtil.m48060i("ADSDK.PlacementAdUnit", "AdUnit is empty or size=1, not sort，pid :" + m1956f());
            return;
        }
        Collections.sort(list, new Comparator() { // from class: x5.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m1949m;
                m1949m = PlacementAdUnit.m1949m((AdUnit) obj, (AdUnit) obj2);
                return m1949m;
            }
        });
        if (LogUtil.isShowLog()) {
            LogUtil.m48060i("ADSDK.PlacementAdUnit", "sortAdUnitByPrice  AdUnit sort by price for pid :" + m1956f());
            for (AdUnit adUnit : list) {
                LogUtil.m48060i("ADSDK.PlacementAdUnit", "sortAdUnitByPrice adUnit  :" + adUnit.m1996j() + "  :  " + adUnit.m2004b() + " ecpm :" + adUnit.m2001e());
            }
        }
    }
}
