package p635d6;

import p1038x5.AdUnit;
import p1038x5.DataRepository;
import p1038x5.StatsIdStore;
import p785m5.AdFilledData;

/* renamed from: d6.a */
/* loaded from: classes6.dex */
public class AdImpressionData extends AdFilledData {
    /* renamed from: k */
    public static AdImpressionData m25726k(String str) {
        AdImpressionData adImpressionData = new AdImpressionData();
        AdUnit m1977c = DataRepository.m1979a().m1977c(str);
        if (m1977c == null) {
            return adImpressionData;
        }
        adImpressionData.f101000a = m1977c.m1998h();
        adImpressionData.f101001b = StatsIdStore.m1916a().m1915b(m1977c.m1998h());
        adImpressionData.f101002c = m1977c.m1996j();
        adImpressionData.f101003d = str;
        adImpressionData.f101004e = m1977c.m2005a();
        adImpressionData.f101005f = m1977c.m2001e();
        adImpressionData.f101006g = m1977c.m2002d();
        adImpressionData.f101007h = m1977c.m1992n();
        adImpressionData.f101008i = m1977c.m1993m();
        return adImpressionData;
    }
}
