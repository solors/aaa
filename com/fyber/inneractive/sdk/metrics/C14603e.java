package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.metrics.e */
/* loaded from: classes4.dex */
public final class C14603e implements InterfaceC14605g {

    /* renamed from: a */
    public Long f27670a = null;

    /* renamed from: b */
    public Long f27671b = null;

    /* renamed from: c */
    public Long f27672c = null;

    /* renamed from: d */
    public Long f27673d = null;

    /* renamed from: e */
    public Long f27674e = null;

    /* renamed from: f */
    public Long f27675f = null;

    /* renamed from: g */
    public Long f27676g = null;

    /* renamed from: h */
    public Long f27677h = null;

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: a */
    public final boolean mo77769a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: b */
    public final Long mo77768b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27676g = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: c */
    public final Long mo77767c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27670a = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: d */
    public final Long mo77766d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27673d = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: e */
    public final Long mo77765e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27675f = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: f */
    public final Long mo77764f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27671b = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: g */
    public final Long mo77763g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27672c = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: h */
    public final Long mo77762h() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27677h = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: i */
    public final Long mo77761i() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f27674e = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.InterfaceC14605g
    /* renamed from: j */
    public final HashMap mo77760j() {
        HashMap hashMap = new HashMap();
        Long l = this.f27671b;
        if (l != null && this.f27670a != null) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f27670a.longValue()));
        }
        Long l2 = this.f27677h;
        if (l2 != null && this.f27671b != null) {
            hashMap.put("sdk_got_response_from_markup_url", Long.valueOf(l2.longValue() - this.f27671b.longValue()));
        }
        Long l3 = this.f27673d;
        if (l3 != null && this.f27677h != null) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f27677h.longValue()));
        }
        Long l4 = this.f27672c;
        if (l4 != null && this.f27671b != null) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l4.longValue() - this.f27671b.longValue()));
        }
        Long l5 = this.f27673d;
        if (l5 != null && this.f27672c != null) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l5.longValue() - this.f27672c.longValue()));
        }
        Long l6 = this.f27674e;
        if (l6 != null && this.f27673d != null) {
            hashMap.put("ad_loaded_result", Long.valueOf(l6.longValue() - this.f27673d.longValue()));
        }
        Long l7 = this.f27675f;
        if (l7 != null && this.f27674e != null) {
            hashMap.put("publisher_notified", Long.valueOf(l7.longValue() - this.f27674e.longValue()));
        }
        Long l8 = this.f27676g;
        if (l8 != null && this.f27670a != null) {
            hashMap.put("roundtrip", Long.valueOf(l8.longValue() - this.f27670a.longValue()));
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f27670a != null && this.f27671b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f27671b.longValue() - this.f27670a.longValue());
        }
        if (this.f27677h != null && this.f27671b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f27677h.longValue() - this.f27671b.longValue());
        }
        if (this.f27672c != null && this.f27671b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f27672c.longValue() - this.f27671b.longValue());
        }
        if (this.f27673d != null && this.f27672c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f27673d.longValue() - this.f27672c.longValue());
        }
        if (this.f27674e != null && this.f27673d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f27674e.longValue() - this.f27673d.longValue());
        }
        if (this.f27675f != null && this.f27674e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f27675f.longValue() - this.f27674e.longValue());
        }
        if (this.f27676g != null && this.f27670a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f27676g.longValue() - this.f27670a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
