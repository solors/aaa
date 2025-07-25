package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String substring;
        String m66057g;
        String m66061c = ResultParser.m66061c(result);
        if (!m66061c.startsWith("WIFI:") || (m66057g = ResultParser.m66057g("S:", (substring = m66061c.substring(5)), ';', false)) == null || m66057g.isEmpty()) {
            return null;
        }
        String m66057g2 = ResultParser.m66057g("P:", substring, ';', false);
        String m66057g3 = ResultParser.m66057g("T:", substring, ';', false);
        if (m66057g3 == null) {
            m66057g3 = "nopass";
        }
        return new WifiParsedResult(m66057g3, m66057g, m66057g2, Boolean.parseBoolean(ResultParser.m66057g("H:", substring, ';', false)), ResultParser.m66057g("I:", substring, ';', false), ResultParser.m66057g("A:", substring, ';', false), ResultParser.m66057g("E:", substring, ';', false), ResultParser.m66057g("H:", substring, ';', false));
    }
}
