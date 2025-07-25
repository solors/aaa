package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jl */
/* loaded from: classes9.dex */
public final class C34650jl {

    /* renamed from: A */
    public final C33952Hl f94718A;

    /* renamed from: B */
    public final Map f94719B;

    /* renamed from: C */
    public final C35061z9 f94720C;

    /* renamed from: a */
    public final String f94721a;

    /* renamed from: b */
    public final String f94722b;

    /* renamed from: c */
    public final C34758nl f94723c;

    /* renamed from: d */
    public final String f94724d;

    /* renamed from: e */
    public final List f94725e;

    /* renamed from: f */
    public final List f94726f;

    /* renamed from: g */
    public final List f94727g;

    /* renamed from: h */
    public final Map f94728h;

    /* renamed from: i */
    public final String f94729i;

    /* renamed from: j */
    public final String f94730j;

    /* renamed from: k */
    public final String f94731k;

    /* renamed from: l */
    public final String f94732l;

    /* renamed from: m */
    public final String f94733m;

    /* renamed from: n */
    public final C33760A4 f94734n;

    /* renamed from: o */
    public final long f94735o;

    /* renamed from: p */
    public final boolean f94736p;

    /* renamed from: q */
    public final boolean f94737q;

    /* renamed from: r */
    public final String f94738r;

    /* renamed from: s */
    public final C34160Qd f94739s;

    /* renamed from: t */
    public final RetryPolicyConfig f94740t;

    /* renamed from: u */
    public final long f94741u;

    /* renamed from: v */
    public final long f94742v;

    /* renamed from: w */
    public final boolean f94743w;

    /* renamed from: x */
    public final BillingConfig f94744x;

    /* renamed from: y */
    public final C34951v3 f94745y;

    /* renamed from: z */
    public final C34739n2 f94746z;

    public C34650jl(String str, String str2, C34758nl c34758nl) {
        this.f94721a = str;
        this.f94722b = str2;
        this.f94723c = c34758nl;
        this.f94724d = c34758nl.f95040a;
        this.f94725e = c34758nl.f95041b;
        this.f94726f = c34758nl.f95045f;
        this.f94727g = c34758nl.f95046g;
        this.f94728h = c34758nl.f95048i;
        this.f94729i = c34758nl.f95042c;
        this.f94730j = c34758nl.f95043d;
        this.f94731k = c34758nl.f95049j;
        this.f94732l = c34758nl.f95050k;
        this.f94733m = c34758nl.f95051l;
        this.f94734n = c34758nl.f95052m;
        this.f94735o = c34758nl.f95053n;
        this.f94736p = c34758nl.f95054o;
        this.f94737q = c34758nl.f95055p;
        this.f94738r = c34758nl.f95056q;
        this.f94739s = c34758nl.f95058s;
        this.f94740t = c34758nl.f95059t;
        this.f94741u = c34758nl.f95060u;
        this.f94742v = c34758nl.f95061v;
        this.f94743w = c34758nl.f95062w;
        this.f94744x = c34758nl.f95063x;
        this.f94745y = c34758nl.f95064y;
        this.f94746z = c34758nl.f95065z;
        this.f94718A = c34758nl.f95037A;
        this.f94719B = c34758nl.f95038B;
        this.f94720C = c34758nl.f95039C;
    }

    /* renamed from: a */
    public final String m21500a() {
        return this.f94721a;
    }

    /* renamed from: b */
    public final String m21499b() {
        return this.f94722b;
    }

    /* renamed from: c */
    public final long m21498c() {
        return this.f94742v;
    }

    /* renamed from: d */
    public final long m21497d() {
        return this.f94741u;
    }

    /* renamed from: e */
    public final String m21496e() {
        return this.f94724d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f94721a + ", deviceIdHash=" + this.f94722b + ", startupStateModel=" + this.f94723c + ')';
    }
}
