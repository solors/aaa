package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TelParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44299b;

    /* renamed from: c */
    private final String f44300c;

    /* renamed from: d */
    private final String f44301d;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f44299b = str;
        this.f44300c = str2;
        this.f44301d = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(20);
        ParsedResult.maybeAppend(this.f44299b, sb2);
        ParsedResult.maybeAppend(this.f44301d, sb2);
        return sb2.toString();
    }

    public String getNumber() {
        return this.f44299b;
    }

    public String getTelURI() {
        return this.f44300c;
    }

    public String getTitle() {
        return this.f44301d;
    }
}
