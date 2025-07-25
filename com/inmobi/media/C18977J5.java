package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.C18977J5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38513v;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.J5 */
/* loaded from: classes6.dex */
public final class C18977J5 {

    /* renamed from: a */
    public final C19422q3 f47368a;

    /* renamed from: b */
    public String f47369b;

    /* renamed from: c */
    public int f47370c;

    /* renamed from: d */
    public int f47371d;

    /* renamed from: e */
    public boolean f47372e;

    /* renamed from: f */
    public boolean f47373f;

    /* renamed from: g */
    public boolean f47374g;

    /* renamed from: h */
    public boolean f47375h;

    /* renamed from: i */
    public final InterfaceC38501j f47376i;

    /* renamed from: j */
    public final InterfaceC38501j f47377j;

    /* renamed from: k */
    public final long f47378k;

    /* renamed from: l */
    public final long f47379l;

    public C18977J5(C19422q3 browserClient) {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        TelemetryConfig telemetryConfig;
        long j;
        Intrinsics.checkNotNullParameter(browserClient, "browserClient");
        this.f47368a = browserClient;
        this.f47369b = "";
        m14554a = LazyJVM.m14554a(C18935G5.f47264a);
        this.f47376i = m14554a;
        m14554a2 = LazyJVM.m14554a(C18921F5.f47232a);
        this.f47377j = m14554a2;
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        Config m60081a = C19351l2.m60081a("telemetry", C18954Ha.m61076b(), null);
        if (m60081a instanceof TelemetryConfig) {
            telemetryConfig = (TelemetryConfig) m60081a;
        } else {
            telemetryConfig = null;
        }
        TelemetryConfig.LandingPageConfig lpConfig = telemetryConfig != null ? telemetryConfig.getLpConfig() : null;
        if (lpConfig != null) {
            j = lpConfig.getEbRedirectionInterval();
        } else {
            j = 1000;
        }
        this.f47378k = j;
        this.f47379l = lpConfig != null ? lpConfig.getEbDeeplinkFallbackInterval() : 1000L;
    }

    /* renamed from: a */
    public final void m60995a() {
        ExecutorC19285g6 executorC19285g6 = (ExecutorC19285g6) AbstractC18933G3.f47261d.getValue();
        Runnable runnable = new Runnable() { // from class: o3.d0
            {
                C18977J5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18977J5.m60994a(C18977J5.this);
            }
        };
        executorC19285g6.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC19285g6.f48256a.post(runnable);
    }

    /* renamed from: b */
    public final void m60993b() {
        ExecutorC19285g6 executorC19285g6 = (ExecutorC19285g6) AbstractC18933G3.f47261d.getValue();
        Runnable runnable = new Runnable() { // from class: o3.e0
            {
                C18977J5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18977J5.m60992b(C18977J5.this);
            }
        };
        executorC19285g6.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC19285g6.f48256a.post(runnable);
    }

    /* renamed from: c */
    public final void m60991c() {
        if (!this.f47372e && !this.f47374g) {
            this.f47374g = true;
            ((Timer) this.f47376i.getValue()).cancel();
            try {
                ((Timer) this.f47377j.getValue()).schedule(new C18949H5(this), this.f47379l);
            } catch (Exception e) {
                C19070Q4 c19070q4 = C19070Q4.f47635a;
                C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
            }
            this.f47375h = true;
        }
    }

    /* renamed from: d */
    public final void m60990d() {
        this.f47372e = true;
        ((Timer) this.f47376i.getValue()).cancel();
        ((Timer) this.f47377j.getValue()).cancel();
        this.f47375h = false;
    }

    /* renamed from: a */
    public static final void m60994a(C18977J5 this$0) {
        Map m17279o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.f47370c;
        if (i != 3) {
            if (i == 2) {
                this$0.f47368a.m59933a();
                this$0.m60990d();
                return;
            }
            return;
        }
        C19422q3 c19422q3 = this$0.f47368a;
        int i2 = this$0.f47371d;
        C18893D5 c18893d5 = c19422q3.f48596h;
        if (c18893d5 != null) {
            C18977J5 c18977j5 = c19422q3.f48595g;
            m17279o = C37559r0.m17279o(C38513v.m14532a("trigger", c18893d5.m61163a(c18977j5 != null ? c18977j5.f47369b : null)), C38513v.m14532a("errorCode", Integer.valueOf(i2)));
            c18893d5.m61158a("landingsCompleteFailed", m17279o);
        }
        this$0.m60990d();
    }

    /* renamed from: b */
    public static final void m60992b(C18977J5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f47372e) {
            return;
        }
        this$0.m60995a();
    }
}
