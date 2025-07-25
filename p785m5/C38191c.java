package p785m5;

import p1038x5.AdUnit;
import p635d6.AdImpressionData;

/* compiled from: AdUnitInfo.java */
/* renamed from: m5.c */
/* loaded from: classes6.dex */
public class C38191c {

    /* renamed from: a */
    private boolean f101023a;

    /* renamed from: b */
    private AdFilledData f101024b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C38191c m15431a() {
        C38191c c38191c = new C38191c();
        c38191c.f101023a = false;
        c38191c.f101024b = new AdFilledData();
        return c38191c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C38191c m15430b(AdUnit adUnit) {
        if (adUnit == null) {
            return m15431a();
        }
        C38191c c38191c = new C38191c();
        c38191c.f101023a = true;
        c38191c.f101024b = AdImpressionData.m25726k(adUnit.m2004b());
        return c38191c;
    }

    /* renamed from: c */
    public AdFilledData m15429c() {
        return this.f101024b;
    }

    /* renamed from: d */
    public boolean m15428d() {
        return this.f101023a;
    }

    public String toString() {
        return "AdUnitInfo{isValid=" + this.f101023a + ", AdFilledData=" + this.f101024b + '}';
    }
}
