package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class ISBNResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public ISBNParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.EAN_13) {
            return null;
        }
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.length() != 13) {
            return null;
        }
        if (m66061c.startsWith("978") || m66061c.startsWith("979")) {
            return new ISBNParsedResult(m66061c);
        }
        return null;
    }
}
