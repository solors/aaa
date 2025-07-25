package com.p551my.tracker.ads;

/* renamed from: com.my.tracker.ads.AdEventBuilder */
/* loaded from: classes7.dex */
public final class AdEventBuilder {

    /* renamed from: a */
    final int f68440a;

    /* renamed from: b */
    final int f68441b;

    /* renamed from: c */
    final double f68442c;

    /* renamed from: d */
    final String f68443d;

    /* renamed from: e */
    String f68444e;

    /* renamed from: f */
    String f68445f;

    /* renamed from: g */
    String f68446g;

    /* renamed from: h */
    String f68447h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.f68440a = i;
        this.f68441b = i2;
        this.f68442c = d;
        this.f68443d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d, String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f68440a, this.f68441b, this.f68442c, this.f68443d, this.f68444e, this.f68445f, this.f68446g, this.f68447h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.f68447h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.f68446g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f68445f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.f68444e = str;
        return this;
    }
}
