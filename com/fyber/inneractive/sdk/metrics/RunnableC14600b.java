package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C14396o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.metrics.b */
/* loaded from: classes4.dex */
public final class RunnableC14600b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC14605g f27654a;

    /* renamed from: b */
    public final /* synthetic */ Map f27655b;

    /* renamed from: c */
    public final /* synthetic */ C14601c f27656c;

    public RunnableC14600b(C14601c c14601c, InterfaceC14605g interfaceC14605g, Map map) {
        this.f27656c = c14601c;
        this.f27654a = interfaceC14605g;
        this.f27655b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        UnitDisplayType unitDisplayType;
        int m76461a;
        int m76461a2;
        String str2;
        IAlog.m76529a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        C14601c c14601c = this.f27656c;
        UnitDisplayType unitDisplayType2 = c14601c.f27662c;
        if (unitDisplayType2 != null && (unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            IAlog.m76529a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f27654a.toString());
            C14396o c14396o = IAConfigManager.f27060O.f27097u.f27275b;
            UnitDisplayType unitDisplayType3 = this.f27656c.f27662c;
            if (unitDisplayType3 != unitDisplayType && unitDisplayType3 != UnitDisplayType.MRECT) {
                String m77918a = c14396o.m77918a("ad_metrics_interval_interstitial", C14601c.f27659i);
                String m77918a2 = c14396o.m77918a("ad_metrics_limit_interstitial", C14601c.f27660j);
                m76461a = AbstractC15471s.m76461a(m77918a, 24);
                m76461a2 = AbstractC15471s.m76461a(m77918a2, 3);
                str2 = "LastSentMetricsInterstitial";
            } else {
                String m77918a3 = c14396o.m77918a("ad_metrics_interval_banner", C14601c.f27657g);
                String m77918a4 = c14396o.m77918a("ad_metrics_limit_banner", C14601c.f27658h);
                m76461a = AbstractC15471s.m76461a(m77918a3, 24);
                m76461a2 = AbstractC15471s.m76461a(m77918a4, 3);
                str2 = "LastSentMetricsBanner";
            }
            Application application = AbstractC15459m.f30607a;
            if (application != null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = new JSONArray(sharedPreferences.getString(str2, "[]"));
                } catch (JSONException unused) {
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                if (c14396o.m77916a(false, this.f27656c.f27653a) && !AbstractC14599a.m77773a(m76461a, m76461a2, jSONArray, copyOnWriteArrayList)) {
                    copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                    C14601c c14601c2 = this.f27656c;
                    InneractiveAdRequest inneractiveAdRequest = c14601c2.f27664e;
                    AbstractC15386e abstractC15386e = c14601c2.f27663d;
                    Map map = this.f27655b;
                    try {
                        EnumC14738u enumC14738u = EnumC14738u.METRIC_MEASUREMENTS_EVENT;
                        JSONArray jSONArray2 = c14601c2.f27665f;
                        C14740w c14740w = new C14740w(abstractC15386e);
                        c14740w.f27931c = enumC14738u;
                        c14740w.f27929a = inneractiveAdRequest;
                        c14740w.f27932d = jSONArray2;
                        JSONObject jSONObject = new JSONObject();
                        for (String str3 : map.keySet()) {
                            Object obj = map.get(str3);
                            try {
                                jSONObject.put(str3, obj);
                            } catch (Exception unused2) {
                                IAlog.m76524f("Got exception adding param to json object: %s, %s", str3, obj);
                            }
                        }
                        c14740w.f27934f.put(jSONObject);
                        c14740w.m77658a((String) null);
                    } catch (Exception unused3) {
                    }
                }
                sharedPreferences.edit().putString(str2, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
                return;
            }
            return;
        }
        UnitDisplayType unitDisplayType4 = c14601c.f27662c;
        if (unitDisplayType4 != null) {
            str = unitDisplayType4.value();
        } else {
            str = "";
        }
        IAlog.m76529a("Unit display type %s is not supported for metric event", str);
    }
}
