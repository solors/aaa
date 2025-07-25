package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SMSMMSResultParser extends ResultParser {
    /* renamed from: m */
    private static void m66051m(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public SMSParsedResult parse(Result result) {
        boolean z;
        String str;
        String substring;
        String m66061c = ResultParser.m66061c(result);
        String str2 = null;
        if (!m66061c.startsWith("sms:") && !m66061c.startsWith("SMS:") && !m66061c.startsWith("mms:") && !m66061c.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m66054j = ResultParser.m66054j(m66061c);
        if (m66054j == null || m66054j.isEmpty()) {
            z = false;
            str = null;
        } else {
            str2 = m66054j.get("subject");
            str = m66054j.get("body");
            z = true;
        }
        int indexOf = m66061c.indexOf(63, 4);
        if (indexOf >= 0 && z) {
            substring = m66061c.substring(4, indexOf);
        } else {
            substring = m66061c.substring(4);
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                m66051m(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m66051m(arrayList, arrayList2, substring.substring(i2));
                return new SMSParsedResult((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
        }
    }
}
