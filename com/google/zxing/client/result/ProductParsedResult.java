package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ProductParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44289b;

    /* renamed from: c */
    private final String f44290c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.f44289b = str;
        this.f44290c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f44289b;
    }

    public String getNormalizedProductID() {
        return this.f44290c;
    }

    public String getProductID() {
        return this.f44289b;
    }
}
