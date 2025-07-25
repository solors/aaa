package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class TextParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44302b;

    /* renamed from: c */
    private final String f44303c;

    public TextParsedResult(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.f44302b = str;
        this.f44303c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f44302b;
    }

    public String getLanguage() {
        return this.f44303c;
    }

    public String getText() {
        return this.f44302b;
    }
}
