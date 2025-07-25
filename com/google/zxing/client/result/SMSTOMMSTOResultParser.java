package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class SMSTOMMSTOResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public SMSParsedResult parse(Result result) {
        String str;
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.startsWith("smsto:") || m66061c.startsWith("SMSTO:") || m66061c.startsWith("mmsto:") || m66061c.startsWith("MMSTO:")) {
            String substring = m66061c.substring(6);
            int indexOf = substring.indexOf(58);
            if (indexOf >= 0) {
                str = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str = null;
            }
            return new SMSParsedResult(substring, (String) null, (String) null, str);
        }
        return null;
    }
}
