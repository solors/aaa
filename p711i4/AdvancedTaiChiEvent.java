package p711i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AFInAppEventParameterName;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.jetbrains.annotations.NotNull;
import p633d4.GrtAdImpressionData;
import p681g4.AdvancedTaiChiModel;
import p681g4.BaseGrtModel;
import p737j4.C37279b;
import p737j4.C37287d;

/* renamed from: i4.a */
/* loaded from: classes6.dex */
public class AdvancedTaiChiEvent extends BaseGrtEvent<AdvancedTaiChiModel> {

    /* renamed from: d */
    private final String f91879d;

    /* renamed from: e */
    private C37287d.C37290c f91880e;

    /* compiled from: AdvancedTaiChiEvent.java */
    /* renamed from: i4.a$a */
    /* loaded from: classes6.dex */
    static class C33601a implements Comparator<AdvancedTaiChiModel.C33185a.C33187b> {
        C33601a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AdvancedTaiChiModel.C33185a.C33187b c33187b, AdvancedTaiChiModel.C33185a.C33187b c33187b2) {
            int compare = Integer.compare(c33187b2.m24460a(), c33187b.m24460a());
            if (compare != 0) {
                return compare;
            }
            return Double.compare(c33187b2.m24458c(), c33187b.m24458c());
        }
    }

    public AdvancedTaiChiEvent(AdvancedTaiChiModel advancedTaiChiModel) {
        super(advancedTaiChiModel);
        this.f91879d = "adsdk_advanced_taichi";
    }

    /* renamed from: n */
    private String m23182n(C37287d.C37290c c37290c, String str) {
        try {
            return c37290c.m18559c(str, "0");
        } catch (Throwable th) {
            Log.d("TAG", "getLastReportLtv error", th);
            return "0";
        }
    }

    /* renamed from: o */
    private C37287d.C37290c m23181o() {
        if (this.f91880e == null) {
            this.f91880e = C37287d.m18566a().m18564c(C37279b.m18579k().m18578l(), "adsdk_advanced_taichi");
        }
        return this.f91880e;
    }

    /* renamed from: p */
    private void m23180p(AdvancedTaiChiModel.C33185a c33185a, double d) {
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString("currency", "USD");
        BaseGrtModel.C33189a m24470b = c33185a.m24470b();
        List<String> m24433f = m24470b.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23169i(c33185a.m24469c(), bundle, m24470b);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(c33185a.m24469c(), bundle2, m24433f, m24470b);
        List<String> m24434e = m24470b.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(c33185a.m24469c(), bundle, m24434e, m24470b);
    }

    /* renamed from: q */
    private void m23179q(@NotNull AdvancedTaiChiModel.C33185a c33185a, @NotNull AdvancedTaiChiModel.C33185a.C33186a c33186a, double d) {
        C37287d.C37290c m23181o = m23181o();
        double parseDouble = d - Double.parseDouble(m23182n(m23181o, c33185a.m24469c() + "life"));
        if (parseDouble > c33186a.m24464b()) {
            SharedPreferences.Editor m18561a = m23181o().m18561a();
            Iterator<AdvancedTaiChiModel.C33185a.C33187b> it = c33186a.m24465a().iterator();
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    AdvancedTaiChiModel.C33185a.C33187b next = it.next();
                    if (d > next.m24458c() && m23171c().m23140b() == next.m24460a()) {
                        m18561a.putString(c33185a.m24469c() + "life", String.valueOf(d));
                        m18561a.putString(c33185a.m24469c() + "life_multiplier", String.valueOf(next.m24459b()));
                        while (i < next.m24459b()) {
                            m23180p(c33185a, parseDouble);
                            i++;
                        }
                        m18561a.apply();
                        return;
                    }
                } else {
                    C37287d.C37290c m23181o2 = m23181o();
                    int parseInt = Integer.parseInt(m23182n(m23181o2, c33185a.m24469c() + "life_multiplier"));
                    while (i < parseInt) {
                        m23180p(c33185a, parseDouble);
                        i++;
                    }
                    m18561a.putString(c33185a.m24469c() + "life", String.valueOf(d)).apply();
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private void m23178r(@NotNull AdvancedTaiChiModel.C33185a c33185a, @NotNull AdvancedTaiChiModel.C33185a.C33186a c33186a, double d) {
        C37287d.C37290c m23181o = m23181o();
        double parseDouble = d - Double.parseDouble(m23182n(m23181o, c33185a.m24469c() + "ltv"));
        if (parseDouble > c33186a.m24464b()) {
            for (AdvancedTaiChiModel.C33185a.C33187b c33187b : c33186a.m24465a()) {
                if (d > c33187b.m24458c()) {
                    SharedPreferences.Editor m18561a = m23181o().m18561a();
                    m18561a.putString(c33185a.m24469c() + "ltv", String.valueOf(d)).apply();
                    for (int i = 0; i < c33187b.m24459b(); i++) {
                        m23180p(c33185a, parseDouble);
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: s */
    private void m23177s(@NotNull AdvancedTaiChiModel.C33185a c33185a, @NotNull AdvancedTaiChiModel.C33185a.C33186a c33186a, double d) {
        C37287d.C37290c m23181o = m23181o();
        double parseDouble = d - Double.parseDouble(m23182n(m23181o, c33185a.m24469c() + SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO));
        if (parseDouble > c33186a.m24464b()) {
            SharedPreferences.Editor m18561a = m23181o().m18561a();
            m18561a.putString(c33185a.m24469c() + SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO, String.valueOf(d)).apply();
            m23180p(c33185a, parseDouble);
        }
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        super.mo23144d(grtAdImpressionData);
        double m23172b = m23172b();
        for (AdvancedTaiChiModel.C33185a c33185a : m23173a().m24474c()) {
            if (c33185a.m24471a() != null && !c33185a.m24471a().isEmpty()) {
                AdvancedTaiChiModel.C33185a.C33186a c33186a = c33185a.m24471a().get(m23171c().m23141a());
                if (c33186a == null) {
                    c33186a = c33185a.m24471a().get("global");
                }
                if (c33186a != null) {
                    if (c33186a.m24465a() != null && !c33186a.m24465a().isEmpty()) {
                        boolean z = false;
                        if (c33186a.m24465a().get(0).m24460a() < 0) {
                            z = true;
                        }
                        Collections.sort(c33186a.m24465a(), new C33601a());
                        if (z) {
                            m23178r(c33185a, c33186a, m23172b);
                        } else {
                            m23179q(c33185a, c33186a, m23172b);
                        }
                    } else {
                        m23177s(c33185a, c33186a, m23172b);
                    }
                }
            }
        }
    }
}
