package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class TelResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public TelParsedResult parse(Result result) {
        String str;
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.startsWith("tel:") || m66061c.startsWith("TEL:")) {
            if (m66061c.startsWith("TEL:")) {
                str = "tel:" + m66061c.substring(4);
            } else {
                str = m66061c;
            }
            int indexOf = m66061c.indexOf(63, 4);
            return new TelParsedResult(indexOf < 0 ? m66061c.substring(4) : m66061c.substring(4, indexOf), str, null);
        }
        return null;
    }
}
