package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class AddressBookDoCoMoResultParser extends AbstractDoCoMoResultParser {
    /* renamed from: o */
    private static String m66075o(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String[] m66078m;
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.startsWith("MECARD:") && (m66078m = AbstractDoCoMoResultParser.m66078m("N:", m66061c, true)) != null) {
            String m66075o = m66075o(m66078m[0]);
            String m66077n = AbstractDoCoMoResultParser.m66077n("SOUND:", m66061c, true);
            String[] m66078m2 = AbstractDoCoMoResultParser.m66078m("TEL:", m66061c, true);
            String[] m66078m3 = AbstractDoCoMoResultParser.m66078m("EMAIL:", m66061c, true);
            String m66077n2 = AbstractDoCoMoResultParser.m66077n("NOTE:", m66061c, false);
            String[] m66078m4 = AbstractDoCoMoResultParser.m66078m("ADR:", m66061c, true);
            String m66077n3 = AbstractDoCoMoResultParser.m66077n("BDAY:", m66061c, true);
            return new AddressBookParsedResult(ResultParser.m66056h(m66075o), null, m66077n, m66078m2, null, m66078m3, null, null, m66077n2, m66078m4, null, AbstractDoCoMoResultParser.m66077n("ORG:", m66061c, true), !ResultParser.m66060d(m66077n3, 8) ? null : m66077n3, null, AbstractDoCoMoResultParser.m66078m("URL:", m66061c, true), null);
        }
        return null;
    }
}
