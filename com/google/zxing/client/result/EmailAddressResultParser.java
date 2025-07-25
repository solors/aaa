package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.google.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class EmailAddressResultParser extends ResultParser {

    /* renamed from: e */
    private static final Pattern f44264e = Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String m66061c = ResultParser.m66061c(result);
        if (!m66061c.startsWith(MailTo.MAILTO_SCHEME) && !m66061c.startsWith("MAILTO:")) {
            if (EmailDoCoMoResultParser.m66068o(m66061c)) {
                return new EmailAddressParsedResult(m66061c);
            }
            return null;
        }
        String substring = m66061c.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        try {
            String m66052l = ResultParser.m66052l(substring);
            String[] split = !m66052l.isEmpty() ? f44264e.split(m66052l) : null;
            Map<String, String> m66054j = ResultParser.m66054j(m66061c);
            if (m66054j != null) {
                if (split == null && (str3 = m66054j.get("to")) != null) {
                    split = f44264e.split(str3);
                }
                String str4 = m66054j.get("cc");
                String[] split2 = str4 != null ? f44264e.split(str4) : null;
                String str5 = m66054j.get("bcc");
                String[] split3 = str5 != null ? f44264e.split(str5) : null;
                str2 = m66054j.get("body");
                strArr = split;
                strArr3 = split3;
                strArr2 = split2;
                str = m66054j.get("subject");
            } else {
                strArr = split;
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new EmailAddressParsedResult(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
