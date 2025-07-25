package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C14364k;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.timeouts.request.c */
/* loaded from: classes4.dex */
public final class C14736c extends AbstractC14734a {

    /* renamed from: m */
    public double f27919m;

    public C14736c(String str, C14364k c14364k, String str2) {
        super(str, c14364k, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77661a(C14364k c14364k, String str) {
        return c14364k.m77952b(str, this.f27918l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: b */
    public final int mo77660b(C14364k c14364k, String str) {
        String str2 = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "min", "rat", "bidding", C14364k.m77949e(str2));
        String m77953a2 = C14364k.m77953a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer mo77934a = c14364k.mo77934a(m77953a2);
        int intValue = mo77934a != null ? mo77934a.intValue() : 5000;
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        return mo77934a2 != null ? mo77934a2.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: c */
    public final int mo77659c(C14364k c14364k, String str) {
        String str2 = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a(str, "rat", "bidding", "perc", C14364k.m77949e(str2));
        String m77953a2 = C14364k.m77953a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer mo77934a = c14364k.mo77934a(m77953a2);
        int intValue = mo77934a != null ? mo77934a.intValue() : 15;
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        return mo77934a2 != null ? mo77934a2.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: d */
    public final void mo77663d(C14364k c14364k, String str) {
        boolean z;
        int i;
        int i2;
        super.mo77663d(c14364k, str);
        Boolean mo77930c = c14364k.mo77930c("reverse_retries");
        if (mo77930c != null) {
            z = mo77930c.booleanValue();
        } else {
            z = true;
        }
        this.f27912g = z;
        String m77953a = C14364k.m77953a("retry_interval", "rat", "bidding");
        Integer mo77934a = c14364k.mo77934a(C14364k.m77953a("retry_interval", "all_mediators"));
        if (mo77934a != null) {
            i = mo77934a.intValue();
        } else {
            i = 100;
        }
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        if (mo77934a2 != null) {
            i = mo77934a2.intValue();
        }
        this.f27910e = i;
        this.f27908c = (this.f27915i + this.f27914h) - (i + this.f27911f);
        String m77953a2 = C14364k.m77953a("bidding", "irat", C14364k.m77949e(this.f27918l));
        Integer mo77934a3 = c14364k.mo77934a(C14364k.m77953a("bidding", "irat", "all_mediators"));
        if (mo77934a3 != null) {
            i2 = mo77934a3.intValue();
        } else {
            i2 = 10000;
        }
        Integer mo77934a4 = c14364k.mo77934a(m77953a2);
        if (mo77934a4 != null) {
            i2 = mo77934a4.intValue();
        }
        this.f27909d = i2;
        this.f27919m = Math.min(this.f27917k, this.f27916j) / Math.max(this.f27917k, this.f27916j);
        m77665b(this.f27909d);
        this.f27906a = Math.max(0, m77669a());
        if (this.f27912g) {
            IAlog.m76529a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.m76531a(this));
            mo77667a(0);
        }
        IAlog.m76529a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.m76531a(this), Integer.valueOf(this.f27906a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77662a(C14364k c14364k) {
        String str = this.f27918l;
        c14364k.getClass();
        String m77953a = C14364k.m77953a("timeout", "threshold", "rat", "bidding", C14364k.m77949e(str));
        Integer mo77934a = c14364k.mo77934a(C14364k.m77953a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int intValue = mo77934a != null ? mo77934a.intValue() : 300;
        Integer mo77934a2 = c14364k.mo77934a(m77953a);
        return mo77934a2 != null ? mo77934a2.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: c */
    public final int mo77664c() {
        return this.f27910e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: a */
    public final int mo77667a(int i) {
        if (this.f27912g) {
            i = this.f27906a - i;
        }
        int i2 = (this.f27907b * i) + this.f27909d;
        IAlog.m76529a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.m76531a(this), Integer.valueOf(i2), Integer.valueOf(i));
        m77665b(i2);
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC14734a
    /* renamed from: b */
    public final int mo77666b() {
        return this.f27906a;
    }

    /* renamed from: b */
    public final void m77665b(int i) {
        double d = this.f27919m;
        if (d == 1.0d || d == 0.0d) {
            IAlog.m76529a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.m76531a(this), Double.valueOf(this.f27919m));
            this.f27919m = 0.5d;
        }
        int i2 = (int) (i * this.f27919m);
        this.f27914h = i2;
        this.f27915i = i - i2;
        IAlog.m76529a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.m76531a(this), Integer.valueOf(this.f27915i), Integer.valueOf(this.f27914h));
    }
}
