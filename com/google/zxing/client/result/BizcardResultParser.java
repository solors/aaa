package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BizcardResultParser extends AbstractDoCoMoResultParser {
    /* renamed from: o */
    private static String m66074o(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* renamed from: p */
    private static String[] m66073p(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.startsWith("BIZCARD:")) {
            String m66074o = m66074o(AbstractDoCoMoResultParser.m66077n("N:", m66061c, true), AbstractDoCoMoResultParser.m66077n("X:", m66061c, true));
            String m66077n = AbstractDoCoMoResultParser.m66077n("T:", m66061c, true);
            String m66077n2 = AbstractDoCoMoResultParser.m66077n("C:", m66061c, true);
            return new AddressBookParsedResult(ResultParser.m66056h(m66074o), null, null, m66073p(AbstractDoCoMoResultParser.m66077n("B:", m66061c, true), AbstractDoCoMoResultParser.m66077n("M:", m66061c, true), AbstractDoCoMoResultParser.m66077n("F:", m66061c, true)), null, ResultParser.m66056h(AbstractDoCoMoResultParser.m66077n("E:", m66061c, true)), null, null, null, AbstractDoCoMoResultParser.m66078m("A:", m66061c, true), null, m66077n2, null, m66077n, null, null);
        }
        return null;
    }
}
