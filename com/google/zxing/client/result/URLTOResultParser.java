package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class URLTOResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        int indexOf;
        String m66061c = ResultParser.m66061c(result);
        if ((m66061c.startsWith("urlto:") || m66061c.startsWith("URLTO:")) && (indexOf = m66061c.indexOf(58, 6)) >= 0) {
            return new URIParsedResult(m66061c.substring(indexOf + 1), indexOf > 6 ? m66061c.substring(6, indexOf) : null);
        }
        return null;
    }
}
