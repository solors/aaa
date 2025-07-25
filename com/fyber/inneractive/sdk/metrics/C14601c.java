package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.metrics.c */
/* loaded from: classes4.dex */
public final class C14601c extends AbstractC14599a {

    /* renamed from: g */
    public static final String f27657g = String.valueOf(24);

    /* renamed from: h */
    public static final String f27658h = String.valueOf(3);

    /* renamed from: i */
    public static final String f27659i = String.valueOf(24);

    /* renamed from: j */
    public static final String f27660j = String.valueOf(3);

    /* renamed from: b */
    public final String f27661b;

    /* renamed from: c */
    public final UnitDisplayType f27662c;

    /* renamed from: d */
    public final AbstractC15386e f27663d;

    /* renamed from: e */
    public final InneractiveAdRequest f27664e;

    /* renamed from: f */
    public final JSONArray f27665f;

    public C14601c(AbstractC15386e abstractC15386e, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f27663d = abstractC15386e;
        this.f27664e = inneractiveAdRequest;
        this.f27661b = str;
        this.f27662c = unitDisplayType;
        this.f27665f = jSONArray;
    }

    /* renamed from: a */
    public final void m77772a() {
        C14602d c14602d = C14602d.f27666d;
        InterfaceC14605g m77771a = c14602d.m77771a(this.f27661b);
        HashMap mo77760j = m77771a.mo77760j();
        if (!m77771a.mo77769a()) {
            IAlog.m76529a("MetricCreativeReporter: Metric data not valid, data: %s", c14602d.m77771a(this.f27661b).toString());
            return;
        }
        c14602d.f27667a.remove(this.f27661b);
        AbstractC15465p.f30611a.execute(new RunnableC14600b(this, m77771a, mo77760j));
    }
}
