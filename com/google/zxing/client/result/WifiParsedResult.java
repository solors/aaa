package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class WifiParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44330b;

    /* renamed from: c */
    private final String f44331c;

    /* renamed from: d */
    private final String f44332d;

    /* renamed from: e */
    private final boolean f44333e;

    /* renamed from: f */
    private final String f44334f;

    /* renamed from: g */
    private final String f44335g;

    /* renamed from: h */
    private final String f44336h;

    /* renamed from: i */
    private final String f44337i;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public String getAnonymousIdentity() {
        return this.f44335g;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(80);
        ParsedResult.maybeAppend(this.f44330b, sb2);
        ParsedResult.maybeAppend(this.f44331c, sb2);
        ParsedResult.maybeAppend(this.f44332d, sb2);
        ParsedResult.maybeAppend(Boolean.toString(this.f44333e), sb2);
        return sb2.toString();
    }

    public String getEapMethod() {
        return this.f44336h;
    }

    public String getIdentity() {
        return this.f44334f;
    }

    public String getNetworkEncryption() {
        return this.f44331c;
    }

    public String getPassword() {
        return this.f44332d;
    }

    public String getPhase2Method() {
        return this.f44337i;
    }

    public String getSsid() {
        return this.f44330b;
    }

    public boolean isHidden() {
        return this.f44333e;
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, null, null, null, null);
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.f44330b = str2;
        this.f44331c = str;
        this.f44332d = str3;
        this.f44333e = z;
        this.f44334f = str4;
        this.f44335g = str5;
        this.f44336h = str6;
        this.f44337i = str7;
    }
}
