package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.oned.UPCEReader;

/* loaded from: classes5.dex */
public final class ProductResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public ProductParsedResult parse(Result result) {
        BarcodeFormat barcodeFormat = result.getBarcodeFormat();
        if (barcodeFormat == BarcodeFormat.UPC_A || barcodeFormat == BarcodeFormat.UPC_E || barcodeFormat == BarcodeFormat.EAN_8 || barcodeFormat == BarcodeFormat.EAN_13) {
            String m66061c = ResultParser.m66061c(result);
            if (ResultParser.m66060d(m66061c, m66061c.length())) {
                return new ProductParsedResult(m66061c, (barcodeFormat == BarcodeFormat.UPC_E && m66061c.length() == 8) ? UPCEReader.convertUPCEtoUPCA(m66061c) : m66061c);
            }
            return null;
        }
        return null;
    }
}
