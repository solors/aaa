package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class GeoParsedResult extends ParsedResult {

    /* renamed from: b */
    private final double f44281b;

    /* renamed from: c */
    private final double f44282c;

    /* renamed from: d */
    private final double f44283d;

    /* renamed from: e */
    private final String f44284e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoParsedResult(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.f44281b = d;
        this.f44282c = d2;
        this.f44283d = d3;
        this.f44284e = str;
    }

    public double getAltitude() {
        return this.f44283d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f44281b);
        sb2.append(", ");
        sb2.append(this.f44282c);
        if (this.f44283d > 0.0d) {
            sb2.append(", ");
            sb2.append(this.f44283d);
            sb2.append('m');
        }
        if (this.f44284e != null) {
            sb2.append(" (");
            sb2.append(this.f44284e);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public String getGeoURI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:");
        sb2.append(this.f44281b);
        sb2.append(',');
        sb2.append(this.f44282c);
        if (this.f44283d > 0.0d) {
            sb2.append(',');
            sb2.append(this.f44283d);
        }
        if (this.f44284e != null) {
            sb2.append('?');
            sb2.append(this.f44284e);
        }
        return sb2.toString();
    }

    public double getLatitude() {
        return this.f44281b;
    }

    public double getLongitude() {
        return this.f44282c;
    }

    public String getQuery() {
        return this.f44284e;
    }
}
