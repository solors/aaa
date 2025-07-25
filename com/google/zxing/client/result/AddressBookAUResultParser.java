package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class AddressBookAUResultParser extends ResultParser {
    /* renamed from: m */
    private static String[] m66076m(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String m66057g = ResultParser.m66057g(str + i2 + ':', str2, '\r', z);
            if (m66057g == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(m66057g);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.contains("MEMORY") && m66061c.contains("\r\n")) {
            String m66057g = ResultParser.m66057g("NAME1:", m66061c, '\r', true);
            String m66057g2 = ResultParser.m66057g("NAME2:", m66061c, '\r', true);
            String[] m66076m = m66076m("TEL", 3, m66061c, true);
            String[] m66076m2 = m66076m("MAIL", 3, m66061c, true);
            String m66057g3 = ResultParser.m66057g("MEMORY:", m66061c, '\r', false);
            String m66057g4 = ResultParser.m66057g("ADD:", m66061c, '\r', true);
            return new AddressBookParsedResult(ResultParser.m66056h(m66057g), null, m66057g2, m66076m, null, m66076m2, null, null, m66057g3, m66057g4 != null ? new String[]{m66057g4} : null, null, null, null, null, null, null);
        }
        return null;
    }
}
