package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class BookmarkDoCoMoResultParser extends AbstractDoCoMoResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (text.startsWith("MEBKM:")) {
            String m66077n = AbstractDoCoMoResultParser.m66077n("TITLE:", text, true);
            String[] m66078m = AbstractDoCoMoResultParser.m66078m("URL:", text, true);
            if (m66078m == null) {
                return null;
            }
            String str = m66078m[0];
            if (URIResultParser.m66048m(str)) {
                return new URIParsedResult(str, m66077n);
            }
            return null;
        }
        return null;
    }
}
