package com.fyber.inneractive.sdk.external;

/* loaded from: classes4.dex */
public class ImpressionData {

    /* renamed from: a */
    public Pricing f27331a = new Pricing();

    /* renamed from: b */
    public Video f27332b;

    /* renamed from: c */
    public String f27333c;

    /* renamed from: d */
    public Long f27334d;

    /* renamed from: e */
    public String f27335e;

    /* renamed from: f */
    public String f27336f;

    /* renamed from: g */
    public String f27337g;

    /* renamed from: h */
    public String f27338h;

    /* renamed from: i */
    public String f27339i;

    /* loaded from: classes4.dex */
    public static class Pricing {

        /* renamed from: a */
        public double f27340a;

        /* renamed from: b */
        public String f27341b;

        public String getCurrency() {
            return this.f27341b;
        }

        public double getValue() {
            return this.f27340a;
        }

        public void setValue(double d) {
            this.f27340a = d;
        }

        public String toString() {
            return "Pricing{value=" + this.f27340a + ", currency='" + this.f27341b + "'}";
        }
    }

    /* loaded from: classes4.dex */
    public static class Video {

        /* renamed from: a */
        public final boolean f27342a;

        /* renamed from: b */
        public long f27343b;

        public Video(boolean z, long j) {
            this.f27342a = z;
            this.f27343b = j;
        }

        public long getDuration() {
            return this.f27343b;
        }

        public boolean isSkippable() {
            return this.f27342a;
        }

        public String toString() {
            return "Video{skippable=" + this.f27342a + ", duration=" + this.f27343b + '}';
        }
    }

    public String getAdvertiserDomain() {
        return this.f27339i;
    }

    public String getCampaignId() {
        return this.f27338h;
    }

    public String getCountry() {
        return this.f27335e;
    }

    public String getCreativeId() {
        return this.f27337g;
    }

    public Long getDemandId() {
        return this.f27334d;
    }

    public String getDemandSource() {
        return this.f27333c;
    }

    public String getImpressionId() {
        return this.f27336f;
    }

    public Pricing getPricing() {
        return this.f27331a;
    }

    public Video getVideo() {
        return this.f27332b;
    }

    public void setAdvertiserDomain(String str) {
        this.f27339i = str;
    }

    public void setCampaignId(String str) {
        this.f27338h = str;
    }

    public void setCountry(String str) {
        this.f27335e = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        this.f27331a.f27340a = d;
    }

    public void setCreativeId(String str) {
        this.f27337g = str;
    }

    public void setCurrency(String str) {
        this.f27331a.f27341b = str;
    }

    public void setDemandId(Long l) {
        this.f27334d = l;
    }

    public void setDemandSource(String str) {
        this.f27333c = str;
    }

    public void setDuration(long j) {
        this.f27332b.f27343b = j;
    }

    public void setImpressionId(String str) {
        this.f27336f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f27331a = pricing;
    }

    public void setVideo(Video video) {
        this.f27332b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f27331a + ", video=" + this.f27332b + ", demandSource='" + this.f27333c + "', country='" + this.f27335e + "', impressionId='" + this.f27336f + "', creativeId='" + this.f27337g + "', campaignId='" + this.f27338h + "', advertiserDomain='" + this.f27339i + "'}";
    }
}
