package com.inmobi.commons.core.configs;

import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC19401oa;
import com.inmobi.media.C19019M5;
import com.inmobi.media.C19050Oa;
import com.inmobi.media.C19063Pa;
import com.inmobi.media.C19076Qa;
import com.inmobi.media.C19088Ra;
import com.inmobi.media.C19299h6;
import com.inmobi.media.C19368m5;
import com.inmobi.media.C19415pa;

/* renamed from: com.inmobi.commons.core.configs.f */
/* loaded from: classes6.dex */
public final class C18844f {
    /* renamed from: a */
    public static C19368m5 m61279a() {
        return new C19368m5().m60032a(new C19415pa("carrierNames", SignalsConfig.NovatiqConfig.class), (AbstractC19401oa) new C19019M5(new C19050Oa(), String.class)).m60032a(new C19415pa("control", SignalsConfig.SessionConfig.class), (AbstractC19401oa) new C19019M5(new C19063Pa(), Integer.TYPE)).m60032a(new C19415pa("generalKeys", SignalsConfig.PublisherConfig.class), (AbstractC19401oa) new C19299h6(new C19076Qa(), String.class)).m60032a(new C19415pa("adSpecificKeys", SignalsConfig.PublisherConfig.class), (AbstractC19401oa) new C19299h6(new C19088Ra(), String.class));
    }
}
