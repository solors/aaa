package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import java.util.List;

/* loaded from: classes5.dex */
public final class VEventResultParser extends ResultParser {
    /* renamed from: m */
    private static String m66037m(CharSequence charSequence, String str, boolean z) {
        List<String> m66044p = VCardResultParser.m66044p(charSequence, str, z, false);
        if (m66044p != null && !m66044p.isEmpty()) {
            return m66044p.get(0);
        }
        return null;
    }

    /* renamed from: n */
    private static String[] m66036n(CharSequence charSequence, String str, boolean z) {
        List<List<String>> m66043q = VCardResultParser.m66043q(charSequence, str, z, false);
        if (m66043q != null && !m66043q.isEmpty()) {
            int size = m66043q.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = m66043q.get(i).get(0);
            }
            return strArr;
        }
        return null;
    }

    /* renamed from: o */
    private static String m66035o(String str) {
        if (str != null) {
            if (str.startsWith(MailTo.MAILTO_SCHEME) || str.startsWith("MAILTO:")) {
                return str.substring(7);
            }
            return str;
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public CalendarParsedResult parse(Result result) {
        double parseDouble;
        double parseDouble2;
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String m66037m = m66037m("SUMMARY", m66061c, true);
        String m66037m2 = m66037m("DTSTART", m66061c, true);
        if (m66037m2 == null) {
            return null;
        }
        String m66037m3 = m66037m("DTEND", m66061c, true);
        String m66037m4 = m66037m("DURATION", m66061c, true);
        String m66037m5 = m66037m(CodePackage.LOCATION, m66061c, true);
        String m66035o = m66035o(m66037m("ORGANIZER", m66061c, true));
        String[] m66036n = m66036n("ATTENDEE", m66061c, true);
        if (m66036n != null) {
            for (int i = 0; i < m66036n.length; i++) {
                m66036n[i] = m66035o(m66036n[i]);
            }
        }
        String m66037m6 = m66037m(ShareConstants.DESCRIPTION, m66061c, true);
        String m66037m7 = m66037m("GEO", m66061c, true);
        if (m66037m7 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = m66037m7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(m66037m7.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(m66037m7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new CalendarParsedResult(m66037m, m66037m2, m66037m3, m66037m4, m66037m5, m66035o, m66036n, m66037m6, parseDouble, parseDouble2);
    }
}
