package com.google.zxing.client.result;

import java.util.Map;

/* loaded from: classes5.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";

    /* renamed from: b */
    private final String f44266b;

    /* renamed from: c */
    private final String f44267c;

    /* renamed from: d */
    private final String f44268d;

    /* renamed from: e */
    private final String f44269e;

    /* renamed from: f */
    private final String f44270f;

    /* renamed from: g */
    private final String f44271g;

    /* renamed from: h */
    private final String f44272h;

    /* renamed from: i */
    private final String f44273i;

    /* renamed from: j */
    private final String f44274j;

    /* renamed from: k */
    private final String f44275k;

    /* renamed from: l */
    private final String f44276l;

    /* renamed from: m */
    private final String f44277m;

    /* renamed from: n */
    private final String f44278n;

    /* renamed from: o */
    private final String f44279o;

    /* renamed from: p */
    private final Map<String, String> f44280p;

    public ExpandedProductParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f44266b = str;
        this.f44267c = str2;
        this.f44268d = str3;
        this.f44269e = str4;
        this.f44270f = str5;
        this.f44271g = str6;
        this.f44272h = str7;
        this.f44273i = str8;
        this.f44274j = str9;
        this.f44275k = str10;
        this.f44276l = str11;
        this.f44277m = str12;
        this.f44278n = str13;
        this.f44279o = str14;
        this.f44280p = map;
    }

    /* renamed from: a */
    private static boolean m66067a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    private static int m66066b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ExpandedProductParsedResult expandedProductParsedResult = (ExpandedProductParsedResult) obj;
        if (!m66067a(this.f44267c, expandedProductParsedResult.f44267c) || !m66067a(this.f44268d, expandedProductParsedResult.f44268d) || !m66067a(this.f44269e, expandedProductParsedResult.f44269e) || !m66067a(this.f44270f, expandedProductParsedResult.f44270f) || !m66067a(this.f44272h, expandedProductParsedResult.f44272h) || !m66067a(this.f44273i, expandedProductParsedResult.f44273i) || !m66067a(this.f44274j, expandedProductParsedResult.f44274j) || !m66067a(this.f44275k, expandedProductParsedResult.f44275k) || !m66067a(this.f44276l, expandedProductParsedResult.f44276l) || !m66067a(this.f44277m, expandedProductParsedResult.f44277m) || !m66067a(this.f44278n, expandedProductParsedResult.f44278n) || !m66067a(this.f44279o, expandedProductParsedResult.f44279o) || !m66067a(this.f44280p, expandedProductParsedResult.f44280p)) {
            return false;
        }
        return true;
    }

    public String getBestBeforeDate() {
        return this.f44272h;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.f44266b);
    }

    public String getExpirationDate() {
        return this.f44273i;
    }

    public String getLotNumber() {
        return this.f44269e;
    }

    public String getPackagingDate() {
        return this.f44271g;
    }

    public String getPrice() {
        return this.f44277m;
    }

    public String getPriceCurrency() {
        return this.f44279o;
    }

    public String getPriceIncrement() {
        return this.f44278n;
    }

    public String getProductID() {
        return this.f44267c;
    }

    public String getProductionDate() {
        return this.f44270f;
    }

    public String getRawText() {
        return this.f44266b;
    }

    public String getSscc() {
        return this.f44268d;
    }

    public Map<String, String> getUncommonAIs() {
        return this.f44280p;
    }

    public String getWeight() {
        return this.f44274j;
    }

    public String getWeightIncrement() {
        return this.f44276l;
    }

    public String getWeightType() {
        return this.f44275k;
    }

    public int hashCode() {
        return ((((((((((((m66066b(this.f44267c) ^ 0) ^ m66066b(this.f44268d)) ^ m66066b(this.f44269e)) ^ m66066b(this.f44270f)) ^ m66066b(this.f44272h)) ^ m66066b(this.f44273i)) ^ m66066b(this.f44274j)) ^ m66066b(this.f44275k)) ^ m66066b(this.f44276l)) ^ m66066b(this.f44277m)) ^ m66066b(this.f44278n)) ^ m66066b(this.f44279o)) ^ m66066b(this.f44280p);
    }
}
