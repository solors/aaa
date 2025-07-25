package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ISBNParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.f44286b = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f44286b;
    }

    public String getISBN() {
        return this.f44286b;
    }
}
